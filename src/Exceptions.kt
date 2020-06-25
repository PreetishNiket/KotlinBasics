//fun main(){
//    val exception: Int= 1/0
//    println(exception)
//}

//
//
//class MyException(msg:String):Exception(msg)
//
//fun ExceptionWorker(num:Any){
//
//    if(num is Long){
//
//        throw MyException("Long not allowed")
//    }
//    if(num is Int){
//        throw MyException("Int not allowed")
//    }
//    if(num is String){
//        throw MyException("String not allowed")
//    }
//}
//
//fun main() {
//
//    val num="1_00_00_00_00_00_00_001"
//    ExceptionWorker(num)
//
//}




//fun main(args: Array<String>) {
//    test("abcd")
//    println("executes after the validation")
//}
//fun test(password: String) {
//    if (password.length < 6)
//        throw ArithmeticException("Password is too short")
//    else
//        println("Strong password")
//}


//fun main(){
//
//    try{
//        return
//    }
//    catch(ex: Exception){
//
//    }
//    finally{
//        println("Inside finally block")
//    }
//
//}


//fun main(args: Array<String>) {
//    try{
//        val a = IntArray(5)
//        a[10] = 99
//    }
//
//    catch(e: Exception){
//        println("Some error occurred")
//    }
//    catch(e: ArithmeticException){
//        println("ArithmeticException occurred")
//    }
//    catch(e: NumberFormatException){
//        println("Number format exception")
//    }
//    catch(e: ArrayIndexOutOfBoundsException){
//        println("Array index is out of range")
//    }
//    println("Out of try catch block")
//}


//fun main(args : Array<String>){
//    try{
//        var ar = arrayOf(1,2,3,4,5)
//        var int = ar[6]
//        println(int)
//    }
//    finally {
//        println("This block always executes")
//    }
//}



//fun main (args: Array<String>){
//    try {
//        var int = 10 / 0
//        println(int)
//    } catch (e: ArithmeticException) {
//        println(e)
//    } finally {
//        println("This block always executes")
//    }
//}



fun main(args: Array<String>) {
    try{
        val a = IntArray(5)
        a[10] = 99
    }
    catch(e: ArithmeticException){
        println("ArithmeticException occurred")
    }
    catch(e: NumberFormatException){
        println("Number format exception")
    }
    catch(e: ArrayIndexOutOfBoundsException){
        println("Array index is out of range")
    }
    catch(e: Exception){
        println("Some error occurred")
    }

    println("Out of try catch block")
}