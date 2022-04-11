/* 
                                                                         
Exception 
*if thereIsAnError duringTheExecutionOfProgram thenCodeThrowsAnException                                                                                                 
 

Note:
*functionCall happensIn"LIFO"Order and theyAreStoredInStack
*previousUncompletedFunctionsWaitInBackground ifNewFunctionCallHappens     
*whenExceptionIsThrown thenObjectOf"ExceptionClass"IsThrown ("ExceptionClass"IsParentOfAllOther"ClassesRelatedToException")                                                                           
*In Kotlin, weHaveOnlyUncheckedExceptions andCanBeCaughtOnlyAtRunTime

*/

             
/* 

Function Call Order
a() -> b() -> c()


Exception Raising (theseSeriesOfFunctionCallsAreShownInErrorStatement useItToFindOutTheWrongFunction)                    
e.g. ifErrorIsFoundIn"c()", controlWillGoTo"b()"Then"a()"Then"main()" (inSearchOf"ErrorHandler") ifControlFailsInFinding"ErrorHandler" thenItRaisesTheException & stopsTheExecutionOfProgram  
                                       
*/
                                               

fun a()
{
    println("a() is called")
    b()
    println("a() is finishing")
}

fun b()
{
    println("b() is called")
    c()
    println("b() is finishing")
}
             
fun c()
{
    println("c() is finishing")
}

fun main()
{ 
    a() 
}














