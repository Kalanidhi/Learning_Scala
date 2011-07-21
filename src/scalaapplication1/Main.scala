package scalaapplication1

//import scalaapplication1.ch04.ChecksumAccumulator

object Main {

  
  
  /**
   * @param args the command line arguments
   */
  def main(args: Array[String]): Unit = {
    /* Chapter 5 */
    // Byte, Short, Int, Long, Char are Integral types.  With Float and Double, that's Numeric types.
    println("""|Welcome to Ultamix 3000
               |Type "Help" for help.""".stripMargin)
    
    val string = "Hello, world"
    print("An example of using a method as an operator: ")
    println(string indexOf 'o')
    
    val zero = 2 + (2).unary_-;
    assert(zero == 0, "I was expecting 2 - 2 to be 0")
    
    /* Chapter 4 
    val acc = new ChecksumAccumulator
    val csa = new ChecksumAccumulator

    println("result of calling acc.f is = " + acc.f)
    println("result of calling acc.g is = " + acc.g)
    println("result of calling acc.h is = " + acc.h)
    
    val myString = acc.h
    println("Calling calculate on acc.h is " + ChecksumAccumulator.calculate(myString))
    */
   
    /* Chapter 2-3
    val foo = new Foo
    foo.playWithLists
    foo.playWithTuples
    foo.playWithImmutableSets
    foo.playWithMutableSets
    foo.playWithMutableMaps
    foo.playWithImmutableMaps
   
    
    val args = Array("test/foo.txt")
    val cc = new CountChars
    val lines = cc.imperativeCountLines(args)
    println("Number of lines in " + args.mkString(" ") + " is " + lines)
    */
   
    /* Chapter 1
      val greetStrings = Array("Hello", ", ", "World!")
      greetStrings.foreach(print)
      */
  }
  

}
