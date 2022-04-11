import java.util.*


open class Shapes(open var lsa: Int, open var tsa: Int, open var volume: Int)                                                                              
{   
    fun printD() 
    {   print("$lsa $tsa $volume")   }
}

class Sphere(r: Int): Shapes(4*3*r*r, 4*3*r*r, ((4*3*r*r*r)/3).toInt()) 
 
class Cylinder(r: Int, h: Int): Shapes(2*3*r*h, 2*3*r*h + 2*3*r*r, 3*r*r*h) 
 
class Cube(a: Int): Shapes(4*a*a, 6*a*a, a*a*a) 
 
 
fun main(args: Array<String>) 
{
    val read = Scanner(System.`in`)

    when(read.nextInt()) 
    {
        1 -> {  val r = read.nextInt()
                val temp = Sphere(r)
                temp.printD()  }
        
        2 -> {  val r = read.nextInt()
                val h = read.nextInt()
                val temp = Cylinder(r,h)
                temp.printD()  }
        
        3 -> {  val a = read.nextInt()
                val temp = Cube(a)
                temp.printD()  }
    }
}





