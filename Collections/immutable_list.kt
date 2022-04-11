fun main()
{
    val names = listOf("John","Mark","Sarah","Finn")                         // immutableList stores elements as (index,value)                     

    println("Size of the list is: ${names.size}")
    println("Forth item of the list is: ${names[3]}")                        // accessingListElement 1 by passing index
    println("Second item of the list is: ${names.get(1)}")                   // accessingListElement 2 by passing index
    println("Sarah is at the index ${names.indexOf("Sarah")} in the list")   // accessingListElement 3 by passing value
}


                                                       


