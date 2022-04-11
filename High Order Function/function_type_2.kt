fun getSum(x: Int, y: Int): Int                                 
{   return (x+y)   }                                           // regularFunction

                                                               // takingFunctionAsArgument (HigherOrderFunction)
fun performOperation(x: Int, y: Int, fn: (Int,Int) -> Int)
{
    val result = fn(x,y)                                       // invokingTheFunction    

    println("Result of $x and $y is: $result")
}


fun main()
{ 
    performOperation(2, 4, ::getSum)                           // passingFunctionAsArgument

    performOperation(8, 1, {x,y -> x-y})                       // passingLambdaFunctionAsArgument

    performOperation(7, 6, fun(x: Int, y: Int): Int = x*y)     // passingAnonymousFunction(SingleExpression)AsArgument


    val fn: (String) -> Int = getLength()                      // returningFunctionAsValue & storingItInVariable   
    println("Length is: ${fn("Mark")}")                        // invokingTheFunction  
}

                                                             
fun getLength(): (String) -> Int   
{                                                              // returningFunctionAsValue
    return {x: String -> x.length}                             // returningLambdaFunction   
}            







