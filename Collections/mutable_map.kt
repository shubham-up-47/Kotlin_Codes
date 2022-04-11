fun main()
{                     
    val classRanks = mutableMapOf(1 to "Sarah", 2 to "Mark", 3 to "Finn", 4 to "John")   // mutableMap stores elements as (key,value)                     

    classRanks.put(4, "Jim")                                                             // addingNewElement by passing (key,value)    
    classRanks.remove(2)                                                                 // removingMapElement by passing key

    println("Ranks: ${classRanks.keys}")                                                 // printingMapKeys
    println("Students: ${classRanks.values}")                                            // printingMapValues 

    println("Student at rank 1 is ${classRanks.get(1)}")                                 // findingValue                         
   
    println("Is key=4 present: ${classRanks.containsKey(4)}")                            // searchingKey    
    println("Is value=Finn present: ${classRanks.containsValue("Finn")}")                // searchingValue    

    println(classRanks)              

        
    val mapping = mutableMapOf<Int,String>(1 to "1", 2 to "2", 3 to "3")                 // <Int,String> mutableMap (mentioning map type, initially)
    println(mapping) 
 
    val dataList = mutableMapOf(1 to 1.4, 2 to 6.9, 3 to 2.8)                           // <Int,Float> mutableMap
    println(dataList) 
           
    val info = mutableMapOf(1 to "XY",'A' to "PQ",3 to "WX", "x" to 12)                 // <Any,Any> mutableMap
    println(info)  
}







 