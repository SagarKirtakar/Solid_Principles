package SingleResponsibilityPrinciple.Problem;

// This is the wrong approach 

// One class should have only one responsibility.

public class Employee {
    
    void CalculateSalary() {
        System.out.println("Calculating salary");
    }

    void SavingToDatabase() {
        System.out.println("Saving to datbase");
    }

    void SendingEmail() {
        System.out.println("Sending email");
    }

/*Problem:

It's handling salary too

It's handling the database too

It's handling email too

If the email logic changes, the Employee class has to be modified. */


}
