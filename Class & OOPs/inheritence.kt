/*
 
Inheritence
*a class (parent class) passing some values (variables & functions) to another class (child class)                                       
*a parent class can have any no of child class
*code of parent class is reused in child classes
 

Note:
*(parent/base/super class) & (child/derrived/sub class)
*use "open" keyword to make class inheritable  
*use "open" keyword to make property (variable/function) overridable
*use "super" keyword to access property of parent class in child class  
*inheritance is only possible if the parentClass is declared with the "open" keyword.                           


*In Kotlin, Any class is parent of all the classes  
*In Kotlin, We can inherit from one class only i.e. Multiple inheritance is not possible        

*/


open class Person(val name: String)           
{                                              // inheritable class
    init
    {   println("This is a person")   }

    var age1: Int = 15
    open var age2: Int = 18                     // overridable variable 

    fun doWork1()
    {   println("Person is doing work1")   }
 
    open fun doWork2()               
    {   println("Person is doing work2")   }   // overridable function
}

                   // override variable "age2" (variable of parent class defined in another way for child class)     
class Student(name: String, val school: String, override var age2: Int): Person(name)    
{                  // making Person class (calling primary constructor) as its parent class                                                                          
    init
    {   println("This is a student")   }

                   // override function "doWork2" (function of parent class defined in another way for child class)                                 
    override fun doWork2()          
    {   super.doWork2()
        println("Student of age ${super.age2} is doing work2")   }
}

                              
fun main()
{
    val student1 = Student("John", "DP School", 10)
    student1.doWork1()                                     // inherited property
    student1.doWork2()                           
    println("The age of student is ${student1.age1}")      // inherited property
    println("The age of student is ${student1.age2}") 
   
            // weCanCreateChildClassObject byMentioningItOfParentClassType (StudentInheritedFromPerson => Student=Person also) (Any is parent class of all the classes)            
    val person1: Person = Student("Mark", "Doe", 20)       
    val x: Any = 4                                          
    val y: Any = "Mark" 
}










