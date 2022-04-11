/* 

Instances (properies belonging to object)
*when we make objectOfTheClass, allTheProperties(variable/function)OfTheClass areCopiedForThatObject making Instances


Note:
*Class Properties (properies belonging to class)
*different objects can haveDifferentInstances / differentValueOfPropertiesBelongingToObject 
*editing Instances (propertiesBelongingToObject) will not affect ClassProperties (propertiesBelongingToClass)                              
 
*/ 
  
 
 class Student
 {
     var age: Int = 18 
 }


fun main()
{
     val student1: Student = Student()                            
 
     println("${student1.age}") 
     student1.age = 22 
     println("${student1.age}")


     val student2: Student = Student()
     println("${student2.age}") 
}












