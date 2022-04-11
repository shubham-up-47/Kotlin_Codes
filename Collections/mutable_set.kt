fun main()
{
    val names = mutableSetOf("John","Mark","Finn")     // mutableSet stores distinct elements only as keys     
 
    println(names)

    names.add("Tom")                                   // addingNewKey
    names.add("Mark")                                  // set ignores duplicate keys

    println(names)
 
    names.remove("John")                               // deletingSetKey
 
    println(names)

    names.clear()                                      // deletingAllSetKeys                        

    println(names)

                       // <Int> mutableSet
    val mapping = mutableSetOf(1 , 2 , 3)
    println(mapping) 

                       // <Any> mutableSet
    val info = mutableSetOf(1, 'A', "PQ", "x", 12)
    println(info)  
                       // <String> mutableSet
    val words = mutableSetOf<String>("PQ", "x", "abc")
    println(words)
}




 