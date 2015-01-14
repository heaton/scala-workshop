package me.heaton.ws.l1

import org.specs2.mutable.Specification
import Evaluation._

class EvaluationSpec extends Specification {

  def anything: Boolean = anything

  "and condition" should {
    "be True and do not care about the second given when first given is True" in {
      and(true, anything) === true
    }
  }

}
