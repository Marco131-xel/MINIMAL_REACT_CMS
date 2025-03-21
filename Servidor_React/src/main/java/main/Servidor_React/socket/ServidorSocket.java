package main.Servidor_React.socket;

import java.util.Collections;
import java.util.HashSet;
import java.util.Set;
import main.Servidor_React.interprete.Shttp;
import org.springframework.web.socket.TextMessage;
import org.springframework.web.socket.WebSocketSession;
import org.springframework.web.socket.handler.TextWebSocketHandler;

/**
 *
 * @author marco
 */
public class ServidorSocket extends TextWebSocketHandler {

    private static final Set<WebSocketSession> sesiones = Collections.synchronizedSet(new HashSet<>());
    Shttp shttp = new Shttp();

    @Override
    public void afterConnectionEstablished(WebSocketSession session) throws Exception {
        sesiones.add(session);
        System.out.println("Nueva conexion: " + session.getId());
    }

    @Override
    protected void handleTextMessage(WebSocketSession session, TextMessage message) throws Exception {
        String recibido = message.getPayload();
        System.out.println("Mensaje recibido: " + recibido);

        String respuesta;
        if (recibido.startsWith("post sitio")) {
            respuesta = "SUCCESS\nEl sitio fue creado correctamente.";
            shttp.ejecutar(recibido);
        } else {
            respuesta = "ERROR\nComando no reconocido.";
        }

        for (WebSocketSession s : sesiones) {
            if (s.isOpen()) {
                s.sendMessage(new TextMessage("Cliente: " + recibido));
                s.sendMessage(new TextMessage("Servidor: " + respuesta));
            }
        }
    }

    @Override
    public void afterConnectionClosed(WebSocketSession session, org.springframework.web.socket.CloseStatus status) throws Exception {
        sesiones.remove(session);
        System.out.println("Conexion cerrada: " + session.getId());
    }

}
