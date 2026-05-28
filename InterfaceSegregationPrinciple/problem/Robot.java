package InterfaceSegregationPrinciple.problem;

public class Robot implements Worker{

    @Override
    public void work() {
       System.out.println("Robot can work easily..");
    }

    @Override
    public void eat() {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'eat'");
    }
// The robot doesn't know how to eat..?

}
