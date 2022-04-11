/* 

Covariance    
*it occurs when genericClassOfParentType canBeReplacedBy genericClassOfChildType         
*generic class is made covariant using "out" modifier
*using "out" modifier childComplexType (Box<Apple>) can be assigned to its parentComplexType (Box<Fruit>) 

*/
   
                    
open class Fruit   
class Apple: Fruit()   
class Orange: Fruit() 

                       // DeclarationSiteVariance (bcz we are using variance (Covariance/Contravariance) at declaration of the class) (now Box is covariant on type T)
class Box<out T>      
{                      // allFunctionsInsideBoxClass willReturn"T" & willNotTake"T" (bcz "out T" writtenSoBoxClassIs producorOfType"T" notConsumerOfType"T") 
    fun get(): T
    {  TODO("Return item of type T")  }   
                                 /*
    fun put(item: T)             // functionsTaking"T" willCauseError (bcz "out T" writtenSoBoxClassIs producorOfType"T" notConsumerOfType"T") 
    {       }                    */ 
}
      
 
fun main()
{
    
    val appleBox = Box<Apple>()

    val box: Box<Fruit> = appleBox        // we can assign childComplexType (Box<Apple>) to parentComplexType (Box<Fruit>) here, bcz "out" modifier used
                                          /*  
    fruitBox.put(Orange())                // we can't put orange in apple box so error
                                          */  
} 


 

 








