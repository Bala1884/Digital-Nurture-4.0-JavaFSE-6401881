public class OldGatewayAdapter implements PaymentProcessor {
    private OldGateway oldGateway;

    public OldGatewayAdapter(OldGateway oldGateway) {
        this.oldGateway = oldGateway;
    }

    public void processPayment(double amount) {
        oldGateway.makePayment(amount);
    }
}