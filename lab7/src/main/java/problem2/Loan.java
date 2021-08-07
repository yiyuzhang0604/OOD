package problem2;
import java.util.*;

public class Loan implements ObservableLoan {
    private String type;
    private double interest;
    private List<LoanObserver> observerList = new ArrayList<>();


    public Loan(String type, double interest) {
        this.type = type;
        this.interest = interest;
    }

    public Loan(String type, double interest, List<LoanObserver> observerList) {
        this.type = type;
        this.interest = interest;
        this.observerList = observerList;
    }

    public double getInterest() {
        return interest;
    }

    public void setInterest(double interest) {
        this.interest = interest;
        notifyObserver();
    }

    @Override
    public String toString() {
        return "Loan{" +
                "type='" + type + '\'' +
                ", interest=" + interest +
                '}';
    }


    public void registerObserver(LoanObserver observer) {
        if(!observerList.contains(observer)){
            observerList.add(observer);
        }

    }

    public void removeObserver(LoanObserver observer) {
        if(observerList.contains(observer)){
            observerList.remove(observer);
        }else{
            throw new IllegalArgumentException("Observer not found");
        }

    }

    public void notifyObserver() {
        for(LoanObserver observer:this.observerList){
            observer.update(this);
        }

    }
}
