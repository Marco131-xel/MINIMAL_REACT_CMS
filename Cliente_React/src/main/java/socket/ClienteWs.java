package socket;

import java.net.URI;
import main.Interfaz;
import org.java_websocket.client.WebSocketClient;
import org.java_websocket.handshake.ServerHandshake;

/**
 *
 * @author marco
 */
public class ClienteWs extends WebSocketClient {
    
    private Interfaz interfaz;

    public ClienteWs(URI serverUri, Interfaz interfaz) {
        super(serverUri);
        this.interfaz = interfaz;
    }

    @Override
    public void onOpen(ServerHandshake sh) {
        System.out.println("Conectado al servidor WebSocket");
        interfaz.agregarTexto("\t\t SERVIDOR ACTIVO \n");
    }

    @Override
    public void onMessage(String message) {
        System.out.println("Mensaje reciido del servidor: " + message);
        interfaz.agregarTexto(message + "\n");
        interfaz.recibirMensaje(message);
    }

    @Override
    public void onClose(int code, String reason, boolean remote) {
        System.out.println("conexion cerrada: " + reason);
        interfaz.agregarTexto("CONEXION CERRADA: " + reason);
    }

    @Override
    public void onError(Exception ex) {
        ex.printStackTrace();
        interfaz.agregarTexto("Error: " + ex.getMessage() + "\n");
    }
    
    public void enviarMensajes(String mensaje) {
        if (this.isOpen()) {
            this.send(mensaje);
            System.out.println("Mensaje enviado: " + mensaje);
        } else {
            System.out.println("No hay conexion con el servidor");
            interfaz.agregarTexto("No hay conexion con el servidor");
        }
    }
    
}
