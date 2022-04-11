/* 

Nested Class
*class created inside a class 
*we can access it without creating object of outerClass  
*nestedClass can't access the properties of outerClass   


Inner Class
*class created inside a class 
*we can access it only using object of outerClass
*innerClass can access the properties of outerClass   

*/


class Student(val name: String)
{
   class SchoolBag1()
   {
      fun printBagColour()
      {  println("This school is Blue coloured")  }
   }

   inner class SchoolBag2()
   {
      fun printBagOwner()
      {  println("This school bag belongs to: $name")  }
   }
}


fun main()
{
    Student.SchoolBag1().printBagColour()         // accessing NestedClass       
    Student("Mark").SchoolBag2().printBagOwner()   // accessing InnerClass using object of StudentClass                        
}









 

