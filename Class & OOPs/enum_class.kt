/* 

Enum Classs (like Ordered Hash Map having (name,valueInsideTheBracket))
*enum are setOfConstants which represent possibleSetOfValues (name,valueInsideTheBracket,position) for a variable          


Note:   
*use "enum" keyword to declare EnumClass & use "," to seperate constants                                                     
*Possible valuesForPropertyDefinedInConstructor (here "symbol") are valuesInsideTheBracketOfConstants (here "Fe","Au","Ag") 
*"name" (constant's name) & "ordinal" (constant's position) are defaultPropertiesProvidedToEachConstant      
*enum constants are objects of enum class  
*values() function (gives all the constants present in enum class)

*/
 
                     // enum class (declared using constructor)                               
enum class Metal(val symbol: String)
{                    // here "symbol" is a property in EnumClass (Fe/Au/Ag are possible values for property symbol)
      IRON("Fe"), 
      GOLD("Au"),                             
      SILVER("Ag")   
}     

enum class Color(val rgb: Int) 
{
   RED(0xFF0000),
   GREEN(0x00FF00),
   BLUE(0x0000FF)
}
 

fun main()
{
      for(i in Metal.values())      // iterating to constants of MetalEnumClass ((IRON,Fe,0), (GOLD,Au,1), (SILVER,Ag,2) are possibleSetOfValues for variable "i")                       
      {
          println("Name: ${i.name}, Symbol: ${i.symbol}, Position: ${i.ordinal}")
      }
 
      printMetal(Metal.GOLD)

      for(color in Color.values()) 
      println(color.rgb)            // printing decimalRepresentationOfTheHexadecimalColorValues for Red, Green & Blue
}


fun printMetal(m: Metal)          
{                                     // (GOLD,Au,1) is possibleSetOfValue for variable "m"
      println("${m.name}, ${m.symbol}, ${m.ordinal}")
}






 



