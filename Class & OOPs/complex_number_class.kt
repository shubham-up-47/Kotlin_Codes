import java.util.*

class ComplexNumber(private var real: Int, private var img: Int) 
{ 
 
    init 
    {     }
    
    fun print() 
    {   println("$real + i$img")   }
 
    fun add(c2: ComplexNumber) 
    {
        real += c2.real
        img += c2.img 
    }
                                                 
    fun multiply(c2: ComplexNumber) 
    {
        var realT: Int = real * c2.real - img * c2.img  
        var imgT: Int = real * c2.img + img * c2.real 
        
        real = realT
        img = imgT
    } 
}


fun main(args: Array<String>) 
{
    val read = Scanner(System.`in`)
    val num1Real = read.nextInt()
    val num1Img = read.nextInt()
    val complex1 = ComplexNumber(num1Real, num1Img)

    val num2Real = read.nextInt()
    val num2Img = read.nextInt()
    val complex2 = ComplexNumber(num2Real, num2Img)

    when(read.nextInt()) 
    {
        1 -> {  complex1.add(complex2)
                complex1.print()   }
        2 -> {  complex1.multiply(complex2)
                complex1.print()   }
    }
}






