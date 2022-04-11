/*

Generic (template in Kotlin)

Generic Function (function having generics/templates)
 
*/
  

fun printContent1(content: String)
{
    println("The content is $content")
}

     // Any (accepts any datatype)  
fun printContent2(content: Any)
{
    println("The content is $content")
}
     // Generic Function (accepts mentioned datatype)
fun <T> printContent3(content: T)
{
    println("The content is $content")
}


fun main()
{
    printContent1("Hello World!")
    
    printContent2(5)
    printContent2(5.62)
    printContent2("abc") 

    printContent3<Int>(9)
    printContent3<Char>('A')
    printContent3<String>("abc")
    printContent3<Boolean>(true)
}








