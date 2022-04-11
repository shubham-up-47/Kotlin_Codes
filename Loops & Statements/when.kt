fun main() 
{
   val rating = 4
    
   val result = when(rating) 
                {  5 -> "High"
                   3,4 -> "Good"
                   1,2 -> "Poor"
                   else -> "Zero"  } 
  
   println("The rating is $result") 
}






