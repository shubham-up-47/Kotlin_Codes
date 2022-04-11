/*

Interface (similar to abstract class)
*a class can inherit as many interfaces as required (MultipleInheritance)
*it is not a class so its object/constructor can't be made                           
*use "interface" keyword to create it 
(interface/functionInInterface/variableInInterface are always inheritable/overridable so no need of "open" keyword)


Note:
*In Kotlin, We can inherit from one class only i.e no MultipleInheritance, that's why interface is introduced                      
*StudentInheritedFromPerson => Student=Person also, but if Student=Footballer also, then to represent this we use interface
*When aParentClassObjectIsRequired, weCanPassObjectOfChildClass (e.g. playFootball & printName function)

*/


            // interface
interface Footballer   
{
    val position: String 

            // incomplete function          
    fun dribble()         
    
    fun kick()
    {   println("Kick the football")   }
}
           // inheritable class
open class Person(val name: String) 

           // inheriting StudentClass from PersonClass, FootballerInterface
class Student(name: String, override val position: String): Person(name), Footballer
{     
    override fun dribble()    
    {   println("Dribble the ball")   }      // making incomplete function complete                                                                  
}


fun main()
{
    val s1 = Student("John", "Striker")                               
    
    playFootball(s1) 
    printName(s1)
}

 // Student is Person as well as Footballer                                                                       
 
fun playFootball(s1: Footballer)
{  
    s1.dribble()
    s1.kick()
}

fun printName(s1: Person)
{
    println("Person name is: ${s1.name}")
}






 