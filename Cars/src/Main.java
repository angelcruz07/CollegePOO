public class Main {
    public static void main(String[] args) {
        //Class name / constructor
        Car toyota = new Car();
        toyota.setBrand("Toyota");
        toyota.setColor("Black");
        toyota.setCategory("Sport");

        Car nissan = new Car("Nissan", "Red", "Sedan");

        System.out.println("Brand: " + toyota.getBrand());
        System.out.println("Color: " + toyota.getColor());
        System.out.println("Category: " + toyota.getCategory());

    }
}