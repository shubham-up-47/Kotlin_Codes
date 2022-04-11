/* 

Data Class
*it is only used to store data 
*it can have only properties in its constructor    
*it considers only propertiesInsideTheConstructor for inbuilt equals() / toString() / copy() functions                                                 

Note:
*use "data" keyword to declare data class 
*generally we dont create any property in {} block of DataClass bcz it considers only propertiesInsideTheConstructor                                                      
                
*/     
        
             // only properties in constructor
data class Student(val name: String, var section: String)
{
    var age: Int = 8         // useless property for data class                        
}


fun main()
{
    val s1 = Student("John", "A")
    s1.age = 10

    val s2 = Student("John", "A")

             // equals() / toString() / copy() functions are inherited from "Any" class i.e. universal parent class in Kotlin
        
             // equals (it compares two objects & returns truth value) 
    println("Comparing objects: ${s1.equals(s2)}")      // age is not compared bcz it doesn't belong to propertiesInsideTheConstructor
       
             // toString (it prints property name & values)
    println("Accessing data of object: ${s1.toString()}")
        
             // copy (it helps in copying one DataClassObject to another, we can change valueOfProperty while copying)
    val s3 = s1.copy(name="Mark")            // changing value of name while copying        
    println("Data of new object: ${s3.toString()}")     
            
             // destructuring (storing propertyValues of the objects in variables)
    val(name, section) = s1 
    println("Data found after destructuring: Name=$name and Section=$section")
}


 




 










