/* 

Sealed Class (group of classes sealed by parent class)
*it is used to represent a restricted class hierarchy (group of restricted subclasses insideTheDefinationOfClass)                                                    


Note:
*use "sealed" keyword to declare SealedClass   
*in SealedClass, all the subclasses can have different properties but in EnumClass, all the constants have same property defined inConstructorOfEnumClass                                              
*in SealedClass, each subclass can have different instances (propertiesBelongingToObject) but in EnumClass each constant can't have different instances (propertiesBelongingToObject) bcz EnumClassObjectsAreConstants
 
*/


/* 

*Here, we are tryingToFetchSomeDataFromNetwork so NetworkState (a SealedClass) is defined 
*NetworkState tells state of the fetching request
 
*/
 
                     // (ErrorDataClass, LoadingObject, LoadedDataClass) are inherited from (NetworkStateSealedClass)     
sealed class NetworkState
{ 
                     // ErrorDataClass is activated ifRequestIsFailed (having property "errorText" whichStoresSignalToBeGivenOnError)
    data class Error(val errorText: String): NetworkState()         

                     // LoadingObject is activated ifRequestIsInProcess (next chapter topic)                              
    object Loading: NetworkState()

                     // LoadedDataClass is activated ifRequestIsCompleted (having property "content" whichStoresDataFetchedFromNetwork)       
    data class Loaded(val content: String): NetworkState()
}


fun main()
{                         // creating object of LoadedDataClass (which tells requestIsCompleted) & passing stringData            
    val n: NetworkState = NetworkState.Loaded("Data XYZ loaded")

    processState(n)       // printing NetworkState of "n"
}


fun processState(s: NetworkState)
{  
    when(s)     
    {
        is NetworkState.Error -> {  println("Error occurred: ${s.errorText}")  }
        is NetworkState.Loading -> {    }
        is NetworkState.Loaded -> {  println("Content: ${s.content}")  }
    }      // using typecheck "is" & all cases are covered so no need of else
}










 