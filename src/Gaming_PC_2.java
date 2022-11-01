public class Gaming_PC_2 extends PC{
    private boolean WaterCooling;
    private int PC2price;

    public Gaming_PC_2() {
        super("gaming", false, "Gaming","RTX 3060","intel i5",16,"Gold 100W");
        this.WaterCooling = true;
    }
    public double getPC2price() {

        if (WaterCooling == true) {
            PC2price += 20;
        } else if (WaterCooling == false) {
            PC2price += 0;
        }
        return PC2price;
    }
    public void AssemblePC() {
        super.AssemblePC();
        System.out.println("Worker checks if customer want WaterCooling which is"+ WaterCooling);
    }
    @Override
    public double getPrice() {

        return super.getPrice() + getPC2price();
    }
}
