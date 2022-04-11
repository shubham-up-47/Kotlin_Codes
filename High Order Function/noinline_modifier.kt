/* 

Noinline Modifier                                                                 
*weCannotPass variableStoring LambdaFunction/AnonymousFunction asArgumentInOtherFunction    
*usingKeyword"noinline"InDefinationOfVariable weCanPass variableStoringLambdaFunction asArgumentInOtherFunction                       

*/ 


/* 
inline fun printName(name: String, fn1: (String) -> Unit, fn2: (Int,Int) -> Unit)
{
    fn1(name)

    printSum(fn2)           // weCannotPass variableStoringLambdaFunction asArgumentInOtherFunction      
}
*/

inline fun printName(name: String, fn1: (String) -> Unit, noinline fn2: (Int,Int) -> Unit)
{
    fn1(name)

    printSum(fn2)           // usingKeyword"noinline"InDefinationOfVariable weCanPass variableStoringLambdaFunction asArgumentInOtherFunction   
}

fun printSum(fn: (Int,Int) -> Unit)    
{   fn(4,7)   }


fun main()
{
    val name: String = "John"

    printName(name, {println(it)}) {x: Int, y: Int -> println("The sum of number is ${x+y}")}  // taking two LambdaFunction as argument  
}











 
