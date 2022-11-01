public class PC extends Motherboard{
    private String GPU;

    private String CPU;

    private int RAM;

    private String PowerSupply;

    private int GPUprice;

    private int CPUprice;

    private int RAMprice;

    private int PowerPrice;



    public PC(String casetype,boolean Bluetooth,String motherboardType,String GPU, String CPU, int RAM, String PowerSupply) {
        super(casetype, Bluetooth,motherboardType);
        this.GPU = GPU;
        this.CPU = CPU;
        this.RAM = RAM;
        this.PowerSupply = PowerSupply;


    }

    public void setGPU(String GPU) {
        this.GPU = GPU;
    }
    public void setCPU(String CPU) {
        this.CPU = CPU;
    }
    public void setRAM(int RAM) {
        this.RAM = RAM;
    }
    public void setPowerSupply(String PowerSupply) {
        this.PowerSupply = PowerSupply;
    }

    public double getGPUprice(){

        if(GPU == "RTX 3050"){
            GPUprice += 50;
        } else if (GPU == "RTX 3060") {

            GPUprice += 70;

        } else if (GPU == "RTX 3080") {
            GPUprice += 100;
        }
        return GPUprice;
    }
    public double getCPUprice(){

        if(CPU == "intel i3"){
            CPUprice += 10;
        } else if (CPU == "intel i5") {

            CPUprice += 30;

        } else if (CPU == "intel i7") {
            CPUprice += 50;
        }
        return CPUprice;
    }
    public double getRAMprice(){

        if(RAM == 8){
            RAMprice += 10;
        } else if (RAM == 16) {

            RAMprice += 30;

        }
        return RAMprice;
    }
    public double getPowerPrice(){

        if(PowerSupply == "Gold 100W"){
            PowerPrice += 50;
        } else if (PowerSupply == "Platinum 120W") {

            PowerPrice += 70;

        }
        return PowerPrice;
    }
    @Override
    public void AssemblePC() {
        super.AssemblePC();

    }
    @Override
    public double getPrice() {

        return super.getPrice() + (getGPUprice()+getCPUprice()+getRAMprice()+getPowerPrice());
    }
}
