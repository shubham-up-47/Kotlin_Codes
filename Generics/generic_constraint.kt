/*

Generic Constraint (putting constraint in generics) 


Hierarchy of Inbuilt Classes in Kotlin

(Any? Class)    >            (Any Class)             >     ..... 
[parentOfAll]       [parentOfAllNonNullableClasses] 

*/


  // simple generic function with no constraints                                                                                                                      
fun <T> printPrice1(price: T)
{
    println("The price is: $price")
}

  // NumberClass as upperBoundOfGeneric so thisGenericWillAccept type/subtypeOfNumberClass i.e. Int,Float,Long etc                                                                                            
fun <T: Number> printPrice2(price: T)      
{            // single UpperBound
    println("The price is: $price")
}

  // AnyClass as upperBoundOfGeneric so thisGenericWillAccept type/subtypeOfAnyClass i.e. all non nullable types in Kotlin              
fun <T: Any> printPrice3(price: T)      
{            // single UpperBound
    println("The price is: $price")
}

  // NumberClass & AnyClass as upperBoundOfGeneric so thisGenericWillAccept type/subtypeOfNumberClass_&_AnyClass                                                                                            
fun <T,V> printPrice4(price: T, name: V) where T: Number, V: Any 
{            // multiple UpperBounds (use "where" keyword)
    println("The price of $name is: $price")
}

  // NumberClass & AnyClass as upperBoundOfGeneric so thisGenericWillAccept type/subtypeOfNumberClass_&_AnyClass                                                                                            
fun <T: Number, V: Any> printPrice5(price: T, name: V)   
{            // multiple UpperBounds 
    println("The price of $name is: $price")
}


fun main()
{
    printPrice1<Int>(23) 
    printPrice1<Double>(24.5) 
    printPrice1<String>("John")         // printingPriceOf John isMeaningless soThereShouldBeSomeConstraint soThat thisFunctionShouldn'tAcceptString  

    val p: Int? = null
    printPrice1(p)                      // itIsWorking withoutmentioning"GenericType"OfFunction dueTo typeInferencePropertyOfKotlin (system considers T=Any?)   


    printPrice2<Int>(17) 
    printPrice2<Double>(4.6) 


    printPrice3<Long>(70761) 
    printPrice3<Char>('b') 
    printPrice3<String>("abc") 
 

    printPrice4<Int,String>(38, "abc") 


    printPrice5<Int,String>(38, "abc") 
}

 





  
 