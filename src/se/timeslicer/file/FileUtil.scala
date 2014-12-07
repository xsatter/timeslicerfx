package se.timeslicer.file
import scala.io.Source

/**
 * Different file reading routines, to be used
 * by other parts of the program
 */
object FileUtil {
  def readFromFile(filename: String) = {
    val lines = Source.fromFile(filename).mkString
    println(lines);
  }
}