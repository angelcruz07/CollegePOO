package convert;

class CurrencyConvert {
  // Word Final indicate the valor for this property, is not modifiable after the
  // create object
  private final double mxnToUsdRate;
  private final double mxnToEurRate;

  // Constructor
  public CurrencyConvert(double mxnToUsdRate, double mxnToEurRate) {
    this.mxnToUsdRate = mxnToUsdRate;
    this.mxnToEurRate = mxnToEurRate;
  }

  // Methods to convert currency

  public double mxnToUsd(double amount) {
    return amount / mxnToUsdRate;
  }

  public double usdToMxn(double amount) {
    return amount / mxnToUsdRate;
  }

  public double mxnToEur(double amount) {
    return amount / mxnToEurRate;
  }

  public double eurToMxn(double amount) {
    return amount / mxnToEurRate;
  }

}
