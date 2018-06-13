object SumOfMultiples {

  /** Return the sum of all unique integer multiples between 0 and some upper bound {{{limit}}}
    *
    * @param factors unique factors to check against
    * @param limit an integer upper bound
    * @return return the sum of all unique integer multiples for all elements in the set
    */
  def sum(factors: Set[Int], limit: Int): Int = {
    val seq = for (x <- 0 until limit if factors.exists(factor => x % factor == 0)) yield x
    seq.sum
  }
}
