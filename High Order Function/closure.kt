/* 

Closure (variable outside the scope)
*LambdaFunction (LF) & AnonymousFunction (AF) can access their closure/variableOutsideOfTheirScope                                                                                                  
*they have memoryOfTheLocalVariables evenAfterThefunctionReturns    
 
*/

 
                                 // function of takes nothing & returns MinimalSignatureFunction type                                     
fun printNext(): () -> Unit
{
    var count = 0
                               // Closure = area insideTheFunction but ousideTheLF/AF (isCalled"ClosureOfTheLF/AF")            
    return {  count++          // LF & AF can capture & access their Closure (LF isEnclosedIn"{}" stillItCanAccessTheVariableOutsideTheScopeOfTheLF)                                                             
              println("The count is $count")  }
}                              // returning LF


fun main()
{
    val fn = printNext()       // storing LF

    fn()                       // eachTime LF willPrintUpdatedValueOf"count" bcz LF hasCapturedItsClosure (captured"count"VariablePresentInClosure) 
    fn()
}









 




