/* 

Type Projection (Use Site Variance)
*using variance (Covariance/Contravariance) at Use Site of class                            


Note:     
*it is used when we can't apply Covariance/Contravariance at Declaration Site of class   
*weMayHaveFunctionsInsideGeneric whichTake/ReturnType"T" so covariance/contravarianceIsNotAlwaysPossible 
 
*/                                                                                                                                                                                                                   
      

class ListExample1   
{                 // copying list1<Any> data to list2<Any>                     
    fun copy(list1: MutableList<Any>, list2: MutableList<Any>) 
    {            
        for(i in list1.indices) 
        list2.add(list1[i])
    } 
}

class ListExample2  
{                 // copying list1<out Any> data to list2<Any>    
    fun copy(list1: MutableList<out Any>, list2: MutableList<Any>) 
    {             // TypeProjection / UseSiteVariance (bcz we are using variance (Covariance/Contravariance) during use of the class) 
        for(i in list1.indices) 
        list2.add(list1[i])
    } 
}


fun main()
{                  // AnyClass isParentClassOf IntClass  
    val numList: MutableList<Int> = mutableListOf(1, 2, 3)
    val anyList: MutableList<Any> = mutableListOf("John", 7)

/*  
    ListExample1().copy(numList, anyList)     // itWillGiveError bcz genericsAreInvariant                                
*/
    ListExample2().copy(numList, anyList)      // using covariance (assigning childComplexType to parentComplexType of function) at Use Site of class
}








