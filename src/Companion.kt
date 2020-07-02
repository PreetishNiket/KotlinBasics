object Gamescore{
    var score:Int=0
    fun addScore(point: Int) {
        this.score+=point
    }
}
class Student(val name:String){
    companion object{
        const val schoolName="St Marks"
    }
}
fun main(){
    Gamescore.addScore(10)
    println("The Score is:${Gamescore.score}")
    println("The Score is:${Student.schoolName}")
}