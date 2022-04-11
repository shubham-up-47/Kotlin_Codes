/*

Generic (template in Kotlin)

Generic Class (Class having generics/templates)
 
*/
  

class Printer1()
{
    fun <T> printContent(content: T)
    {
        println("The content is $content")
    } 
}

class Printer2<T>()
{
    fun printContent(content: T)
    {
        println("The content is $content")
    } 
}


fun main()
{
    val p1 = Printer1()
    p1.printContent("Hello World!")      // itIsWorking withoutmentioning"GenericType"OfFunction dueTo typeInferencePropertyOfKotlin (system considers T=Any?)                            

    val p2 = Printer1()
    p2.printContent(9)                  


    val p3 = Printer2<String>()          // mustMention"GenericType"OfClass otherwiseError             
    p3.printContent("Hello World!")

    val p4 = Printer2<Int>()         
    p4.printContent(13)
}










