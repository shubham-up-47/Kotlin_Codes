/* 

Star Projection
*mentioning "*" as the type                           
*this is used when we don't care about the type
 
*/


fun printItems(items: MutableList<*>) 
{           // here weDon'tCareAboutType bcz weAreSimplyPrintingTheInputList                                        
    for(i in items.indices) 
    println(items.get(i))
}


fun main()
{
    val x: MutableList<Any> = mutableListOf(1, 2, "a")
    printItems(x)
}








