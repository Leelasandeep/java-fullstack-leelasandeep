import java.util.Scanner;

public class Loaneligibility {
    public static void main(String args[])
    {
        int current_age, current_salary, current_emi, disposable_income;
        Scanner st = new Scanner(System.in);
        System.out.println("Enter Current Age: ");
        current_age = st.nextInt();
        System.out.println("Enter Current Salary: ");
        current_salary = st.nextInt();
        System.out.println("Enter Current Emi: ");
        current_emi = st.nextInt();
        disposable_income = current_salary-current_emi;
        if(current_age>=25 && current_age<=60 && disposable_income>=15000)
        {
            System.out.println("Person Eligible for the Loan");
        }
        else if(current_age>=60 && disposable_income>=25000)
        {
            System.out.println("Person Eligible for the Loan");
        }
        else if( current_age < 25 && disposable_income>=10000)
        {
            System.out.println("Person Eligible for the Loan");
        }
        else
        {
            System.out.println("Person Not Eligible for Loan");
        }
    }
}
