package InterfaceSegregationPrinciple.solution;

public class Humans implements Workable, Eatable  {

    @Override
    public void eat() {
        System.out.println("eating");
    }

    @Override
    public void work() {
        System.out.println("working");
    }
    
}
