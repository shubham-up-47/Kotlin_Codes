/* 

Anonymous Class
*use to make small changes (editing variable/function) in a class
 
*/


open class Person
{
    fun walk()
    {   println("Person is walking")   }

    fun sleep()
    {   println("Person is sleeping")   }

    open fun talk()
    {   println("Person is talking")   }
}

       // instead of "Person is talking", we wanted to print "I am talking"
 
fun main()
{
       // calling"startTalking"Function, thenCreatingAnonymousClass byUsing"object"Keyword, thenOverriding"talk"Function                             
    startTalking(   object: Person()   
                    {  override fun talk()       
                       {  println("I am talking")  }  }   )
}


fun startTalking(p: Person)
{ 
    p.talk()                  // calling talk function of PersonClass             
}









