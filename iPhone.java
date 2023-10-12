public class iPhone extends Product{
    private int batteryLife = 0; //in years
    private String storage = "";
    public String description = "";

    //default iPhone product
    public iPhone(){
        name = "generic iPhone";
        supply = 100;
        description = "this is a generic iPhone";
        batteryLife = 5;
        storage = "4gb";
    }

    //specialized iPhone product
    public iPhone(String name, String description, int supply, int batteryLife, String storage){
        this.name = name;
        this.description = description;
        this.supply = supply;
        this.batteryLife = batteryLife;
        this.storage = storage;
    }

    public int getBatteryLife(){
        return batteryLife;
    }

    public String getStorage(){
        return storage;
    }

    public void setBatteryLife(int batteryLife){
        this.batteryLife = batteryLife;
    }

    public void setStorage(String storage){
        this.storage = storage;
    }

    public String iPhoneToString(){
        return "This " + name + " has " + supply + " Products in stock, has a battery life of " + batteryLife + " years, and has " + storage + " of storage. " + description;
    }

}
