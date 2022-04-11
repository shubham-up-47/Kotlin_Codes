/* 

Reified Type (type is preserved during runtime)
*use "reified" keyword to make the type ReifiedType  
*if we use ReifiedType & InlineFunction then T willNotBeErased duringRuntime  
*must make function "inline" to use "reified" type


Inline Function 
*use "inline" keyword to create InlineFunction
*code of InlineFunction is copied to that position where it is called 
*it is fast & valid for small functions                                                                   

*/
 

/*   

fun <T> checkTypeAtRuntime(temp: Any)
{            // T will be erased during runtime, so then we can't compare type of T & temp, so error here                                                        
    println("${temp is T}")        // type checking                
} 

*/

                   // genericFunction checking inputType & functionType isSameOrNot
inline fun <reified T> checkTypeAtRuntime(temp: Any)
{   
    println("${temp is T}")      // type checking                
} 


fun main()
{
    val nameList: MutableList<String> = mutableListOf("John", "Sarah", "Mark")
    val ageList: MutableList<Int> = mutableListOf(1, 2, 3)

//  nameList & ageList will be just List i.e. T is erased during runtime, there will be no way to find their type during runtime  
//  toCheckTheType"T"DuringRunTime usingUserDefinedFunction weMakeThat (function = inline) & (type = reified T)                                                                                         
                         
    checkTypeAtRuntime<String>("John")
//  println("${"John" is String}")     (inline function so code will be copied here)    
 
    checkTypeAtRuntime<Int>("Sarah")
//  println("${"Sarah" is Int}")      (inline function so code will be copied here)     
}








 
 
 
 



