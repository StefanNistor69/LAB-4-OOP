public class Gaming_PC_1 extends PC{

    private boolean WaterCooling;
    private int PC1price;

    public Gaming_PC_1() {
        super("gaming", true, "Gaming","RTX 3050","intel i5",8,"Gold 100W");
        this.WaterCooling = false;
    }
    public double getPC1price() {

        if (WaterCooling == true) {
            PC1price += 20;
        } else if (WaterCooling == false) {
            PC1price += 0;
        }
        return PC1price;
    }
    public void AssemblePC() {
        super.AssemblePC();
        System.out.println("Worker checks if customer want WaterCooling which is"+ WaterCooling);
    }

    @Override
    public double getPrice() {

        return super.getPrice() + getPC1price();
    }
}
