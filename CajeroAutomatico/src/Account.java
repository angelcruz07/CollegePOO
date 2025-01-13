public class Account {
    //Properties
    public String titular = null;
    public int saldo = 0;

    public Account(){
        this.titular = "Not defined";
        this.saldo = 1000;
    }

    public Account(String titular, int saldo){
        this.titular = titular;
        this.saldo = saldo;
    }

    public String getTitular() {
        return titular;
    }

    public void setTitular(String titular) {
        this.titular = titular;
    }

    public double getSaldo() {
        return saldo;
    }

    public void setSaldo(int saldo) {
        this.saldo = saldo;
    }

    public void depositar(int cantidadDeposito) {
        this.saldo += cantidadDeposito;
    }

    public void retirar(int cantidadRetiro) {
        if(this.saldo < cantidadRetiro){
            System.out.println("Saldo insuficiente");
        }else {
            this.saldo -= cantidadRetiro;
        }
    }
}
