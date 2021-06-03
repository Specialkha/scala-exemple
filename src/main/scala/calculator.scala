package com.clearurdoubt
import scala.math.sqrt

class Calculator {
  def +(a: Int, b: Int): Int = a + b

  def -(a: Int, b: Int): Int = a - b

  def *(a: Int, b: Int): Long = a * b

  def /(a: Int, b: Int): Int = {
    require(b != 0, "denominator can not be 0")
    a / b
  }
  def sqrd(a: Int): Long = a * a

  def squareRoot(a: Double): Double = {
    scala.math.sqrt(a)
  }
}

object Calendar {
  def main(args: Array[String]) = {
    val calc = new Calculator()

    println("Addition: " + calc.+(10, 2))
    println("Subtraction: " + calc.-(10, 2))
    println("Multiplication: " + calc.*(10, 2))
    println("Division: " + calc./(10, 2))
    println("Carré: " + calc.sqrd(10))
    println("Racine: " + calc.squareRoot(15))
  }
}
