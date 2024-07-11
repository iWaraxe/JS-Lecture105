package org.example.section4.example2;

import org.junit.jupiter.api.Test;
import static org.mockito.Mockito.*;

public class PaymentProcessorTest {

    @Test
    public void whenProcessingPayment_thenValidateAndLog() {
        PaymentProcessor paymentProcessor = spy(new PaymentProcessor());

        PaymentDetails mockPaymentDetails = mock(PaymentDetails.class);

        // Assume validation is correct but don't actually process the payment
        doReturn(true).when(paymentProcessor).validatePaymentDetails(mockPaymentDetails);
        // Assuming processPayment now explicitly calls logPayment due to the setup
        doNothing().when(paymentProcessor).logPayment(mockPaymentDetails);

        paymentProcessor.processPayment(mockPaymentDetails);

        // Verify that validation and logging methods were indeed called
        verify(paymentProcessor).validatePaymentDetails(mockPaymentDetails);
        verify(paymentProcessor).logPayment(mockPaymentDetails);
    }
}
