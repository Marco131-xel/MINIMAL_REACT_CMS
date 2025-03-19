package socket;

import java.net.URI;
import org.java_websocket.client.WebSocketClient;
import org.java_websocket.handshake.ServerHandshake;

/**
 *
 * @author marco
 */
public class ClienteWs extends WebSocketClient {

    public ClienteWs(URI serverUri) {
        super(serverUri);
    }

    @Override
    public void onOpen(ServerHandshake sh) {
        System.out.println("Conectado al servidor WebSocket");
    }

    @Override
    public void onMessage(String message) {
        System.out.println("Mensaje reciido del servidor: " + message);
    }

    @Override
    public void onClose(int code, String reason, boolean remote) {
        System.out.println("Conexion cerrada: " + reason);
    }

    @Override
    public void onError(Exception ex) {
        ex.printStackTrace();
    }
    
    public void enviarMensajes(String mensaje) {
        if (this.isOpen()) {
            this.send(mensaje);
            System.out.println("Mensaje enviado: " + mensaje);
        } else {
            System.out.println("No hay conexion con el servidor");
        }
    }
    
}
