import java.util.*

fun main()
{
//    val x:String?= "Coding Ninjas"
//    val y:String=x
//    println(y)
//
//    val x =3
//    customfunc <Int>(7/x)
//    customfunc <Int>(7/x.toFloat())

//    val obj= customClass<Double>()
//    obj.customfunc("Generics are fun")

//    val string:Any?= "null"
//    val obj= CodeClass<Any>()
//    obj.newfunc(string)

//    val string:Any= "null"
//    val obj= customClass<Any>()
//    obj.customfunc(string)

//    val list= mutableListOf<String>("John")
//    var newlist= mutableListOf<Object>()
//    newlist= list
//    val list= mutableListOf<Number>(3)
//    var newlist= mutableListOf<Any>()
//    newlist= list
//    println(newlist)

//    val cage = zoo<sloth>()
//    val Cage: zoo<bear> = cage

//    val scoreArray: MutableList<Any> = mutableListOf(3,4)
//    val shooter: MutableList<Int> = mutableListOf(1,2,3)
//    Football().shoot(shooter,scoreArray)
//    println(scoreArray[3])

//    val StringArray = arrayOf("Hello", "World")
//    acceptAnyArray(StringArray)
//    acceptStarArray(StringArray)

    printVal(5)

}
fun <T:Any> printVal(value:T){
    if(value is Number){
        println("Number value: $value")
    }
}
fun acceptAnyArray(array: Array<Any?>) {}
fun acceptStarArray(array: Array<*>) {}
fun <T> customfunc(content: T) {
    println(content)
}
class customClass<T> {
    fun <T>customfunc(stringPar: T){
        println(stringPar)
    }
}
class CodeClass<T: Any> {
    fun newfunc(string: Any){
        println(string)
    }
}
class ccustomClass<T: Any?> {
    fun customfunc(stringPar: Any?){
        println(stringPar)
    }
}

open class mammal
class sloth: mammal()
class bear: mammal()
class zoo<out T> {
    fun get(): T{TODO()}
}
class Football{
    fun shoot(shoot: MutableList<out Any>, scoreList: MutableList<Any>) {
        for(i in shoot.indices)
            scoreList.add(shoot[i])
    }
}