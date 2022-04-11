/* 

Function Literal
*it is an alternate syntax for defining a function
*It is used when weHaveToPassFunctionAsArgument but weDonotWantToDefineSeparateFunction
*e.g. LambdaFunction, AnonymousFunction 


Lambda Function/Expression
*codeBlock which is declared inside "{}" & takes parameters
*itIsFunctionLiteral i.e. itHasNoDefination butCanBe passedAs"FunctionType"Argument / storedIn"FunctionType"Variable                                                          
*itsLastExpression can be MultipleStatements(writeEachInDifferentLine) / SingleStatement / Unit(returnNothing) 
*itsReturnType is predicted using itsLastExpression        


Note: 
*if aLambdaTakesOnlyOneParameter thenThatParameter's inputLineCanBeSkipped & thenAccessedAs"it"InLambdaExpressions
*if aLambdaIsLastArgument whichIsPassedToFunction then weCanMoveItToOutsideTheFunction                                                       
*if aLambdaIsOnlyArgument whichIsPassedToFunction then weCanMoveItToOutsideTheFunction   
*LambdaFunction canBeTakenByFunction as well as canBeReturnedByFunction 
*LambdaFunctionCannotBeGeneric i.e. weCannotUse"<T>"InLambdaFunction
                                                         . 
*/
                                                                                    
                                            
fun main()
{                                                
    val f0: (Int,Int) -> Int = {x: Int, y: Int -> x+y}    // storing LambdaFunction in "FunctionType"Variable  
    val f1 = {x: Int, y :Int -> x+y}                      // noNeedToMention"FunctionType"Of"f1" bcz compilerCanKnowsItFromDefinationOfLambda                                                            
    val f2: (Int,Int) -> Int = {x,y -> x+y}               // noNeedToMention"DataType"Of"x"And"y" bcz compilerCanKnowItFromDefinationOf"f1"                                                               
    
    println("${f0(7,2)}")
    println("${f1(7,2)}")
    println("${f2(7,2)}")
 

    val f3 = {2}                           // MinimalLambdaFunction (takesNothing & returnsConstant)
    val f4 = { x: Int -> println(x)  
                         2*x }             // MultipleStatementLambdaFunction (printing"x" & returning"2*x") (ReturnType=Int bcz LastExpression=Int)
    
    println(f3())
    println(f4(5))

 
    val f5: (String) -> Int = {x: String -> x.length} // LambdaTakingOneParameter and performingOperationOn"it"
    val f6: (String) -> Int = {it.length}             // if aLambdaTakesOnlyOneParameter thenThatParameter's inputLineCanBeSkipped & thenAccessedAs"it"InLambdaExpressions
    
    println(f5.invoke("John"))
    println(f6.invoke("John"))
 

    performOperation1(8, 1, {x,y -> x+y})
    performOperation1(8,1) {x,y -> x+y}    // if aLambdaIsLastArgument whichIsPassedToFunction then weCanMoveItToOutsideTheFunction  
    
    performOperation2({x,y -> x+y})
    performOperation2 {x,y -> x+y}         // if aLambdaIsOnlyArgument whichIsPassedToFunction then weCanMoveItToOutsideTheFunction 
}


fun performOperation1(x: Int, y: Int, fn: (Int,Int) -> Int)
{
    val result = fn(x,y)

    println("Result of $x and $y is: $result")
}

fun performOperation2(fn: (Int,Int) -> Int)
{
    val result = fn(4,9)

    println("Result of 4 and 9 is: $result")
}








 

