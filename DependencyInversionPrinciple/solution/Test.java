package DependencyInversionPrinciple.solution;

public class Test {
    public static void main(String[] args) {

        WiredKeyboard wired = new WiredKeyboard();

        WirelessKeyboard wireless = new WirelessKeyboard();

        // It Became Fixable.....................

        Computer comp = new Computer(wireless); 

        

    }
}
