/*  
 
   Constructor
*used to create object of a class 
*we initialize properties inside the constructor                                               

 
                             [Type of Constructor in Kotlin]  

1. Primary Constructor
*it is declared in first line of class (it doesn't have any body)                                      
*argument/defaultValue/newProperty can be passed through it (it can create properties for our class)       
*it uses "init" block for initialization, there can be multiple "init" block

2. Secondary Constructor 
*it has body where initialization happens
*some argument/defaultValue can be passed through it 
*it must have to call PrimaryConstructor using "this(argument)" (if PrimaryConstructor is also present)
*we can't create properties using it


Note:
*If there is no modifier/annotation we can remove "constructor" keyword from it                   
 
*/

 
class Student constructor(str1: String="Musk")    
{        // primary constructor (passing default value here)

    val firstName: String                    // immutableProperty1 (String)   
    var lastName: String? = null             // mutableProperty2 (String?)   
 
    init                                     // initialization in Primary Constructor 
    {  println("init block of PrimaryConstructor called")
       this.firstName = str1  }             // using this keyword to access properties 
 
    constructor(str1: String, str2: String): this(str1)   // secondary constructor (calling PrimaryConstructor from it)     
    {  println("SecondaryConstructor called")
       this.lastName = str2  }             // using this keyword to access properties 

}
          
/*
 
(str1,str2) goes inSecondaryConstructor, then (str1) goes & firstName isInitializedInPrimaryConstructor, then secondName isInitializedInSecondaryConstructor                                     

*/

class Teacher(val firstName: String="Mark")    
{        // primary constructor (creating immutableProperty1 (String) here) (removing "constructor" keyword)

    var lastName: String? = null                      // mutableProperty2 (String?)   
 
    init                                      
    {  println("init block of PrimaryConstructor called")  }       
 
    constructor(str1: String, str2: String): this(str1)   // secondary constructor           
    {  println("SecondaryConstructor called")
       this.lastName = str2  }

}


fun main() 
{
    val s1: Student = Student("John")                       // creating object s1 by calling PrimaryConstructor
    println("Name of the student1 is: ${s1.firstName} ${s1.lastName}\n")
 
    val s2: Student = Student("John", "Doe")                // creating object s2 by calling SecondaryConstructor
    println("Name of the student2 is: ${s2.firstName} ${s2.lastName}\n")
 
    val t1: Teacher = Teacher()                             // creating object t1 by calling PrimaryConstructor
    println("Name of the teacher1 is: ${t1.firstName} ${t1.lastName}\n")

    val t2: Teacher = Teacher("Tom", "Biden")               // creating object t2 by calling SecondaryConstructor
    println("Name of the teacher2 is: ${t2.firstName} ${t2.lastName}\n")
}










