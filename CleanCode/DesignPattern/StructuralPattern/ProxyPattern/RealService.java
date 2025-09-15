package StructuralPattern.ProxyPattern;

public class RealService implements IService {
        public RealService() {
        // heavy initialization
        heavyInitialization();
    }

    private void heavyInitialization() {
        System.out.println("RealService: Performing heavy initialization...");
        // simulate time/expense
        try {
            Thread.sleep(2000);
        } catch (InterruptedException e) {
            // ignore for simplicity
        }
    }

    @Override
    public void request() {
        System.out.println("RealService: Handling request.");
    }
}
