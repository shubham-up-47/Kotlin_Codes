fun main()
{
    val classRanks = mapOf(1 to "Sarah", 2 to "Mark", 3 to "Finn", 4 to "John")   // immutableMap stores elements as (key,value)                     

    println("Ranks: ${classRanks.keys}")                                          // printingMapKeys
    println("Students: ${classRanks.values}")                                     // printingMapValues 

    println("Student at rank 1 is ${classRanks.get(1)}")                          // findingValue                         
   
    println("Is key=4 present: ${classRanks.containsKey(4)}")                     // searchingKey    
    println("Is value=Finn present: ${classRanks.containsValue("Finn")}")         // searchingValue                  

    println(classRanks)   
}







 

