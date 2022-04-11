/*   

Variance
subtypingOfMoreComplexType  relateWith  subtypingOfTheirComponents
   ( e.g parentClass,                       ( e.g childClass,
MutableList<parentClass> )               MutableList<childClass> )


Note:
*moreComplexType (e.g. MutableList<Student>, MutableList<Person>) = collection storing classObjects like "List" of type "MutableList<Person>"  
*generics are invariant (childComplexType can't be assigned to its parentComplexType)
*Here, MutableList<Student> (childComplexType) is not subtype of MutableList<Person> (parentComplexType) (subtyping not possible so generics are invariant)

*/ 
                                                   
                                        
open class Person(val name: String)

                   // subclasses of Person class                                            
class Student(name: String): Person(name)     
class Teacher(name: String): Person(name) 
 

fun add(group: MutableList<Person>, person: Person) = group.add(person)     // adds "person" object to "group" list                                                      

 
fun main()
{              // listOf() returns a "List" of type "List<datatype>"         
    val nameList: List<String> = listOf("John", "Sarah", "Mark")
    val rankList: List<Int> = listOf(3, 5, 6)

    val student1: Student = Student("John")
    val person1: Person = student1               // student is subype of person (subtyping possible)  
                                                   
/*   
    val studentList: MutableList<Student> = mutableListOf(Student("Jack"), Student("Sarah"))
    val personList: MutableList<Person> = studentList    (compileTimeError)        // MutableList<Student> is not subtype of MutableList<Person> (subtyping not possible so generics are invariant)                                                         
*/    

/*  
    val studentList: MutableList<Student> = mutableListOf()      // emptyList
    val teacher1: Teacher = Teacher("John") 
    add(studentList, teacher1)      // we can't pass "studentList" bcz MutableList<Student> is not subtype of MutableList<Person> (subtyping not possible so generics are invariant)               
    
    val student1: Student = students1.get(0)
*/
}


















