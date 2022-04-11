import java.util.*
import kotlin.math.min

class Fraction(private var numerator: Int, private var denominator: Int) 
{
    init 
    {   simplify()   }

    fun print() 
    {   println("$numerator/$denominator")    }

    private fun simplify() 
    {
        var gcd = 1
        val smaller = min(numerator, denominator)
        
        for (i in 2..smaller) 
        {   if(numerator % i == 0 && denominator % i == 0) 
            gcd = i    }
        
        numerator /= gcd
        denominator /= gcd
    }

    fun add(f2: Fraction) 
    {
        numerator = numerator * f2.denominator + denominator * f2.numerator
        denominator *= f2.denominator
        simplify()
    }

    fun sub(f2: Fraction) 
    {
        numerator = numerator * f2.denominator - denominator * f2.numerator
        denominator *= f2.denominator
        simplify()
    }

    fun multiply(f2: Fraction) 
    {
        numerator *= f2.numerator
        denominator *= f2.denominator
        simplify()
    }

    fun divide(f2: Fraction) 
    {
        numerator *= f2.denominator  
        denominator *= f2.numerator
        simplify()
    }
}

fun main(args: Array<String>) 
{
    val read = Scanner(System.`in`)
    val num1 = read.nextInt()
    val deno1 = read.nextInt()
    val num2 = read.nextInt()
    val deno2 = read.nextInt()

    val f1 = Fraction(num1, deno1)
    val f2 = Fraction(num2, deno2)

    when(read.nextInt()) 
    {
        1 -> {  f1.add(f2)
                f1.print()   }
        2 -> {  f1.sub(f2)
                f1.print()   }
        3 -> {  f1.multiply(f2)
                f1.print()   }
        4 -> {  f1.divide(f2)
                f1.print()   }
    }
}









