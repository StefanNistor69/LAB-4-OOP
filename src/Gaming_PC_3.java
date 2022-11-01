public class Gaming_PC_3 extends  PC{
    private boolean WaterCooling;
    private int PC3price;

    public Gaming_PC_3() {
        super("gaming", true, "Gaming","RTX 3080","intel i7",16,"Platinum 120W");
        this.WaterCooling = true;
    }
    public double getPC3price() {

        if (WaterCooling == true) {
            PC3price += 20;
        } else if (WaterCooling == false) {
            PC3price += 0;
        }
        return PC3price;
    }
    public void AssemblePC() {
        super.AssemblePC();
        System.out.println("Worker checks if customer want WaterCooling which is"+ WaterCooling);
    }
    @Override
    public double getPrice() {

        return super.getPrice() + getPC3price();
    }
}
