/* 

Inline Function  
*code of InlineFunction is copied to that position where it is called                              


Returning from Lambda Function
*LambdaFunction simplyCan'tReturn byUsing "return" keyword                                                                                                                                                                            
*LambdaFunction canReturn ifItIsPassed in InlineFunction, then
 - "return" keyword in LambdaFunction, will cause "exitFromTheProgram" (bcz"InlineFunction"CodeWillComeIn"main()"ThenReturn)                                               
 - "return@NameOfInlineFunction" keyword in LambdaFunction, will cause "returnFromTheLambdaFunction"                                                                          


Note:
*returning from LambdaFunctions work differently than RegularFunctions 
*use AnonymousFunction when youWantedToReturn inMidOfTheFunctionLiteral   

*/                                                                         
                                                                                                                                          
                                                              
inline fun printSum(fn: (Int?,Int) -> Unit)                                 
{                                                                                       
    val x = null                                                
    val y = 7                                                   

    println("Not done with printSum() function")

    fn(x,y)                                           
                                                                   
    println("Done with printSum() function")
}

                                                       // LambdaFunction as onlyArgumentOfTheFunction  
fun main()                       
{                                                   
    printSum {x: Int?, y: Int -> if(x == null)       
                                 return@printSum       // returnFromTheLambdaFunction
                                 else
                                 println("Sum of $x and $y is: ${x+y}")}
    println("Done1\n")
    


    printSum {x: Int?, y: Int -> if(x == null)       
                                 return                // exitFromTheProgram
                                 else
                                 println("Sum of $x and $y is: ${x+y}")}
    println("Done2\n")
}














