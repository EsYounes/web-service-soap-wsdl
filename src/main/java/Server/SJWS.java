package Server;

import jakarta.xml.ws.Endpoint;
import ws.BanqueService;

public class SJWS {
    public static void main(String[] args) {
        String url="http://localhost:8586/";
        Endpoint.publish(url,new BanqueService());
        System.out.println(url);
    }
}
