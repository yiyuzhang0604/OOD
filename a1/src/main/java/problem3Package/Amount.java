package problem3Package;

import problem2Package.Time;

/**
 * Amount class is a class object that has dollar amount and cent amount
 */
public class Amount {
    private Integer dollar;
    private Integer cent;

    /**
     * Constructor that build an Amount obejct with these variables:
     *
     * @param dollar - the dollar amount
     * @param cent   - the cent amount
     */
    public Amount(Integer dollar, Integer cent) {
        this.dollar = dollar;
        this.cent = cent;
    }

    /**
     * @return the dollar
     */
    public Integer getDollar() {
        return dollar;
    }

    /**
     * @return the cents
     */
    public Integer getCent() {
        return cent;
    }
}
