package tienda;

public class Tienda {
  int total = 0, piezas = 0;
  double subtotal = 0;

  public void agregarLista(int precio, int piezas) {
    total += precio;
    this.piezas += piezas;
  }
  
  public boolean comprar(){
      if(subtotal <= 0){
          throw new IllegalArgumentException("No hay productos en la lista");
      }
      
      return true;
  }
  
  public double getSubtotal(){
    return subtotal += total + (total * .16);
  }

  public void setSubtotal(int subtotal) {
    this.subtotal = subtotal;
  }

  public int getTotal() {
    return total;
  }

  public void setTotal(int total) {
    this.total = total;
  }

  public int getPiezas() {
    return piezas;
  }

  public void setPiezas(int piezas) {
    this.piezas = piezas;
  }

}
