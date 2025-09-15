package StructuralPattern.DecoratorPattern;

import StructuralPattern.DecoratorPattern.ConcreteDecorator.FacebookNotifier;
import StructuralPattern.DecoratorPattern.ConcreteDecorator.SMSNotifier;
import StructuralPattern.DecoratorPattern.EmailNotifier.Email;
import StructuralPattern.DecoratorPattern.INotifier.INotifier;

public class Client {
    public static void main(String[] args) {
        INotifier notifier = new Email("dinongmarkjames@gmail.com");
        INotifier multiNotifier = new FacebookNotifier( new SMSNotifier(notifier, "09958493756") , "Mark James Dinong");
        multiNotifier.send("Server Shutdown");
    }
}
