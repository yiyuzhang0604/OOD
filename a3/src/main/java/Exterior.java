public abstract class Exterior extends AbstractServices {

    public Exterior(String address, PropertySize propertySize, Boolean monthly, Integer previousCarry) throws IllegalArgumentException {
        super(address, propertySize, monthly, previousCarry);
    }

    @Override
    public double calculatePrice(){
        if(getPropertySize() == PropertySize.Large){
            return HOURLY_PRICE * 4;
        }else if(getPropertySize() == PropertySize.MEDIUM){
            return HOURLY_PRICE* 2;
        }else {
            return HOURLY_PRICE;
        }
    }
}
