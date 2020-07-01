open class Routine{
    fun eat(){
        println("EAT")
    }
    open fun sleep(){
        println("SLEEP")
    }

    fun repeat(){
        println("REPEAT")
    }
}
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