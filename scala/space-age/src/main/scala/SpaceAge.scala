import scala.math.BigDecimal.RoundingMode

object SpaceAge {
  def onEarth(seconds: Double): BigDecimal = BigDecimal(seconds / 31557600.0).setScale(2, RoundingMode.CEILING)

  def onMercury(seconds: Double): BigDecimal = this.onEarth(seconds) / 0.2408467

  def onVenus(seconds: Double): BigDecimal = this.onEarth(seconds) /  0.61519726

  def onMars(seconds: Double): BigDecimal = this.onEarth(seconds) / 1.8808158

  def onJupiter(seconds: Double): BigDecimal = this.onEarth(seconds) / 11.862615

  def onSaturn(seconds: Double): BigDecimal = this.onEarth(seconds) / 29.447498

  def onUranus(seconds: Double): BigDecimal = this.onEarth(seconds) / 84.016846

  def onNeptune(seconds: Double): BigDecimal = this.onEarth(seconds) / 164.79132

}
