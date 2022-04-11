/* 

Contravariance (opposite of covariance)                                                                                             
*it occurs when genericClassOfChildType canBeReplacedBy genericClassOfParentType         
*generic class is made contravariant using "in" modifier
*using "in" modifier parentComplexType (Box<Fruit>) can be assigned to its childComplexType (Box<Apple>)  

*/
    

open class Fruit 
class Apple: Fruit()

                       // DeclarationSiteVariance (bcz we are using variance (Covariance/Contravariance) at declaration of the class) (now Box is contravariant on type T)
class Box<in T>
{                      // allFunctionsInsideBoxClass willTake"T" & willNotReturn"T" (bcz "in T" writtenSoBoxClassIs consumerOfType"T" notProducorOfType"T")                    
    fun put(item: T)
    {    }    
                                          /*
    fun get(): T                          // functionsReturning"T" willCauseError (bcz "in T" writtenSoBoxClassIs consumerOfType"T" notProducorOfType"T")   
    {  TODO("return item of type T")  }   */ 
}
  

fun main()
{
    val fruitBox = Box<Fruit>()

    val appleBox: Box<Apple> = fruitBox    // we can assign parentComplexType (Box<Fruit>) to childComplexType (Box<Apple>) here, bcz "in" modifier used
                                           /*  
    val apple: Apple = appleBox.get()      // we can't get only apples from fruit box so error
                                           */    
 }












