package problem2;

import java.util.ArrayList;

public class MainLoanSystem {
    public static void main(String[] args){
        Loan loan1 = new Loan("15 years fixed",3.05, new ArrayList<LoanObserver>());
        Loan loan2 = new Loan("20 years variable", 2.85, new ArrayList<LoanObserver>());
        MSDailyFinances msDailyFinances = new MSDailyFinances(loan1, 0.00, loan1.getInterest());
        YFinances yFinances = new YFinances(loan2.getInterest());
        loan1.registerObserver(msDailyFinances);
        loan2.registerObserver(yFinances);
        loan1.setInterest(2.95);
        loan1.removeObserver(msDailyFinances);
        loan1.setInterest(3.00);
        System.out.println("Working with loan 2");
        loan2.setInterest(2.98);
        loan2.removeObserver(yFinances);
        loan2.setInterest(3.00);

    }
}
