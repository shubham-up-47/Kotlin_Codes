import java.util.*


fun main()
{ 
    var n: Int = Integer.valueOf(readLine())     // takiung Int input     
    var str1 = readLine()                        // taking String? input
    var str2 = readLine()!!                      // taking String input  
    println("$n $str1 $str2")
 

    val read = Scanner(System.`in`)             // taking three Int input in same line (useAboveHeaderFileToAccess"Scanner()")
    var x1: Int = read.nextInt() 
    var x2: Int = read.nextInt() 
    var x3: Int = read.nextInt() 


    var y1: Int = Integer.valueOf(readLine())   // taking three Int input in different line 
    var y2: Int = Integer.valueOf(readLine())   // (Give input in different line, otherwise kotlin will take input as string )
    var y3: Int = Integer.valueOf(readLine())  


    var d = read.nextDouble()                   // taking Double input
    var str = read.next()                       // taking String input 


    val t = read.nextInt()                       // no of test cases                      
    for(i in 1..t) 
    {
        val n = read.nextInt()                   // size of array 
        val arr = IntArray(n){ read.nextInt() }  // storing input array elements (size = n)

        println(sumOfElements(arr, n))           // passing array as argument in a function          
    } 
}


fun sumOfElements(arr: IntArray, n: Int): Int 
{
   var sum: Int = 0

   for(i in 0 until n)
   sum += arr[i]

   return sum
}

 




