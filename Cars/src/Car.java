public class Car {
    //Properties
    public String brand = null;
    public String color = null;
    public String category = null;

    // Constructor
    public Car(){
        this.brand = "Brand not defined";
        this.color = "Color not defined";
        this.category = "Category not defined";
    }

    //Constructor with parameters
    public Car(String brand, String color, String category){
        this.brand = brand;
        this.color = color;
        this.category = category;
    }

    //Si tenemos dos constructores se le llama sobrecarga

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String getCategory() {
        return category;
    }

    public void setCategory(String category) {
        this.category = category;
    }

}
