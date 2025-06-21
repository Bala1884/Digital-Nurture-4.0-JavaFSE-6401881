public class Main {
    public static void main(String[] args) {
        PaymentContext context = new PaymentContext(new CreditCardPayment());
        context.executePayment(300.0);

        context = new PaymentContext(new PayPalPayment());
        context.executePayment(450.0);
    }
}