package me.heaton.ws.l1

import org.specs2.mutable.Specification
import Evaluation._

class EvaluationSpec extends Specification {

  def anything: Boolean = anything

  "and condition" should {
    "be false and do not care about the second given when first given is false" in {
      and(false, anything) === false
    }
  }

  "or condition" should {
    "be True and do not care about the second given when first given is True" in {
      or(true, anything) === true
    }
  }

}
