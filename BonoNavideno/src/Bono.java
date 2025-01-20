public class Bono {
    double sueldo = 0;
    int antiguedad = 0;

    public Bono() {
        this.sueldo = 0;
        this.antiguedad = 0;
    }

    public double getSueldo() {
        return sueldo;
    }

    public void setSueldo(double sueldo) {
        this.sueldo = sueldo;
    }

    public int getAntiguedad() {
        return antiguedad;
    }

    public void setAntiguedad(int antiguedad) {
        this.antiguedad = antiguedad;
    }

    public double calcularBono(double sueldo, int antiguedad) {
        double bono = 0;
        if (antiguedad > 4 || sueldo < 2000){
            bono = (sueldo * .25);
        } else {
            bono = (sueldo * .20);
        }
        return bono;
    }
}
