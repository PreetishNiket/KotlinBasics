import java.util.*

fun main(args: Array<String>) {
    val read = Scanner(System.`in`)
    val n = read.nextInt()

    printStarPattern(n)
}

fun printStarPattern(n: Int) {
    //write your code here
    (1..n).forEach{x->
        repeat((1..(n-x)).count()) { print(" ") }
        repeat((1 until 2*x).count()) { print("*") }
        println()

    }

}

