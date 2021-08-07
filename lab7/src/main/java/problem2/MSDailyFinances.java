package problem2;

import java.util.Objects;

public class MSDailyFinances implements LoanObserver{
    private Loan trackedLoan;
    private Double previousInterest;
    private Double currentInterest;

    public MSDailyFinances(Loan trackedLoan, Double previousInterest, Double currentInterest) {
        this.trackedLoan = trackedLoan;
        this.previousInterest = previousInterest;
        this.currentInterest = currentInterest;
    }

    public Loan getTrackedLoan() {
        return trackedLoan;
    }

    public Double getPreviousInterestt() {
        return previousInterest;
    }

    public Double getCurrentInterest() {
        return currentInterest;
    }


    public void update(Loan loan) {
        if(this.trackedLoan.equals(loan)){
            this.previousInterest = this.currentInterest;
            this.currentInterest = loan.getInterest();
            System.out.println("Loan interest change alert - updated interest: " + this.currentInterest + "rate of change" +
                    this.currentInterest / this.previousInterest);

        }
        else throw new IllegalArgumentException("Not a tracked loan");


    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        MSDailyFinances that = (MSDailyFinances) o;
        return Objects.equals(trackedLoan, that.trackedLoan) && Objects.equals(previousInterest, that.previousInterest) && Objects.equals(currentInterest, that.currentInterest);
    }

    @Override
    public int hashCode() {
        return Objects.hash(trackedLoan, previousInterest, currentInterest);
    }

    @Override
    public String toString() {
        return "MSDailyFinances{" +
                "trackedLoan=" + trackedLoan +
                ", privateInterest=" + previousInterest +
                ", currentInterest=" + currentInterest +
                '}';
    }
}
