package OpenClosedPrinciple.Solution;

// Now adding a new payment method is easy:

public class PayPalPayment implements Payment {

    @Override
    public void pay() {
       System.out.println("Paypal Payment");
    }
    
}
