package conversordedivisas;

/**
 *
 * @author Angel
 */
class CurrencyConvert {
  // Word Final indicate the valor for this property, is not modifiable after the
  // create object
  private final double mxnToUsdRate;
  private final double mxnToEurRate;
  private final double usdToEurRate;
  private final double eurToUsdRate;
  private final double mxnToYen;
  

  // Constructor
  public CurrencyConvert(double mxnToUsdRate, double mxnToEurRate, double usdToEurRate, double mxnToYen) {
    this.mxnToUsdRate = mxnToUsdRate;
    this.mxnToEurRate = mxnToEurRate;
    this.usdToEurRate = usdToEurRate;
    this.eurToUsdRate = usdToEurRate; 
    this.mxnToYen = mxnToYen;
  }

  // Methods to convert currency

    // Conversión MXN a USD
    public double mxnToUsd(double amount) {
        return amount / mxnToUsdRate;
    }

    // Conversión USD a MXN
    public double usdToMxn(double amount) {
        return amount * mxnToUsdRate;
    }
    
    // MXN a EUR
    public double mxnToEur(double amount) {
        return amount / mxnToEurRate;
    }

    // EUR a MXN
    public double eurToMxn(double amount) {
        return amount * mxnToEurRate;
    }
    
    // USD a EUR
    public double usdToEur(double amount) {
        return amount * usdToEurRate;
    }

    // EUR a USD
    public double eurToUsd(double amount) {
        return amount / eurToUsdRate;
    }
    
    //MXN a YEN
    public double mxnToYen(double amount){
        return amount * mxnToYen;
    }
    
    //YEN a MXN
    public double yenToMxn(double amount){
        return amount / mxnToYen;
    }
}