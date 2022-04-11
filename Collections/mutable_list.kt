fun main()
{
    val names = mutableListOf("John","Mark","Finn")     // mutableList stores elements as (index,value)     
 
    names.add("Sarah")                                  // addingNewElementAtEnd 

    println(names)

    names[1] = "James"                                  // updatingListElement 1 
    names.set(0,"Michael")                              // updatingListElement 2 by passing (index,newValue)

    println(names)

    names.remove("Mark")                                // deletingListElement 1 by passing value
    names.removeAt(1)                                   // deletingListElement 2 by passing index

    println(names)
    
    names.clear()                                       // deletingAllListElements                        

    println(names)
}








 