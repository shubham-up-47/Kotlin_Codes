/*  
   var PropertyName: PropertyType = PropertyInitializer                {Syntax to create property inside class}                                       
                      (optional)        (optional)

   getter & setter are provided by kotlin to get/set PropertyValue             
   get() = getter/accessor (if we try to accesss value of that property then this function is called)      
   set() = setter/assigner (if we try to assign a value to that property then this function is called)  

*/

class Student
{
     val school: String = "DP School"    // immutableProperty 1 (String)   
  
     var age: Int = 5                    // mutableProperty 2 (Int)           

     val isTeenager: Boolean             // mutableProperty 3 (Boolean)        
         get() = age > 12                // accessing isTeenager (Boolean) will return truthValueOfCondition (age>12)              

/*    
     var name: String? = null            // mutableProperty 4 (String?)  
         get() = name ?: "Unknown"       // if weTryToAccess name in getter, then againGetterWillBeCalled i.e. infiniteGetterCalls (Error) 

     That's why, we access PropertyValue using "field" keyword (similar to "this" keyword in C++) in getter/setter     
*/ 
     var name: String? = null            // mutableProperty 4 (String?)  
         get() = field ?: "Unknown"      // ?: (elvis operator) returns value on RHS, if LHS value is null                      
         set(value)
         {   if(value != null) 
             field = value   }  
}


fun main()
{
    val student: Student = Student()    // creating object by calling constructor of class                     

    println("Student is a teenager: ${student.isTeenager}")
    student.age = 14
    println("Student is a teenager: ${student.isTeenager}")

    println("Student's name is: ${student.name}")
    student.name = "John"
    println("Student's name is: ${student.name}") 
}


// Kotlin = Object Oriented Programming Language (class containing properties & functions, Objects of class)  

 
 




