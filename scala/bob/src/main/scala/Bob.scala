object Bob {

  def response(statement: String): String =
    statement match {
      case passiveQuestion if passiveQuestion.replaceAll("[^a-z?]","").forall(!_.isLetterOrDigit)
        && !passiveQuestion.replaceAll("[^a-z?]","").isEmpty &&
        passiveQuestion.replaceAll("[^a-z?]","").last != '?' =>
        "Sure."
      case yelledQuestion if (yelledQuestion.replaceAll("[[^a-zA-Z0-9!?],\\s]", "").forall(c => c.isUpper) && yelledQuestion.last == '?')
          || yelledQuestion.replaceAll("[[^a-zA-Z0-9!?],\\s]", "").replaceAll("[?]*\\s+","").isEmpty =>
        { println(yelledQuestion.replaceAll("[[^a-zA-Z0-9?],\\s]", "")); "Calm down, I know what I'm doing!" }
      case passiveQuestion if passiveQuestion.last == '?' =>
        "Sure."
      case scold if scold.filter(_.isLetterOrDigit).forall(c => c.isUpper)  =>
        "Whoa, chill out!"
      case count if count.replaceAll("[0-9\\s]", "").forall(c=> c.isUpper || !c.isLetter) && count.last == '!' =>
        "Whoa, chill out!"
      case x => println(x.replaceAll("[0-9\\s]", ""));  "Whatever."
    }
}