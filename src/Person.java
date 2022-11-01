public abstract class Person {
    private String name;
    private boolean DiscountCard;

    public Person(String name, boolean DiscountCard) {
        this.name = name;
        this.DiscountCard = DiscountCard;
    }

    public boolean DiscountCard() {
        return DiscountCard;
    }
}
