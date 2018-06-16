object Bob {
  def response(statement: String): String = {
    val words = statement.split("\\s+")
    val multiLine = statement.split("\\n")
    val trimmed = statement.trim()

//    val containingQuestion =
//      multiLine.exists(s => s.last == '?')
//
//    val containingStatement =
//      multiLine.exists(s => s.last == '.')
//
//    val containgExclamation =
//      multiLine.exists(s => s.last == '!')

    statement match {
      case upset if upset.trim.isEmpty => "Fine. Be that way!"
      case careless if careless.trim.last == '?' => "Sure."
    }

  }
}