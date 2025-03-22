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
    private static ServidorSocket inst;
    Shttp shttp = new Shttp();
    
    public ServidorSocket(){
        inst = this;
    }
    
    public static ServidorSocket getInst(){
        return inst;
    }

    @Override
    public void afterConnectionEstablished(WebSocketSession session) throws Exception {
        sesiones.add(session);
        System.out.println("Nueva conexion: " + session.getId());
    }

    @Override
    protected void handleTextMessage(WebSocketSession session, TextMessage message) throws Exception {
        String recibido = message.getPayload();
        System.out.println("Mensaje recibido: " + recibido);
        
        enviarMensajes("Cliente: " + recibido);
        shttp.ejecutar(recibido);
    }

    @Override
    public void afterConnectionClosed(WebSocketSession session, org.springframework.web.socket.CloseStatus status) throws Exception {
        sesiones.remove(session);
        System.out.println("Conexion cerrada: " + session.getId());
    }
    
    public void enviarMensajes(String mensaje){
        for (WebSocketSession s : sesiones) {
            if (s.isOpen()) {
                try {
                    s.sendMessage(new TextMessage(mensaje));
                } catch (Exception e) {
                    System.out.println("Error al enviar mensaje: " + e.getMessage());
                }
            }
        }
    }

}
