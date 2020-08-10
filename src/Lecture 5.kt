//fun doSomething(x:Int,fn: (x:String,y:Int)->Int):Int{
//    val x="Coder"
//    val result=fn(x,20)
//    print(result)
//    return result+1
//}
//var lambda1 = { println("Lambda expression") }
//
//fun KotlinForAndroid.main(){
////    val result=doSomething(2) { x, y->x.length/y}
////    print(result)
//   // lambda1()
//    val input:String="Big Bang Theory"
//    val lambda:(Int)->Int={a->input.length*a}
//    print(lambda(17))
//}


//fun KotlinForAndroid.main(args: Array<String>){
//    println("Main function,")
//    inlinedFunc({ println("Lambda1,")
//        return
//    },
//            { println("Lambda2,")} )
//
//    println("Main function ends,")
//}
//
//inline fun inlinedFunc( crossinline lmbd1: () -> Unit, lmbd2: () -> Unit  ) {
//    lmbd1()
//    lmbd2()
//}


//var lambda = {a: Int , b: Int -> a - b }
//fun higherfunc( lmbd: (Int, Int) -> Int) {
//    var result = lmbd(2,-4)
//    println("The sum of two numbers is: $result")
//}
//
//fun KotlinForAndroid.main(args: Array<String>) {
//    //higherfunc(lambda)
//}

//fun KotlinForAndroid.main() {
//    val integers = arrayOf(1,-2,3,-4,5,-3,-6,-1)
//    println(integers.filter {  it > -3 })
//
//}


//fun myFunction():()->Unit{
//    var a=1+(-3)
//    var lambda= {
//        print(a);
//        a /= 5
//    }
//    return lambda
//}
//fun KotlinForAndroid.main() {
//    var mylambda=myFunction()
//    mylambda()
//    mylambda()
//}



//fun<T> higherFunction(value: T, abc: (value: T) -> Unit) {
//    println(abc(value))
//}
//fun KotlinForAndroid.main(){
//    val printValue : (Any) -> String = {value -> "value:$value"}
//        higherFunction("123", printValue)
//}

//fun KotlinForAndroid.main(){
//    var res = 0
//    val myList = listOf(1,2,3,4,5,6,7,8,9,10)
//    myList.forEach {
//        var curr = it
//        res+=curr
//    }
//    println("sum: $res, lst: $curr")
//}



//fun Int.multi() = this * this * this
//fun KotlinForAndroid.main() {
//    println(2.multi()+2)
//}

//fun printMe(s:String): Unit{
//    println(s)
//}
//fun higherfunc( str : String, myfunc: (String) -> Unit){
//    myfunc(str)
//}
//fun KotlinForAndroid.main(args: Array<String>) {
//
//    higherfunc("Anyone can be a coding ninja!",::printMe)
//}



//inline fun performOp(number:Int,fn:(Int)-> Unit ){
//    fn(number)
//}
//fun KotlinForAndroid.main() {
//    val number: Int = 255
//    val string:String= "Value"
//    performOp(number){
//        println("$string:"+number.and(254))}
//
//}

//inline fun performOp(number:Int,noinline fn:(Int)-> Unit)
//{
//    doOp(fn)
//}
//
//fun doOp(fn:(Int)-> String){
//    fn(2)
//}
//fun KotlinForAndroid.main() {
//    performOp(3) {println("New Number")}
//}




//inline fun crossInlineTest(arg: String, crossinline func: (String) -> Unit) {
//    func(arg)
//}
//
//fun KotlinForAndroid.main(arg: Array<String>) {
// crossInlineTest("Hello") {
//       println(it)
//       return
// }
//    println("Main finished")
//}

//fun KotlinForAndroid.main(args: Array<String>){
//    println("Main function starts,")
//    inlinedFunc({ print("Lambda expression 1,")
//        return
//    },
//            { print("Lambda expression 2,")} )
//
//    print("Main function ends")
//}
//
//inline fun inlinedFunc( lmbd1: () -> Unit, lmbd2: () -> Unit) {
//    lmbd1()
//    lmbd2()
//}


fun main(args: Array<String>) {
    print(flag)
}
fun foo(i: Int ): Int{
    var a =  i
    return a
}
inline var flag : Boolean
    get() = foo(10 ) == 10
    set(flag) {flag}