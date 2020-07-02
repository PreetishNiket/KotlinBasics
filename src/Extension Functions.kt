class Main(val firstName:String,val lastName:String)
fun Main.fullName()="${this.firstName} ${this.lastName}"
fun main() {
    val main = Main("Jonas", "Kahnwald")
    println("The full name iof the student is:${main.fullName()}")
}