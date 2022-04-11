/* 

System Exception
*exceptionThrownBySystem
*seriesOfFunctionCallsAreShownByCompilerInErrorStatement useItToFindOutTheWrongFunction 
*e.g. NumberFormatException


Note:
*whenExceptionIsThrown thenObjectOf"ExceptionClass"IsThrown ("ExceptionClass"IsParentOfAllOther"ClassesRelatedToException")                                                                           
  
*/
 

                      // convertingName fromStringToInteger                                                    
fun parseName(str: String): Int
{
    return str.toInt()
}


fun main() 
{
    val str: String = "300"  
    val x: Int = parseName(str) 
    println(x)                                                                           

/*  
    val str: String = "Titanic"   
    val x: Int = parseName(str)  
    println(x)                       // Here NumberFormatException (an object of ExceptionClass) cameBcz stringBasedOnName cannotBeConvertedToInteger                                                                                                                                                                            
*/       

/* 
    val x: Int = 1/0                 // Here ArithmeticException
*/
}














 

