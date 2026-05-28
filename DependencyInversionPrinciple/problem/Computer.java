package DependencyInversionPrinciple.problem;

/*
Problem:
Computer are tightly coupled with WiredKeyboard .
*/
public class Computer {
    public static void main(String[] args) {
        WiredKeyboard wk = new WiredKeyboard();
    }
    
}
