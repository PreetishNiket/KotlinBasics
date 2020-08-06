class Main(val firstName:String,val lastName:String)
fun Main.fullName()="${this.firstName} ${this.lastName}"
fun Int.triple(): Int { return this * 3 }
var result = 3.triple()

fun main() {
    val main = Main("Jonas", "Kahnwald")
    println("The full name iof the student is:${main.fullName()}")
    val arr= arrayOf(1,2,3)
    val list= listOf(1,2,3)
}