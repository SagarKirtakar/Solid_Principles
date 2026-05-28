package LiskovSubstitutionPrinciple.Solution;

public class Sparrow extends Bird implements Flyable {

    @Override
    public void fly() {
        System.out.println("Flying");
    }
    
}
