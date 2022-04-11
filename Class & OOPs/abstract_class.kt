/*

Abstract Class (an incomplete class)
*it contains abstract function (an incomplete function)
*we can't create its object          
*we can create object of its child class (ifChildClassContainsCompleteFormOf abstractFunctionInAbstractClass)         

*use "abstract" keyword to make abstract class/function  
(abstract class/function are always inheritable/overridable so no need of "open" keyword)

*/


           // abstract class                  
abstract class Person(val name: String)
{ 
           // abstract function
    abstract fun doWork()        
 
}

class Student(name: String, val school: String): Person(name)
{
    override fun doWork()
    {   println("Student is studying")   }
}


fun main()
{
    val s1 = Student("John", "DKP School")
    s1.doWork()
}







