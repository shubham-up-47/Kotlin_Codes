fun main() 
{ 
   for(i in 1..5)                    // expressing range [1,5] using ".." operator          
   print(i)
 
 
   if(4 !in 5..10)                   // expressing range [5,10] using ".." operator 
   print("\nNot there\n")
 
 
   for(i in 1 until 5)               // expressing range [1,5) using until keyword                          
   print(i)
 
   
   print("\n")
   
   
   for(i in 1..5 step 2)             // expressing {1,3,5} i.e. taking step of 2 in range [1,5] using step keyword & ".." operator                       
   print(i) 


   print("\n")
   
 
   val iterator = (1..5).iterator()
                                     // keep "forEach" & "{" in same line otherwise error                        
   iterator.forEach {  print(it)  }  // expressing range [1,5] using it operator 
}


 // for loop is best for integer ranges
 // forEach loop is best for collections (we can't use continue/break in forEach loop)




/*
 
Some ways to write number values in kotlin:

1_000_000 (int)

1234_5678_9012_3456L (long)

0xFF_EC_DE_5E (hexadecimal)

0b11010010_01101001_10010100_10010010 (binary)

*/


