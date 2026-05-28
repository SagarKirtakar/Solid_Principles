package OpenClosedPrinciple.Solution;

public class Test {
    public static void main(String[] args) {
        Payment p1 = new CardPayment();
        p1.pay();

        Payment p2 = new UPIPayment();
        p2.pay();
    }
}
