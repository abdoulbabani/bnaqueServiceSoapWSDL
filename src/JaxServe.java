import ws.BanqueService;

import javax.xml.ws.Endpoint;

public class JaxServe {

    public static void main(String[] args) {
        String url="http://0.0.0.0:8989/";
        Endpoint.publish(url, new BanqueService());
        System.out.println("web service deployé:"+url);
    }
}
