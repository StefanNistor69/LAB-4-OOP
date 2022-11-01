public class Office_PC_3 extends  PC{
    private boolean Wifi;
    private int O_PC3price;

    public Office_PC_3() {
        super("office", true, "Office","RTX 3050","intel i7",16,"Platinum 120W");
        this.Wifi = true;
    }
    public double getO_PC3price() {

        if (Wifi == true) {
            O_PC3price += 20;
        } else if (Wifi == false) {
            O_PC3price += 0;
        }
        return O_PC3price;
    }
    public void AssemblePC() {
        super.AssemblePC();
        System.out.println("Worker checks if customer want WaterCooling which is"+ Wifi);
    }
    @Override
    public double getPrice() {

        return super.getPrice() + getO_PC3price();
    }
}
