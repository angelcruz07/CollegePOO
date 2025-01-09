public class Car {
    //Properties
    public String brand = null;
    public String color = null;
    public String category = null;

    public Car(){
        this.brand = "Brand not defined";
        this.color = "Color not defined";
        this.category = "Category not defined";
    }

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
