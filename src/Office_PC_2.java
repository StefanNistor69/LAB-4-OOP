public class Office_PC_2 extends  PC{
    private boolean Wifi;
    private int O_PC2price;

    public Office_PC_2() {
        super("office", true, "Office","RTX 3050","intel i5",16,"Gold 100W");
        this.Wifi = false;
    }
    public double getO_PC2price() {

        if (Wifi == true) {
            O_PC2price += 20;
        } else if (Wifi == false) {
            O_PC2price += 0;
        }
        return O_PC2price;
    }
    public void AssemblePC() {
        super.AssemblePC();
        System.out.println("Worker checks if customer want WaterCooling which is"+ Wifi);
    }
    @Override
    public double getPrice() {

        return super.getPrice() + getO_PC2price();
    }
}
