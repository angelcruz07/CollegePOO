package conversordedivisas;


public class Currency {
  // Propeties of currency
  // Uso de encapsilamiento
  private String name;
  private String symbol;
  private String country;

  // Define constructor
  // Constructor empty
  public Currency() {
      this.name = "MXN";
      this.symbol = "$";
      this.country = "Mexico"; 
  }

  // Constructor with parameters
  public Currency(String name, String symbol, String country) {
    this.name = name;
    this.symbol = symbol;
    this.country = country;
  }

  public String getName() {
    return name;
  }

  public String getSymbol() {
    return symbol;
  }

  public String getCountry() {
    return country;
  }

  // Not use setters because not need to modify the properties of currency
}
