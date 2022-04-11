/* 

Inline Function
*code of InlineFunction is copied to that position where it is called   
*it works properly if function is small                          
*makingBigFunctionAsInline willCauseCodeBloat bcz copying, managing & running bigFunctionIsDifficult  


Application of InlineFunction                  
*for ReifiedType (to preserve "type" during runtime)                                                        
*for LambdaFunction(LF) (to return from it using "return" keyword)
*to prevent Runtime Overhead (to avoid creation of Object when LF/AF is passed in a function)                                                                      
 
*/
 

fun performOperation1(name: String, fn: (String) -> Unit)
{   fn(name)   }

inline fun performOperation2(name: String, fn: (String) -> Unit)
{   fn(name)   }


fun main()
{
    val name: String = "John"

    for(i in 0..2)                            // callingUserDefinedFunctionHaving LF/AF asArgumentWillCreate"Object"(storing LF/AF + closureOf"LF/AF"FromPreviousFunctionCall) soThisObjectConsumesMuchMemory   
    performOperation1(name) { println(it) }   // callingTheFunctionMultipleTimes willCauseCreationOfMultipleObjects(each storing LF/AF + closureOf"LF/AF"ContainingValueOf"it"FromPreviousFunctionCall) whichWillTakeSoMuchMemory                                                               
 

    for(i in 0..2)                            // codeOf"performOperation2()"WillBeCopiedHereForRunningTheFunction resultingNoObjectFormationWillHappen                                                      
    performOperation2(name) { println(it) }   // thisFunctionWillBehaveLike"println()" i.e. willRunVeryFast & noRuntimeOverhead                                                                                                                                                                                            
}











 

