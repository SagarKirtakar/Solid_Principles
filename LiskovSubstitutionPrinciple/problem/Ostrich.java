package LiskovSubstitutionPrinciple.problem;

/*
Problem:

Ostrich cannot fly.

But it broke the Bird behavior.
*/

public class Ostrich extends Bird{
    
    void fly() {
        throw new UnsupportedOperationException();
    }
}
