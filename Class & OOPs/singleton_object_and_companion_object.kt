/* 
                                                                                   
Singleton Object/Class (single instance object/class)                                  
*onlyOneInstanceOfItCanBeCreated and canBeAccessedEverywhere                               
*it canBeDefined inside/outside theClass & it can'tHaveConstructors    
*propertiesOfSingleton definedInTheClass canBeAccessed byUsingSingletonName&ClassName                                                                   
                                                                                                                              
                                                                                                                                        
Companion Object          
*it isDefined inside theClass & haveNoName                  
*propertiesOfCompanionObject definedInTheClass canBeAccessed byUsingOuterClassNameOnly alikeSingletons                                                       
                               
                                                                                                                                 
Note:                                                                          
*use "object" keyword to declare a Singleton Object/Class                                                       
*use "companion object" keyword to declare Companion Object                                             
*generally, Singleton Object/Class containsUtilityFunctions whichCanBeUsedBy instancesOf differentClass/SingletonClass                         
*PropertiesOfSingleton definedInTheClass canBeAccessed byUsingSingletonName&ClassName                             
*PropertiesOfCompanionObject definedInTheClass canBeAccessed byUsingClassNameOnly                           
                                                                                                                                                                                      
*/                                                                                                                                                                                 
                                                                                        
                                    // Singleton Object (defined outside the class)                                        
object Gamescore                                                               
{                                                                                 
    var score: Int = 0              // variable as property 1
        private set                 // privateSetter so itsValue can'tBeSet/assignedFromOutside  

    fun addScore(point: Int)   
    {                               // function as property 2                   
        if(point > 0) 
        this.score += point    
    }
}


class Student(val name: String)
{            
                                    // Singleton Object (defined inside the class)                                                      
    object School                 
    {   const val schoolName = "DPS School"   }

                                    // Companion Object (defined inside the class)  
    companion object            
    {   const val schoolName = "DPS School"   }

}


fun main()
{                                 
    Gamescore.addScore(10)          // creating instance of GamescoreSingleton 
    println ("The score is ${Gamescore.score}")

                                    // accessing propertiesOf SingletonObject (defined inside the class)   
    println ("The school name is ${Student.School.schoolName}")

                                    // accessing propertiesOf CompanionObject (defined inside the class) (easily accessible)   
    println ("The school name is ${Student.schoolName}")     
}








