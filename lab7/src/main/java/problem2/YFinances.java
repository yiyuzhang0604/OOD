package problem2;

public class YFinances implements LoanObserver{
    private Double currentInterest;

    public YFinances(Double currentInterest) {
        this.currentInterest = currentInterest;
    }

    @Override
    public void update(Loan observableLoan) {
        System.out.println("YFinances - updated interest rate - from" + this.currentInterest + "to" + observableLoan.getInterest());
        this.currentInterest = observableLoan.getInterest();


    }
}
