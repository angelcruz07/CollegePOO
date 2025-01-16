/**
 *
 * @author Angel Cruz 1/15/25
 */
public class Account {
    //Properties
    private String titular = null;
    private int saldo = 0;

    public Account(){
        this.titular = null;
        this.saldo = 0;
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

    public int getSaldo() {
        return saldo;
    }

    public void setSaldo(int saldo) {
        this.saldo = saldo;
    }

    public void depositar(int cantidadDeposito) {
        this.saldo += cantidadDeposito;
    }

    public boolean retirar(int cantidadRetiro) {
        boolean resp = false;
        
        if(this.saldo >= cantidadRetiro){
            this.saldo -= cantidadRetiro;
            resp = true;
        }
        
        return resp;
    }
}

