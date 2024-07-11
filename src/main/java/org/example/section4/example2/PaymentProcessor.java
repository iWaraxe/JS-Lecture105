package org.example.section4.example2;

public class PaymentProcessor {
    public boolean validatePaymentDetails(PaymentDetails paymentDetails) {
        // Complex validation logic
        return true; // Simplified for example
    }

    public void processPayment(PaymentDetails paymentDetails) {
        if (validatePaymentDetails(paymentDetails)) {
            // Assuming this is where you want the logPayment to be called
            logPayment(paymentDetails);
            // Other processing logic...
        }
    }

    public void logPayment(PaymentDetails paymentDetails) {
        // Log payment details
    }
}