package org.example
import scala.io.StdIn.readLine

package object example1 {
  println("Введите годовой доход:")
  val yearSalary = readLine().toInt
  println("Размер премии:")
  val bonus = readLine().toInt
  println("Компенсация питания")
  val eatBonus = readLine().toInt
  val sum = yearSalary + bonus
  println(sum)
}
