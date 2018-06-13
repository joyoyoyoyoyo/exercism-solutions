sealed trait Date {
  def year: Int
}

final case class Leap(override val year: Int) extends Date

final case class Year(override val year: Int) extends Date

object Leap {

  def leapYear(year: Int): Boolean = year match {
    case isLeapYear@Leap() => true
    case _ => false
  }

  def unapply(year: Int): Boolean = {
    val evenlyDivisibleBy4: Boolean = year % 4 == 0
    val evenlyDivisibleBy100: Boolean = year % 100 == 0
    val evenlyDivisibleBy400: Boolean = year % 400 == 0
    evenlyDivisibleBy4 && (!evenlyDivisibleBy100 || evenlyDivisibleBy400)
  }
}

