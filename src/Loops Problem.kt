import java.util.*

fun main(args:Array<String>) {
   //multiplicationTable()
    //Power()
   // reverseNumberPattern()
   // fibonacci()
    //tempConversion()
    duplicateNumber()
}

fun duplicateNumber() {
    val read = Scanner(System.`in`)
    val size = read.nextInt()
    val arr = IntArray(size){ read.nextInt() }
    for (i in 1..arr.size)
    {
        for (j in i+1 until arr.size)
        {
            if(arr[i]==arr[j])
            {
                print(arr[j])
            }
        }
    }
}

private fun multiplicationTable()
{
    val sc = Scanner(System.`in`)
    val n: Int = sc.nextInt()
    for (i in 1..10)
    {
        val result=n*i
        println(result)
    }
}
private fun Power()
{
    val sc=Scanner(System.`in`)
    val x=sc.nextInt()
    var n:Int=sc.nextInt()
    var result=1

    while (n != 0) {
        result *= x
        n--
    }

    println(result)
}
private fun reverseNumberPattern()
{
    val sc=Scanner(System.`in`)
    var n=sc.nextInt()
    var row =1
    var nst=n
    while (row <= n) {
        var cst = 1 ;
        // work to be done in same row
        while (cst <= nst) {
            print(cst);
            cst++;// prep for the next value in same row
        }
        // prep for work to be done for next row
        println();
        row++;
        nst--;
    }
}
private fun fibonacci():Boolean
{
    val sc=Scanner(System.`in`)
    val n=sc.nextInt()
    var first=0
    var second=1
    var result=0
    while (result<n)
    {
        result=first+second
        first=second
        second=result
    }
    if (result==n)
    {
         return true
    }
        return false
}
private fun tempConversion()
{
    val read = Scanner(System.`in`)
    val s = read.nextInt()
    val e = read.nextInt()
    val w = read.nextInt()
    for (i in s..e step w)
    {
        var result=(i-32)/1.8
        print(i)
        print(" ")
        print(result.toInt())
        println()
    }
}