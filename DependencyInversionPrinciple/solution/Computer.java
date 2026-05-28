package DependencyInversionPrinciple.solution;

public class Computer {
    Keyboard keyboard;

    Computer(Keyboard keyboard) {
        this.keyboard = keyboard;
    }
}
