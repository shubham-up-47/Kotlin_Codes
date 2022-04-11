/*

Visibility Modifiers
*it controls the visibility of elements to outside code            
*classes, objects, functions, interfaces, properties, constructors all can have visibility modifiers                                                
 
______________________________________________________________________________________________________
[VisibilityModifiers]                 [ClassLevel]                    [TopLevel]                 
(Keyword used for element)  (if elements is inside the class)   (if elements is outside the class)

   public (default)               visible everywhere                  visible everywhere
  
      internal                   visible in a module                 visible in a module  
  
     protected                 visible inside the class        protected element is not possible
                             and subclass(inherited class)            outside the class
 
      private                  visible inside the class             visible inside the file
______________________________________________________________________________________________________
 
*module will be taught in android studio

*/
 

      // private PrimaryConstructor (visible inside the class), now studentClassObjectCanBeCreatedUsing SecondryConstructor only                                                             
class Student private constructor(val name: String="Mark")    
{   
    constructor(firstName: String, lastName: String): this("$firstName $lastName")   
}
 
      // private class (visible inside the file)
private fun outsideFunction()                 
{   println("This is outsideFunction")   }
 
 
var outSideProperty: String = "outside"  // public global variable (by default)
 

class Teacher 
{
    val name = "John"                   // public variable (by default)
    internal val school = "DP School"   // internal variable (visible in a module)
    private var onLeave = false         // private variable (visible inside the class)
    fun isAvailable() = !onLeave        // public function (by default)
    protected var parkingSlot = 1       // protected variable (visible inside the class & subclass)
}


fun main()
{
    val s = Student("John", "Doe")
    println("Name of the student is: ${s.name}")
 
    outsideFunction()

    val t = Teacher()
    println("The school is: ${t.school}")
    println("Teacher's name is: ${t.name}")
    println("Teacher is available: ${t.isAvailable()}")
}












 