/* 

Type Alias (similar to typedef) 
*storing "type" (FunctionType/DataType/ClassType/CollectionType) in a UserDefinedVariable                                                                                                                                        
*it is just a pointerToActualType not a seperateMemory
 

Note:
*use "typealias" keyword to declare TypeAlias of a "type"   
*writingFunctionTypeMultipleTimesIsLengthy so thatTimeWeUseTypeAlias    
*TypeAlias is declared atFileLevel (globalDeclaration) notClassLevel

*/
 

                                  /*  
fun printSum(x: Int, y: Int, fn: (Int,Int) -> Int)
{
    val sum = fn(x,y)
    println("Sum of $x and $y is: $sum")

    val s: String = "John"
    println(s)
}                                  */


typealias intFnType = (Int,Int) -> Int            // TypeAlias of FunctionType     
typealias str = String                            // TypeAlias of DataType  


fun printSum(x: Int, y: Int, fn: intFnType)
{
    val sum = fn(x, y)
    println("Sum of $x and $y is: $sum")

    val s: str = "John"
    println(s)
}


fun main()
{
    printSum(5, 8, {x,y -> x+y} )                // passingLambdaFunctionAsArgument 
}




 

