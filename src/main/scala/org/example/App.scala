package org.example
import scala.io.StdIn.readLine

/**
 * @author ${user.name}
 */
object App {
  def main(args : Array[String]) {
//    val startValString = "Hello World!"
    var startVarString = "Hello World!"
// выводит фразу «Hello, Scala!» справа налево
    println(startVarString.reverse )
// переводит всю фразу в нижний регистр
    println(startVarString.toLowerCase)
// удаляет символ "!" тремя способами
    println(startVarString.init )
    println(startVarString.replace("!","") )
    println(startVarString.dropRight(1))
// добавляет в конец фразы «and goodbye python!» двумя способами
    println(startVarString.dropRight(1) + " and goodbye python!" )
    startVarString = startVarString.dropRight(1) + " and goodbye python!"
    println(startVarString)
  }
}
