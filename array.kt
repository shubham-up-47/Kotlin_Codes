fun main()
{
    val arr1 = arrayOf(1, 2, 3, 4)                      // creatingArray 1  

    println("Number at index 3 is: ${arr1[3]}")         // accessingArrayElement 1
    println("Number at index 1 is: ${arr1.get(1)}")     // accessingArrayElement 2
    println("Numbers greater than 2: ${arr1.filter{it>2}}")    // filter function
                                                                                    
    arr1[0] = 7                                         // updatingArrayElement 1
    arr1.set(2,5)                                       // updatingArrayElement 2 by passing (index,newValue)

    println(arr1.joinToString(","))                     // joiningArrayElements (with "," as seperator) to form string                                  



    val arr2 = intArrayOf(1, 7, 3, 4, 8)
    val arr3 = doubleArrayOf(1.5, 4.2, 3.6, 4.5, 7.9)                          
   
    val arr4 = Array(5, {2})                            // creatingArray by passing (size, {initialValue_forAllIndexes}) 
    val arr5 = IntArray(5, {index->index*2})            // creatingArray by passing (size, {initialValue_inTermsOfTheirIndexes})
    val arr6 = DoubleArray(5, {index->index+0.1})       // creatingArray by passing (size, {initialValue_inTermsOfTheirIndexes})

    println(arr2.joinToString(","))   
    println(arr3.joinToString(", "))     
    println(arr4.joinToString(","))     
    println(arr5.joinToString(","))     
    println(arr6.joinToString(", "))       
}













