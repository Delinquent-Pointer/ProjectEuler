public enum CupSize {
  SMALL(8), MEDIUM(12), LARGE(16), XLARGE(20);

  private final int ounces;

  CupSize(int ounces) {
    this.ounces = ounces;
  }

  public int getOunces() {
    return ounces;
  }

}
