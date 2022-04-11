// postfix expression is input initially              
// UserEnters"y" => continue
// UserEnters"OtherString" => stop & print output 


import java.util.*


fun main()                              // doing calculations on double 
{
   val read = Scanner(System.`in`)
   
   var x = read.nextDouble()
   var y = read.nextDouble()   
   var operator = read.next() 
   x = calculate(x, y, operator)

   var str: String = read.next()

   while(str == "y")
   {
       operator = read.next()
       y = read.nextDouble() 
       x = calculate(x, y, operator)
       
       str = read.next()
   }

   println(x) 
}


fun calculate(x: Double, y: Double, operator: String): Double     
{
    when(operator)
    {
       "+" -> return (x+y)
       "-" -> return (x-y)
       "*" -> return (x*y)
       "/" -> return (x/y) 
       else -> return 0.0
    }  
}



