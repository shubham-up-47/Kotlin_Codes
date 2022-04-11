/* 

Extension Function 
*it helps in addingNewFeaturesToTheClass without inhering/disturbingItsCode/usingDesignPattern                                   


Note:
*magical feature of Kotlin
*we can create ExtensionFunction of UserDefinedClass as well as SystemClass
*variables in Kotlin are objects of SystemClasses like Int/String / Float / Any(parentClassOfAll) etc                                   

*/

            // StudentClass
class Student(val firstName: String, val lastName: String)  

            // ExtensionFunction of StudentClass(UserDefinedClass) (newFeatureWhichReturnsFullname)                                         
fun Student.fullName() = "${this.firstName} ${this.lastName}" 

            // ExtensionFunction of IntClass(SystemClass) (newFeatureWhichReturnsClosestEvenNo) 
fun Int.getEven(): Int
{
    if(this%2 == 0)
    return this
    else
    return (this+1)   
}                                                  
                                            

fun main()
{
    val s = Student("John","Doe")        // StudentObject
    println("The full name of student is: ${s.fullName()}")

    val x: Int = 23                       // IntegerObject 
    println("The even age is: ${x.getEven()}")
}










