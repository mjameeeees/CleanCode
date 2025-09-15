package StructuralPattern.ProxyPattern;

public class ServiceProxy implements IService {
    private RealService realService;  // initially null

    @Override
    public void request() {
        if (realService == null) {
            System.out.println("ServiceProxy: Creating RealService lazily");
            realService = new RealService();
        }
        System.out.println("ServiceProxy: Pre‑processing (e.g. logging, access control)");
        realService.request();
        System.out.println("ServiceProxy: Post‑processing (if needed)");
    }
}
