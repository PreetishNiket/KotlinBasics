open  class Vehicle(type:String){
    open val year: Int=2001

    init {
        println("Vehicle")
    }



    fun yearPrinter(){
        println(year)
    }
}

class Car(type:String,override val year:Int): Vehicle(type){
    fun printer(){
        println(super.year)
        super.yearPrinter()
    }
}

fun main() {
    val obj:Car=Car("SUV",2019)
    obj.printer()
}