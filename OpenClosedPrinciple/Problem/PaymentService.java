package OpenClosedPrinciple.Problem;

// Problem: 

class PaymentService {

    void pay(String type) {
        if(type.equals("UPI")) {
            System.out.println("UPI payment");
        }else if(type.equals("CARD")){
            System.out.println("Card Payment");
        }
    }

/*
If you want to add PayPal?
Then you'll have to modify the class.
*/

}
