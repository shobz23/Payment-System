public class Main {
    public static void main(String[] args) {
        // Create an instance of the third-party PayPal class
        PayPal payPal = new PayPal();

        // Use the PayPalAdapter to integrate PayPal into the Payment System
        PaymentGateway paymentGateway = new PayPalAdapter(payPal);

        // Make a payment using the adapter
        paymentGateway.makePayment(100.00);  // Output: Payment made through PayPal: $100.00
    }
}
