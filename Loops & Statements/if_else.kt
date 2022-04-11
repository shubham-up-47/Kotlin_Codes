fun main() 
{
   val price = 85                                // val
   var discount1 = 0                             // var
   var discount2 = 0                             // var
    
    
   if(price > 50)
   discount1 = 14
   else
   discount1 = 7
    
    
   discount2 = if(price > 50) 14 else 7          // conditional operator in Kotlin
    
    
   println(discount1) 
   println(discount2)  

/*                   // Type Mismatch Error 
   if(1)             // except Boolean other datatypes are not allowed as condition in for_loop/while_loop/if_else etc                                         
   print(7)  
   
*/

}


