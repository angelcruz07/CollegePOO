package volumenes;

public class Volumenes {
  double volumen;

  public void volumenCubo(double lado) {
    double volumenCubo = Math.pow(lado, 3);
    setVolumen(volumenCubo);
  }

  public void volumenEsfera(double radio) {
    double volumenEsfera = (4.0 / 3.0) * (Math.PI * Math.pow(radio, 3));
    setVolumen(volumenEsfera);
  }

  public void volumenCilindro(double radio, double altura) {
    double volumenCilindro = Math.PI * Math.pow(radio, 2) * altura;
    setVolumen(volumenCilindro);
  }

  public double getVolumen() {
    return volumen;
  }

  public void setVolumen(double volumen) {
    this.volumen = volumen;
  }

}
