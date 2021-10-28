package kotlinForAndroid

class Concepts {
   // Unlike let, the run function doesn’t support the it keyword.

}


enum class Color(val rgb: Int) {
    RED(0xFF0000),
    GREEN(0x00FF00),
    BLUE(0x0000FF)
}
fun main() {
    for(i in Color.values())
    {
        print(i.rgb)
    }
}
