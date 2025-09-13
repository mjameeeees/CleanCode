package SingletonPattern;
public class designpaattern {

    public static void main(String[] args) {
        Singleton a = Singleton.getinstance();
        Singleton b = Singleton.getinstance();
        
        a.showMessage("Mark James" , 10000);
        a.showMessage("Queenie Ambulo" , 20000);
        System.out.println(a);
        System.out.println(b);

    }
}