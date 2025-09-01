package SingletonPattern;

public class Singleton {
    private static Singleton instance;
    private Singleton(){
        System.out.println("New object initiallizing");
    }

    public static Singleton getinstance(){
        if(instance == null){
            instance = new Singleton();
        }
        return instance;
    }

    public void showMessage(String user, int amount){
       System.out.println("[Log]: " + user + " Withdraw " + amount); 
    }
}
