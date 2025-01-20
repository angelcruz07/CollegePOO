public class Package {
    private double money = 0.0;

    public Package() {
        this.money = 0.0;
    }

       public double getMoney() {
        return money;
    }

    public void setMoney(double money) {
        this.money = money;
    }

    public String determinePackage(double money) {
        String message = null;
        if (money >= 50000) {
           message =  "Felicidades tienes el Paquete A !: \n que incluye una televisión, un modular, tres pares de zapatos, cinco camisas y cinco pantalones";
        }else if (money < 50000 && money >= 20000){
            message =  "Has obtenido el paquete B: que incluya una grabadora, tres pares de zapatos, cinco camisas y cinco pantalones";
        }else if(money < 20000 && money >= 10000) {
            message =  "Has obtenido el paquete C: que incluye dos pares de zapatos, tres camisas y tres pantalones ";
        }else if(money < 10000 && money > 0) {
            message = "Has obtenido el paquete D: que incluye un par de zapatos, dos camisas y dos pantalones.";
        } else {
            message = "No tienes dinero necesario para comprar un paquete";
        }

        return message;
    }
}
