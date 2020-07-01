interface Fly{

    val flyAbility:String
        get()="TRUE"

}
class Penguin:Fly{
    override val flyAbility:String
        get()="FALSE"
}
fun main() {
    val penguin:Penguin=Penguin()
    println(penguin.flyAbility)
}