package payment;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CreditCardPaymentStrategyTest {

    @BeforeEach
    void setUp() {
        CreditCardPaymentStrategy payment = new CreditCardPaymentStrategy();
    }

    @Test
    void pay() {
        assertTrue(payment.pay(13.2));
    }
}