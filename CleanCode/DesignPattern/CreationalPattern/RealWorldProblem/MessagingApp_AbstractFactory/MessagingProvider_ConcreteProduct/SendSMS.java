package RealWorldProblem.MessagingApp_AbstractFactory.MessagingProvider_ConcreteProduct;
import RealWorldProblem.MessagingApp_AbstractFactory.MessageType_Product.Message;

public class SendSMS implements Message {
    @Override
    public void sendMessage(String messageContent) {
        System.out.println("Sending SMS: " + messageContent);
    }
}
