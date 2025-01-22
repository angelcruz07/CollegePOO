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

  // Constructor
  public CurrencyConvert(double mxnToUsdRate, double mxnToEurRate, double usdToEurRate) {
    this.mxnToUsdRate = mxnToUsdRate;
    this.mxnToEurRate = mxnToEurRate;
    this.usdToEurRate = usdToEurRate;
    this.eurToUsdRate = usdToEurRate; 
  }

  // Methods to convert currency

    // MXN a USD
    public double mxnToUsd(double amount) {
        return amount * mxnToUsdRate;
    } 

    // USD a MXN
    public double usdToMxn(double amount) {
        return amount / mxnToUsdRate;
    }

    // MXN a EUR
    public double mxnToEur(double amount) {
        return amount * mxnToEurRate;
    }

    // EUR a MXN
    public double eurToMxn(double amount) {
        return amount / mxnToEurRate;
    }
    
    
    // USD a EUR
    public double usdToEur(double amount) {
        return amount * usdToEurRate;
    }

    // EUR a USD
    public double eurToUsd(double amount) {
        return amount / eurToUsdRate;
    }

}