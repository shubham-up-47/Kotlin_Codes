/*

Polymorphism
*object behaving differently for the same class                                    
 
*/
 
open class Vehicle
{                 // inheritable class
    open fun startEngine()
    {      }
}

class AudiCar(): Vehicle()
{                // making Vehicle class as its parent class 
    override fun startEngine()
    {
        println("AudiCar starting the engine")
        super.startEngine()
    }
}

class BMWCar(): Vehicle()
{                // making Vehicle class as its parent class 
    override fun startEngine()
    {
        println("BMWCar starting the engine")
        super.startEngine()
    }
}


fun main() 
{
    val a1: AudiCar = AudiCar()      // creating object of AudiCar class  
    startAudiCar(a1)

    val b1: BMWCar = BMWCar()        // creating object of BMWCar class                    
    startBmwCar(b1)


    val a2: Vehicle = AudiCar()      // creating object of AudiCar class  
    startCar(a2)

    val b2: Vehicle = BMWCar()       // creating object of BMWCar class                        
    startCar(b2)
}


fun startAudiCar(a: AudiCar)
{   a.startEngine()   }

fun startBmwCar(b: BMWCar)
{   b.startEngine()   }


fun startCar(car: Vehicle)
{   car.startEngine()   }       // object a2 & b2 behaving differently for the same Vehicle class (Polymorphism)                                               







 
