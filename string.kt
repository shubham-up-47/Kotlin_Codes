fun main()
{
    val str1: String = "John" + " Doe"                     // string concatenation 
    val str2: String = "House No " + 23 + 'A'              // string concatenation (first var during string concatenation must be a string)
  
    println(str1)
    println(str2)



    val flatNo: Int = 23

    val str3: String = "Name is $str1"                     // string template (accessing value of variable using $ keyword)  
    val str4: String = "Name is ${str1.length} char long"  // string template (accessing value of expression_enclosedInCurlyBraces using $ keyword)
    val str5: String = "Tower 2, Flat No " + flatNo + 'A'
    val str6: String = "Tower 2, Flat No ${flatNo}A"  
 
    println(str3)
    println(str4)
    println(str5)
    println(str6) 
    println(str5.compareTo(str6,true))                     // compares strings & returns 0 (str1==str2), +ve int (str1<str2), -ve int (str1>str2) 
    println(str1.subSequence(2,6))                         // returns string subsequense having (startIndex, index after endIndex)
}








 

 