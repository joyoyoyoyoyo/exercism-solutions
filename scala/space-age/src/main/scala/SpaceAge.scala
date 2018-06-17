import scala.math.BigDecimal.RoundingMode

object SpaceAge {
  def onEarth(seconds: Double): BigDecimal = BigDecimal(seconds / 31557600.0).setScale(2, RoundingMode.HALF_DOWN)

  def onMercury(seconds: Double): BigDecimal = (this.onEarth(seconds) / BigDecimal(0.2408467)).setScale(2, RoundingMode.HALF_DOWN)

  def onVenus(seconds: Double): BigDecimal = (this.onEarth(seconds) /  BigDecimal(0.61519726)).setScale(2, RoundingMode.DOWN)

  def onMars(seconds: Double): BigDecimal = (this.onEarth(seconds) / BigDecimal(1.8808158)).setScale(2, RoundingMode.HALF_DOWN)

  def onJupiter(seconds: Double): BigDecimal = (this.onEarth(seconds) / BigDecimal(11.862615)).setScale(2, RoundingMode.HALF_DOWN)

  def onSaturn(seconds: Double): BigDecimal = (this.onEarth(seconds) / BigDecimal(29.447498)).setScale(2, RoundingMode.HALF_DOWN)

  def onUranus(seconds: Double): BigDecimal = (this.onEarth(seconds) / BigDecimal(84.016846)).setScale(2, RoundingMode.HALF_DOWN)

  def onNeptune(seconds: Double): BigDecimal = (this.onEarth(seconds) / BigDecimal(164.79132)).setScale(2, RoundingMode.HALF_DOWN)

}
