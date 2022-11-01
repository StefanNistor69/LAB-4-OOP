public class Office_PC_1 extends PC{
    private boolean Wifi;
    private int O_PC1price;

    public Office_PC_1() {
        super("office", true, "Office","RTX 3050","intel i3",8,"Gold 100W");
        this.Wifi = false;
    }
    public double getO_PC1price() {

        if (Wifi == true) {
            O_PC1price += 20;
        } else if (Wifi == false) {
            O_PC1price += 0;
        }
        return O_PC1price;
    }
    public void AssemblePC() {
        super.AssemblePC();
        System.out.println("Worker checks if customer want WaterCooling which is"+ Wifi);
    }
    @Override
    public double getPrice() {

        return super.getPrice() + getO_PC1price();
    }
}
