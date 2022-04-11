/* 

Type  
*type of variable/object is mentioned after ":" in their defination                                                   
*type ofTheVariable is its datatype
*type ofTheObject is its correspondingClass/parentClass


Subtype
*type ofChildClass is subtype ofParentClass               
*corresponding nonNullableTypes (Int/String/Float/Person/Student) is subtype of nullableType (Int?/String?/Float?/Person?/Student?)
*whenever parentTypeObject/VariableIsRequired weCanPassObject/VariableOfChildtype (subtype) 


Note:
*type of variable/object decides whatValuesItCanStore & whatActionsItCanPerform                              
*type ofTheVariable can be nullable/nonNullable datatype          
*type ofTheChildClassObject canBeItsParentClass ifWeMentionParentClass inDefinationOfChildClassObject                                                                                                   
*Int/String/Int?/Float/String?/Any are SystemTypes
*UserDefinedClasses are UserDefinedTypes                

*/

 
open class Person(val name: String)

class Student(name: String): Person(name)


fun main() 
{ 
    val age: Int = 22                          // type = Int
    val rollNumber: Int? = 4                   // type = Int? (assigning subtype variable/object)       

 
    val student1: Student = Student("John")    // type = Student
    val person1: Person = student1             // type = Person     
                 // it will be easily accepted bcz student1 has all the values which can be used to initialize parent class variables                                               

    val s1: String = "John"                    // type = String
    val s2: String? = s1                       // type = String? (assigning subtype variable/object)                
                // it will be easily accepted bcz s1 will never be null so no chances of error anywhere              
}



  









