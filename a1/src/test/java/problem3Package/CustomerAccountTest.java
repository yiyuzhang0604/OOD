package problem3Package;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class CustomerAccountTest {
    private CardHolder expectedOwner;
    private String firstName;
    private String lastName;
    private Integer dollar;
    private Integer cent;
    private Amount expectedAmount;
    private CustomerAccount testAccount;
    private Amount value;

    @Before
    public void setUp() throws Exception {
        firstName = "Briana";
        lastName = "Zhang";
        expectedOwner = new CardHolder(firstName,lastName);

        dollar = 18;
        cent = 34;
        expectedAmount = new Amount(dollar, cent);

        testAccount = new CustomerAccount(expectedOwner, expectedAmount);

        value = new Amount(23,44);
    }

    @Test
    public void getOwner() {
        assertEquals(expectedOwner, testAccount.getOwner());
    }

    @Test
    public void getCurrBalance() {
        assertEquals(expectedAmount, testAccount.getCurrBalance());
    }

    @Test
    public void deposit() {
        int newDollar = 41;
        int newCent = 78;

        CustomerAccount newAccount = testAccount.deposit(value);
        Amount expectValue = new Amount(newDollar, newCent);

        CustomerAccount expectAcc = new CustomerAccount(expectedOwner, expectValue);

        Amount result = newAccount.getCurrBalance();
        Amount expect = expectAcc.getCurrBalance();
        assertEquals(result.getDollar(), expect.getDollar());
        assertEquals(result.getCent(), expect.getCent());
    }
    @Test
    public void withdraw() {
        int newDollar = 4;
        int newCent = 23;
        Amount withdrawValue = new Amount(newDollar, newCent);

        CustomerAccount newAccount = testAccount.withdraw(withdrawValue);
        int afterWD = 14;
        int afterWC = 11;
        Amount expectValue = new Amount(afterWD, afterWC);

        CustomerAccount expectAcc = new CustomerAccount(expectedOwner, expectValue);

        Amount result = newAccount.getCurrBalance();
        Amount expect = expectAcc.getCurrBalance();
        assertEquals(result.getDollar(), expect.getDollar());
        assertEquals(result.getCent(), expect.getCent());
    }
}