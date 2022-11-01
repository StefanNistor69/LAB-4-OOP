public class Customer extends Person{

    public Customer( boolean DiscountCard) {
        super("Customer", DiscountCard);
    }

    @Override
    public boolean DiscountCard() {
        return super.DiscountCard();
    }
}
