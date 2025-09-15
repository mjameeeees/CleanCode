package StructuralPattern.DecoratorPattern.ConcreteDecorator;

import StructuralPattern.DecoratorPattern.BaseNotifierDecorator.BaseNotifierDecorator;
import StructuralPattern.DecoratorPattern.INotifier.INotifier;

public class FacebookNotifier extends BaseNotifierDecorator {
    private String fbAccount;
    
    public FacebookNotifier(INotifier notifier, String fbAccount){
        super(notifier);
        this.fbAccount = fbAccount;
    }

    @Override
    public void send(String msg){
        super.send(msg);
        System.out.println("Sending Facebook Notification to " + fbAccount + ": " + msg);

    }

}
