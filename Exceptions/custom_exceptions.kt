/*

Custom Exception
*exceptionThrownByUs (byCreatingObjectOfExceptionClass andPassingTheMessage)
*itIsMoreUseful whenWeAreCreatingSomeLibrary whichWillBeUsedByOthers                                 
*seriesOfFunctionCallsAreShownByCompilerInErrorStatement useItToFindOutTheWrongFunction 
*e.g. "ExceptionClass"Exception, "UserDefinedClass"Exceptions
 
*/


import java.lang.Exception                                 // libraryHavingClassesRelatedToException raising/handling                

 
fun printFirstName1(name: String)
{
    if(name.length < 3)
    throw Exception("Name too short 1")                   // "Exception"NamedExceptionThrownByUs usingInbuilt"ExceptionClass"                                                                        

    println(name)
}

                                                          // userDefinedClass toThrowCustomException
class ShortNameException(msg: String): Exception(msg)                      

fun printFirstName2(name: String)
{
    if(name.length < 3)
    throw ShortNameException("Name too short 2")          // "ShortNameException"NamedExceptionThrownByUs usingUserDefined"ShortNameExceptionClass"                                                                        

    println(name)
}


fun main()
{ 
    printFirstName1("as")               // "Exception"NamedException

    printFirstName2("as")               // "ShortNameException"NamedException
}





















