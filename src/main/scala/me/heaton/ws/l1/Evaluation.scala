package me.heaton.ws.l1

object Evaluation {

  def and(b1: Boolean, b2: => Boolean): Boolean = b1 && b2
  def or(b1: Boolean, b2: => Boolean): Boolean = if(b1) b1 else b2

}
