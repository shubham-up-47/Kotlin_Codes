/* 

Function 
*function are first class citizen in Kotlin  
*we can passFunctionAsArgument/returnFunctionAsValue to a function
*we can store function in a variable    


High Order Function
*function which takesFunctionAsParameter or returnsFunctionAsValue


Function Type
*to store function in a variable, we need to know the type of the function
*it decides what type of functions can be stored in a variable


Lambda Function
*code block which takes parameters
*declared inside "{}"  
*its returnType is predicted using its last expression        


Anonymous Function
*function having no name   


Invoking Function (calling the function)
*Method1: usingInbuilt"invoke()"Function & passingTheParameters
*Method2: writingNameOfVariableStoringFunction & passingTheParametersInRoundBracket                          
 
*/                              

                          
fun main()      
{  
                       // MinimalSignatureFunctionType               
    val f0: () -> Unit             // f0 can store function having (argument nothing) and (return nothing)                                                                                        
   
                       // RegularFunctionType         
    val f1: (Int,Int) -> Int       // f1 can store function having (argumentType = (Int,Int)) and (returnType = Int)                        
    val f2: (Int,Int) -> Boolean   // f2 can store function having (argumentType = (Int,Int)) and (returnType = Boolean) 

                       // NullableFunctionType                    
    val f3: ((String) -> Int)?     // nullable variable so f3 can store null or function having (argumentType = String) and (returnType = Int)   


  
    f1 = ::addInt                  // storing RegularFunction in the variable (syntax = "::FunctionName") 

 
    f2 = {x:Int,y:Int -> x>y}      // storing LambdaFunction in the variable ((Int,Int) -> Boolean)

                                   // storing AnonymousFunction in the variable ((String) -> Int)                                                    
    f3 = fun(str: String): Int {  return str.length  }  

                                   // invoke (calling function by passing parameters)
    f1.invoke(2,4)                 // method1
   
    f2(6,5)                        // method2 
    f3("Mark")                     // method2               
}


fun addInt(x: Int, y: Int): Int
{   return (x+y)   }





                                                    







