public class Case {
    private String casetype;

    private boolean Bluetooth;


    private double price;

    public Case(String casetype, boolean Bluetooth) {
        this.casetype = casetype;
        this.Bluetooth = Bluetooth;

    }

    public void setcasetype(String casetype) {
        this.casetype = casetype;
    }
    public void setBluetooth(boolean Bluetooth) {
        this.Bluetooth = Bluetooth;
    }
    public void AssemblePC(){
        System.out.println("Worker picks " + casetype + " case and checks if the customer wants Bluetooth to be" + Bluetooth);
    }




    public double getPrice() {
        if (casetype == "office" ) {
            price += 15;
        }

        else if (casetype == "gaming") {
            price += 25;
        }
        if(Bluetooth){

            price += 10;
        } else{
            price += 0;
        }


        return price;
    }
}
