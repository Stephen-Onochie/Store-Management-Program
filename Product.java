public class Product {

    //variables for all types of products
    public int supply = 0;
    public String name = "";
    public String description = "";

    //default constructor
    public Product(){
        supply = 0;
        name = "untitled";
        description = "no description";
    }

    //generic product constructor
    public Product(int supply, String name, String description){
        this.supply = supply;
        this.name = "Generic Product";
        this.description = "This is a generic product";
    }

    public Product(int supply, String name){
        this.supply = supply;
        this.name = "Generic Product";
        this.description = "N/A";
    }

    public int getSupply(){
        return supply;
    }

    public String getName(){
        return name;
    }

    public String getDescription(){
        return description;
    }

    public void setSupply(int supply){
        this.supply = supply;
    }

    public void setName(String name){
        this.name = name;
    }

    public void setDescription(String description){
        this.description = description;
    }

    public String toString(){
        return "This product is called the " + name + ". It currently has " + supply + " in stock. " + description;
    }
}
