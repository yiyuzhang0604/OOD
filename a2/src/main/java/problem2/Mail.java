package problem2;

/**
 * Mail class is a subclass extends from Object class
 */
public class Mail extends Object {
    private Recipient recipient;

    /**
     * Constructs a Mail object with provided parameters
     * @param recipient - the person who receive the mail
     */
    public Mail(Integer width, Integer height, Integer depth, Recipient recipient) {
        super(width, height, depth);
        this.recipient = recipient;
    }

    /**
     * @return recipient
     */
    public Recipient getRecipient() {
        return recipient;
    }
}
