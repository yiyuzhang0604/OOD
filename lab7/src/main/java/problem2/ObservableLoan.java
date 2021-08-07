package problem2;

public interface ObservableLoan {
    void registerObserver(LoanObserver observer);
    void removeObserver(LoanObserver observer);
    void notifyObserver();
}
