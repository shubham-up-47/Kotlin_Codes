/* 

Try Block (use "try" keyword)
*itMeans weAreTryingToExecuteTheCode
*it isTheCode thatCanThrowTheException


Catch Block (use "catch" keyword)
*it isExceptionHandler & generally weKeepMultipleCatchBlocks eachCorrespondingToDifferentTypeOfException                      
*it containsArgumentAsObjectOfTheClass correspondingToTheExceptionRaised


Finally Block (use "finally" keyword)
*itAlwaysRuns (exceptionHappen/exceptionDoesNotHappen inBothTheCases)  
*if"return"IsIn"TryBlock" thenAlsoItWillBeExcecutedBcz itAlwaysRuns


Note:
*"TryBlock"WillNotBeAlone, alongWithIt weMustHave"CatchBlock"Or"FinallyBlock" 
*ifWeUseOnly"TryBlock"And"FinallyBlock" then"FinallyBlock"WillBeExecuted andErrorWillBeShown(dueToTheException)AtEnd                        
*whenCompilerGetsExceptionIn"TryBlock" thenItSearches"CatchBlock"CorrespondingToThatExceptionAndPrintsTheMessage then"FinallyBlock"IsExecuted                             
*use"TryCatchFinally"ToAvoid terminationOfProgram/appCrashing justDueToExceptionInSmallPartOfCode 
 
*/

 
import java.lang.Exception                            // libraryHavingClassesRelatedToException raising/handling

                                     
fun parseName(str: String): Int
{    return str.toInt()    }                          // convertingName fromStringToInteger  

 
fun main()
{
     try                                             
     {    
          val str1: String = "300"  
          val x1: Int = parseName(str1) 
          println(x1)      
  
          val str2: String = "Titanic"   
          val x2: Int = parseName(str2)  
          println(x2)                                 // Here NumberFormatException (an object of ExceptionClass) cameBcz stringBasedOnName cannotBeConvertedToInteger                                                                                                                                                                            
      
     }                                                // "e" = objectOfTheClass correspondingToTheExceptionRaised

     catch(e: NumberFormatException)                  // catches NumberFormatException                                               
     {    println("Caught by NumberFormatException: ${e.message}")    }  

     catch(e: Exception)                              // catches anyOtherException ("ExceptionClass"IsParentOfAllOther"ClassesRelatedToException") 
     {    println("Caught by Exception: ${e.message}")    }   

     finally                                                                                                                                                       
     {    println("Finally block executed")    }

}











 

