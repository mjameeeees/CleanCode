package StructuralPattern.DecoratorPattern.BaseNotifierDecorator;

import StructuralPattern.DecoratorPattern.INotifier.INotifier;

public class BaseNotifierDecorator implements INotifier {
    private INotifier wrappee;

    public BaseNotifierDecorator(INotifier notifier){
        this.wrappee = notifier;
    }

    @Override
    public void send(String msg){
        wrappee.send(msg);
    }

}
