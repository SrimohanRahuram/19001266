import scala.math.Pi
object Q2 extends App{
  //The volume of a sphere with radius r is 4/3 Pi r3. What is the volume of a sphere with radius 5?

  println("\nConvert volume of a sphere with radius 5\n")
  val radius = 5;
  val volume :Double = 1.33*Pi*(radius*radius*radius) ;
  println("volume of a sphere with radius 5:  " + (volume ))

}
