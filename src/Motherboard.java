public class Motherboard extends Case{
    protected String motherboardType;

    protected int mPrice;





    public Motherboard(String casetype, boolean Bluetooth,String motherboardType) {
        super(casetype, Bluetooth);
        this.motherboardType = motherboardType;

    }


    @Override
    public void AssemblePC() {
        super.AssemblePC();
        if(motherboardType == "Office"){
            System.out.println("Waiter picks " + motherboardType + " motherboard ");
            mPrice += 20;
        } else if(motherboardType == "Gaming") {
            System.out.println("Waiter picks " + motherboardType + " motherboard ");
            mPrice += 30;
        }
    }

    @Override
    public double getPrice() {
        return super.getPrice() + (mPrice);
    }

}
