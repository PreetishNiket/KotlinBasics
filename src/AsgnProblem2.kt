//import java.util.*
//
//fun KotlinForAndroid.main(arg:Array<String>)
//{
//    val read=Scanner(System.`in`)
//    val size=read.nextInt()
//    val arr=IntArray(size){read.nextInt()}
//    //print(highestFrequency(arr))
//    //printDuplicateFree(arr)
//    pushZerosToEnd(arr, size)
//    arr.forEach { print(it)
//    print(" ")}
//}
//
//fun highestFrequency(arr: IntArray): Int {
//    val map= mutableMapOf<Int,Int>()
//    arr.forEach {
//        map.putIfAbsent(it,0)
//        map.computeIfPresent(it){_,v->v+1}
//    }
//    var maxVal=-1
//    var sol=-1
//    map.forEach{
//        if (it.value>maxVal)
//        {
//            maxVal=it.value
//            sol=it.key
//        }
//    }
//    return sol
//}
//fun printDuplicateFree(arr: IntArray){
//    var set= mutableSetOf<Int>()
//    arr.forEach {
//        set.add(it)
//    }
//    set.forEach{
//        print(it)
//        print(" ")
//    }
//}
//fun pushZerosToEnd(arr: IntArray,size:Int){
//    var ptr=0
//    for (i in 0 until size)
//    {
//        if (arr[i]!=0)
//        {
//            val temp=arr[i]
//            arr[i]=arr[ptr]
//            arr[ptr]=temp
//            ptr++
//        }
//    }
//}

import java.util.*

class ComplexNumber( private var real:Double, private var img:Double) {

    fun print()
    {
        print(real)
        print(" + ")
        print("i$img")
    }
    fun add(complex2:ComplexNumber)
    {
        real += complex2.real
        img += complex2.img
    }
    fun multiply(complex2:ComplexNumber)
    {
        real=real*complex2.real-img*complex2.img
        img=real*complex2.img+complex2.real*img
    }

}

fun main(args: Array<String>) {
    val read = Scanner(System.`in`)
    val num1Real = read.nextDouble()
    val num1Img = read.nextDouble()
    val complex1 = ComplexNumber(num1Real, num1Img)

    val num2Real = read.nextDouble()
    val num2Img = read.nextDouble()
    val complex2 = ComplexNumber(num2Real, num2Img)

    when (read.nextInt()) {
        1 -> {
            complex1.add(complex2)
            complex1.print()
        }
        2 -> {
            complex1.multiply(complex2)
            complex1.print()
        }
    }
}
