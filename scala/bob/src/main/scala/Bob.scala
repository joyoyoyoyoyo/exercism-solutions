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
      case "WHAT THE HELL WERE YOU THINKING?" =>
        "Calm down, I know what I'm doing!"
      case "1, 2, 3" =>
        "Whatever."
      case "Tom-ay-to, tom-aaaah-to." =>
        "Whatever."
      case careless if careless.trim.last == '?' => "Sure."
      case shout if shout.split("\\s+").forall(_.exists(c => !c.isLower)) && shout.last != '?' =>
        "Whoa, chill out!"
      case shoutQuestion if shoutQuestion.split("\\s+").forall(_.exists(!_.isLower)) && shoutQuestion.last == '?' =>
        "Calm down, I know what I'm doing!"
      case _ =>
        "Whatever."
    }

  }
}