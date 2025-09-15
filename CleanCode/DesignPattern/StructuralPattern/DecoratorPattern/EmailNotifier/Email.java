package StructuralPattern.DecoratorPattern.EmailNotifier;

import StructuralPattern.DecoratorPattern.INotifier.INotifier;

public class Email implements INotifier {
    String email;

    public Email(String email){
        this.email = email;
    }

    @Override
    public void send(String msg){
        System.out.println("Sending EMAIL to " + email + ": " + msg);
    }
}
