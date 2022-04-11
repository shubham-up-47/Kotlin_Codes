fun main()
{
    val x1: Int = 10
                                /* 
    val x2: Long = x1                      // Type Mismatch Error (bcz both are of different datatype)
    println(x2)
                                */ 
    val x2: Long = x1.toLong()             // type casting using inbuilt function  
    println(x2)
                                /* 
    val x3: Long = x1 as Long              // type casting using as (exception: it can't convert int to long) 
    println(x3)
                                */ 
    val x3: Long? = x1 as? Long            // type casting (safe casting) using as (it stores null if casting not possible)   
    println(x3)

 

    val str1: Any = "John"                 // this is String var (Any is parent class of all classes including String class)    
   
    val str2: String = str1.toString()     // type casting using inbuilt function   
    println(str2)

    val str3: String = str1 as String      // type casting using as  
    println(str3)

    if(str1 is String)                     // type check (condition executes if str1 is of String datatype)               
    println(str1.length) 



    val i1: Long = 10

    val i2: Int = i1.toInt()               // type casting using inbuilt function   
    println(i2)
  
    val i3: Int? = i1 as? Int              // type casting (safe casting) using as (it stores null if casting not possible)   
    println(i3)
}









 

 