package StructuralPattern.ProxyPattern;


public class Client {
    public static void main(String[] args) {
        // Client works only with the Service interface, so can use proxy
        IService service = new ServiceProxy();
        System.out.println("Client: calling request first time:");
        service.request();
        System.out.println("\nClient: calling request second time:");
        service.request();        
    }

}
