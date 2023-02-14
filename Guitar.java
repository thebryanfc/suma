public class Guitar {
    private String SerialNumber;
    private double price;
    private String Builer;
    private String model;
    private String type;
    private String Backwood;
    private String TopWood;

    public String getSerialNumber(){return SerialNumber;}
    public void setSerialNumber(String serialNumber){this.SerialNumber=serialNumber; }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public String getBuiler() {
        return Builer;
    }

    public void setBuiler(String builer) {
        Builer = builer;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getBackwood() {
        return Backwood;
    }

    public void setBackwood(String backwood) {
        Backwood = backwood;
    }

    public String getTopWood() {
        return TopWood;
    }

    public void setTopWood(String topWood) {
        TopWood = topWood;
    }
}
