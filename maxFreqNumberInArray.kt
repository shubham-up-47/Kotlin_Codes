import java.util.*


fun main() 
{
    val read = Scanner(System.`in`)
    
    val n = read.nextInt()
    val arr = IntArray(n){ read.nextInt() }
    
    println(maxFrequencyNumber(arr))
}


fun maxFrequencyNumber(arr: IntArray): Int 
{ 
	val h = mutableMapOf<Int,Int>()   // storingFrequency (useElvisOperatorToAccessMapElement bczItReturnsNullableDatatype) 


    for(i in arr.indices)             // noNeedOfArraySize
    { 
        if(h.containsKey(arr[i])) 
        h[arr[i]] = h[arr[i]]!! +1    // or { h[arr[i]] = h.get(arr[i])!! + 1 } or { h.put(arr[i], h.get(arr[i])!! + 1) }                                                                                   
        else 
        h[arr[i]] = 1 
    }

    var maxFreq = Integer.MIN_VALUE
    var maxElem = Integer.MIN_VALUE

    for(x in arr)                     // noNeedOfArraySize           
    {
        if(h[x]!! > maxFreq)
        {  maxFreq = h[x]!!           
           maxElem = x  }
    }


    return maxElem
}

 










        