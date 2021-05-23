package problem3Package;

/**
 * CustomerAccount is a class object that has cardholder's name, current account balance,
 */
public class CustomerAccount {
    private CardHolder owner;
    private Amount currBalance;

    /**
     * Constructor that build a customer account obejct with these parameters:
     * @param owner - the owner of this account
     * @param currBalance - the current balance of this account
     */
    public CustomerAccount(CardHolder owner, Amount currBalance) {
        this.owner = owner;
        this.currBalance = currBalance;
    }

    /**
     * @return the owner of the account
     */
    public CardHolder getOwner() {
        return owner;
    }

    /**
     * @return the current balance of this account
     */
   public Amount getCurrBalance(){
       return currBalance;
   }

    /**
     * @param value - amount that need to be added to this account
     * @return a new customerAccount object with the updated balance
     */
    public CustomerAccount deposit(Amount value){
        int currDollar = currBalance.getDollar();
        int currCent = currBalance.getCent();
        int newDollar = currDollar + value.getDollar();
        int newCent = currCent + value.getCent();
        Amount newBalance = new Amount(newDollar, newCent);
        CustomerAccount update = new CustomerAccount(this.owner,newBalance);
        return update;
    }

    public CustomerAccount withdraw(Amount value){
        int currDollar = currBalance.getDollar();
        int currCent = currBalance.getCent();
        int newDollar = currDollar - value.getDollar();
        int newCent = currCent - value.getCent();
        Amount newBalance = new Amount(newDollar, newCent);
        CustomerAccount update = new CustomerAccount(this.owner,newBalance);
        return update;

    }
}

