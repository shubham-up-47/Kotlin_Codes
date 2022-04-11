/*  

Function Literal
*it is an alternate syntax for defining a function
*It is used when weHaveToPassFunctionAsArgument but weDonotWantToDefineSeparateFunction
*e.g. LambdaFunction, AnonymousFunction 


Anonymous Function
*itIsFunctionLiteral i.e. itHasNoDefination butCanBe passedAs"FunctionType"Argument / storedIn"FunctionType"Variable  
*it hasNoName but havingDefinationSimilarTo UserDefinedFunction
 

Note:   
*unlike LambdaFunction, weCannotMove"AnonymousFunction"ToOutsideTheFunction 
*unlike LambdaFunction, returnTypeIsExplicitlyMentionedIn"AnonymousFunction" soNoNeedToPredictIt                                                                         
*unlike LambdaFunction, "return"KeywordWorksNormallyFor"AnonymousFunction"
 
*/

                            // functionTakingFunctionAsArgument
fun performOperation(x: Int, y: Int, fn: (Int,Int) -> Int)
{
    val result = fn(x,y)

    println("Result of $x and $y is: $result")
}


fun main()
{ 
                                              // storing"AnonymousFunction"In"FunctionType"Variable            
    val f0: (Int,Int) -> Int = fun(x: Int, y: Int): Int { return (x+y) }                                                                                                                      
    performOperation(4, 8, f0)

                                              // storing"AnonymousFunction"In"FunctionType"Variable                   
    val f1: (Int,Int) -> Int = fun(x: Int, y: Int): Int = x+y        // expressing SingleExpressionFunction as AnonymousFunction                                                                                                                      
    performOperation(4, 8, f1)
 
                                              // passing"AnonymousFunction"As"FunctionType"Argument
    performOperation(7, 2, fun(x,y) = x-y)
}







 







