/* 

Crossinline Modifier      
*crossinline can be declared onlyForParametersOfInlineFunction                                                                           
*returnInLF areNonLocal i.e. whenWeReturnFromLF weReturnFromOuterFunction, itIsNotAlwaysDesirable
*adding"crossinline"KeywordToVariableStoringLF insuresThat LF passed doesNotContain"return"Keyword, nowNoChanceOfUndesirableNonLocalReturn   
*weCanUseOnly"crossinlineLF" (otherwiseError) inTheObjectDefinedInInlineFunction, toEnsureThatNonLocalReturnIsNotCalled (anotherCaseInWhichWeCannotReturnInLambda)

*/

 
inline fun printString1(crossinline fn: (String) -> Unit): Unit
{                      // adding"crossinline"KeywordToVariableStoringLF insuresThat passedLF doesNotContain"return"Keyword, otherwiseErrorWillCome                                                  
    fn("John")                                   
    
    println("Data printed")   
} 


inline fun printString2(crossinline fn: (String) -> Unit): Unit
{   // weCanUseOnly"crossinlineLF" (otherwiseError) inTheObjectDefinedInInlineFunction (toEnsureThatNonLocalReturnIsNotCalled)

    val task = object: Runnable { override fun run() = fn("Mark") }   // creatingObject"task"OfType"Runnable" thenRunning"crossinlineLF"When"run()"IsCalled                                              
    
    task.run()        
} 

 
inline fun printString3(fn: (String) -> Unit): Unit
{                      // LF storedIn"fn"Contains"return" soItReturnsFrom"main()" bcz codeOfInlineFunctionIsCopiedAtFunctionCallSite                                     
    fn("John")                                           
    
    println("Data printed")    
}


fun main()
{
    printString1 { println(it) }  // notAllowedToUseReturn(nonLocalReturn)InIt bcz "crossinline"VariableIsTakingLFargument                                                   


    printString2 { println(it) }                                                  


    printString3 { println(it)                        
                   return }       // globalReturn bcz LF containing"return"IsDefinedIn"main()"                     
}




                      










 
 