fun main()
{
   var name1: String = "Ram"      // non nullable
   println(name1.length)


   var name2: String? = "Ram"     // nullable 
   if(name2 != null)             
   println(name2.length)          // handling nullability using if else

   var name3: String? = null    
   println(name3?.length)         // safe call operator

   var name4: String? = "Ram"      
   println(name4!!.length)        // not null assertion operator

   var name5: String? = null       
   println(name5?.length ?: 0)    // elvis operator


   printNameLength("John","Joe")
}


fun printNameLength(str1: String?, str2: String?)
{
   println("Name: ${str1?.length} ${str2?.length}")         
}


 














