fun main()
{
//   1. var changeMe= "Coding Ninjas"
//    changeMe= 0xFF_EC_DE_5E
//returnTypeAsVoidSuccess()

//    val a=2
//    val b=3
//    print(XORSUM(a,b))

//    val age = 20
//    println("My age is: " + 20)
//    //println(age/2 + "is the age of my sister")


//    val numbers= arrayOf(1,2,3,4)
//    println(numbers.joinToString("$"))

//    val rateValue: Int= divider(7,3)
//    val result= when(rateValue) {
//        1 -> "Poor"
//        2-> "Good"
//        3-> "Excellent"
//        else->{
//            "No rating"
//        }
//    }
//    println("The rating is: $result")

//    var names=mutableSetOf(1,"2","3","coding ninjas")
//    names.add(1)
//    println(names)

   // noReturn()

//    val name:String? =null
//    println("My name is " + name?: "John") imp
//    var arr  = Array(5){i -> (i+1).toString()}
//    arr.set(5, "6")
//    arr.forEach(
//            print("${it}, ")
//    )

    //for(i in 1 until 10 step 2)
     //   print("$i, ")

//    var i: UInt = 6u //imp
//    do {
//        print("$i, ")
//        i--
//    } while (i<=5u)

    val mySet: Set<Any> = setOf(2,6,4,29,18,4,5)
    val remainList= mySet.drop(29)
    for(element in remainList){
        print("$element, ")
    }
}
//fun printName(name: String) = "My name is " + name
//fun printName(name: String?)="My name is"+{name?:"john"} wrong
//fun printName(name:String="john")="My name is${name}"
//fun printName(name)="My name is${name?:"John"}" wrong
//fun printName(name:String?)="My name is ${name?:"john"}"

fun returnTypeAsVoidSuccess(): Void? {
    println("Function can have Void as return type")
    return null
}

fun XORSUM(a:Int,b:Int)=a.xor(b)

fun divider(input1: Int,input2: Int): Int{
    return input1/input2;
}
//fun noReturn() : Void {
//          print("Inside Function No Return")
//}