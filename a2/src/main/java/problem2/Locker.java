package problem2;

/**
 * Locker class is a subclass extends from Object class
 */
public class Locker extends Object {
    private Mail mail;

    /**
     * Constructs a Locker object with provided parameters
     * @param width - width
     * @param height - height
     * @param depth - depth
     * @param mail - Mail object
     */
    public Locker(Integer width, Integer height, Integer depth, Mail mail) {
        super(width, height, depth);
        this.mail = mail;
    }

    public Mail getMail() {
        return mail;
    }

    public void addMail(Mail newMail) throws OccupiedException, ExceedDimensionException{
        if(this.mail.getRecipient() == null){
            this.mail = newMail;
        }else if(this.mail.getRecipient() != null){
            throw new OccupiedException("This locker has been occupied");
        }else if(newMail.getWidth() >this.getWidth() ||newMail.getHeight() > this.getHeight()||
                 newMail.getDepth() > this.getDepth()){
            throw new ExceedDimensionException("This locker can not fit your mail");
        }
    }

    public Mail pickUpMail(Recipient person) {
        Mail pickMail = getMail();
        if (pickMail.getRecipient() != null) {
            if (pickMail.getRecipient().getFirstName() == person.getFirstName() &&
                    pickMail.getRecipient().getLastName() == person.getLastName()) {
            }
        }
        this.mail = new Mail(0, 0, 0, null);
        return pickMail;
    }
}
