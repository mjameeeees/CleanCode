package StructuralPattern.DecoratorPattern.ConcreteDecorator;
import StructuralPattern.DecoratorPattern.BaseNotifierDecorator.BaseNotifierDecorator;
import StructuralPattern.DecoratorPattern.INotifier.INotifier;

public class SMSNotifier extends BaseNotifierDecorator {
    private String phoneNumber;

    public SMSNotifier(INotifier notifier, String phoneNumber){
        super(notifier);
        this.phoneNumber = phoneNumber;
    }

    @Override
    public void send(String msg){
        super.send(msg);
        System.out.println("Sending SMS to " + phoneNumber + ": " + msg);
    }

}
