/* 

Reciever
*it isTheObject onWhichFunctionIsCalled                                                            
*FunctionTypeWithReceiver isSimilarToExtensionFunction                                                                                                          
*"this" keyword isUsedToAccessReceiverObject 

*/


fun main()
{                           // FunctionTypeWithoutReceiver = (Int) -> Unit                                
                            // FunctionTypeWithReceiver = Int.(Int) -> Unit
   // "plus()" functionOfIntClassAdds inputInteger & objectVariableInteger 
   // ("Int." is "type" ofReceiverObject) ("this" isUsedToAccess "Int." input) ("it" isUsed(bczOnlyOneInput)ToAccess "(Int)" input)                                                                                          

                                        // storing LambdaFunctionWithReceiver in a variable (insideLF weCanAccessAllThePropertiesOfTheReceiverObject) 
    val printSum1: Int.(Int) -> Unit = { println("The sum of $this and $it is ${this.plus(it)}") }
    val x1: Int = 6                                                                 
    x1.printSum1(9)

    val printSum2: Int.(Int) -> Unit = { println("The sum of $this and $it is ${plus(it)}") }
    val x2: Int = 6                                     // weCanDirectlyAccess(without"this") propertiesOfReceiverObject                                                                     
    x2.printSum2(9)


                                        // storing AnonymousFunctionWithReceiver in a variable (insideAF weCanAccessAll propertiesOfTheReceiverObject)
    val printSum3: Int.(Int) -> Unit = fun Int.(num: Int) : Unit = println("The sum of $this and $num is ${this.plus(num)}")
    val x3: Int = 6                                            
    x3.printSum3(9)

    val printSum4: Int.(Int) -> Unit = fun Int.(num: Int) : Unit = println("The sum of $this and $num is ${plus(num)}")
    val x4: Int = 6                                     // weCanDirectlyAccess(without"this") propertiesOfReceiverObject                  
    x4.printSum4(9)
}















 