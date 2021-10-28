//fun KotlinForAndroid.main()
//{
//   // val number1:String?= null
//    //println(number1!!.length?:0)
////    val number1:Double=10.0
////    val sVal:Long=number1
////    println(sVal)
//
////    val x:Int=7
////    val y:Long?=x as? Long
////    println(y)
////    var output:String?=null
////    var substring="Coding Ninja"
////    output=conCater(substring)+":"+addNumber(3,4)
////    println(output)
//}
//fun addNumber(x: Int, y: Int)=x*y
//
//fun conCater(substring: String)="The Result is"
//fun KotlinForAndroid.main(){
//    val x:Int=8
//    returntype(x)
//}
//
//fun returntype(x:Int){
//    return null
//}

fun student(name: String="Praveen", standard: String="IX" , rollNo: Int=11) {
    println("Name of the student is: $name")
    println("Standard of the student is: $standard")
    println("Roll no of the student is: $rollNo")
}
fun main(args: Array<String>) {
    val name = "Gaurav"
    val standard = "VIII"
    val roll = 25
    student(standard=standard)
}



//////////////-Yash/////
fun main() {

    RoutineChecker(object:Routine(){
        override fun sleep(){

            println("CODE REPEAT")
        }
    })
}
fun RoutineChecker(routine:Routine)
{
    routine.sleep()
}
