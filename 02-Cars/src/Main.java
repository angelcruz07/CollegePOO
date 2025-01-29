public class Main {
    public static void main(String[] args) {
        //Class name / constructor
        Car toyota = new Car();
        toyota.setBrand("Toyota");
        toyota.setColor("Black");
        toyota.setCategory("Sport");
        toyota.breakCar(toyota.getBrand());

        Car nissan = new Car("Nissan", "Red", "Sedan");
        nissan.breakCar(nissan.getBrand());

        System.out.println("Brand: " + toyota.getBrand());
        System.out.println("Color: " + toyota.getColor());
        System.out.println("Category: " + toyota.getCategory());

        System.out.println("Brand: " + nissan.getBrand());
        System.out.println("Color: " + nissan.getColor());
        System.out.println("Category: " + nissan.getCategory());
    }
}
