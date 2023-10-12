public class Airpods extends Product{
    //special variables
    private String soundQuality = "";
    private String model = "";

    //generic Airpods constructor
    public Airpods(){
        name = "Generic Airpods";
        supply = 100;
        description = "This is a Generic Airpods Product.";
        soundQuality = "Good";
        model = "1st Gen";
    }

    //specialized Airpods constructor
    public Airpods(String name, String description, int supply, String soundQuality, String model){
        this.name = name;
        this.description = description;
        this.supply = supply;
        this.soundQuality = soundQuality;
        this.model = model;
    }

    public Airpods(String name, String description, int supply){
        this.name = name;
        this.description = description;
        this.supply = supply;
    }

    public String getSoundQuality(){
        return soundQuality;
    }

    public String getModel(){
        return model;
    }

    public void setSoundQuality(String soundQuality){
        this.soundQuality = soundQuality;
    }

    public void setModel(String model){
        this.model = model;
    }

    public String AirpodsToString(){
        return "These " + name + " have " + supply + " Products in stock, a " + soundQuality + " sound Quality, and are the " + model + " model. " + description;
    }




}
