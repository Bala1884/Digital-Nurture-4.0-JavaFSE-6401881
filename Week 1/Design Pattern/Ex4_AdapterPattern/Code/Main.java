public class Main {
    public static void main(String[] args) {
        PaymentProcessor processor = new OldGatewayAdapter(new OldGateway());
        processor.processPayment(500.0);
    }
}