package ws;

import jakarta.xml.ws.Endpoint;

public class ServerJWS {
    public static void main(String[] args) {
        String URL = "http://0.0.0.0:5560/";
        Endpoint.publish(URL, new BanqueService());
        System.out.println("le depolyement est sur le port "+URL);
    }
}
