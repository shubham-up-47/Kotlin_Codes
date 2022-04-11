fun printName(name: String): Unit    
{  println(name)  }                                                    // function with argument without return

fun printName1(name: String)                                      
{  println(name)  }                                                    // function with argument without return

fun printName2(firstName: String, lastName: String = "Doe")        
{  println("Full name is $firstName $lastName")  }                     // function with argument without return (having default argument on RHS)

fun printName3(name: String?) = "My name is ${name?:"Harry"}"         // trick for single expression functions 


fun main()
{
   printName("John")     
   printName1("John")  
   printName2("John", "Frost")       
   printName2("John")
   println(printName3("John"))                  
 
   println(addNumbers1(x=4, y=5))                                      // passing named arguments 
   println(addNumbers1(4, 5))     
   println(addNumbers2(4, 5)) 
 
   println(findVolume(height=7, boxName="Cuboid", length=5, width=2))  // passing named arguments (right order is not necessary while passing named arguments)   
}


fun addNumbers1(x: Int, y: Int): Int                                
{  return (x+y)  }                                                     // function with argument with return 

fun addNumbers2(x: Int, y: Int) = (x+y)                                // trick for single expression functions 
 
fun findVolume(boxName: String, length: Int, width: Int, height: Int): Int 
{  println(boxName)
   return length*width*height  }                                       // function with argument with return






 




