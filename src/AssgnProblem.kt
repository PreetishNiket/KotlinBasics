import java.util.*

fun main()
{
    val read = Scanner(System.`in`)

    //printAP(x)
    //printFactors(x)
    //printSumOddEven(x)
    val size = read.nextInt()
    val arr = IntArray(size){ read.nextInt() }
    var x = read.nextInt()
   // printPairsWithSum(arr, size, x)
}
fun printAP(num : Int) {
var x=num
    var n=1
    while (x>0){
        var result=3*n+2
        if (result%4!=0)
        {
            print(result)
            print(" ")
            x--
        }
        n++
    }
}
fun printFactors(num : Int) {
    var x= num
    var i=2
    while (i<x)
    {
        if (x%i==0)
        {
            print(i)
            print(" ")
        }
        i++
    }
}
fun printSumOddEven(x: Int) {
    //write your code here
    var n =x
    var even=0
    var odd=0
    while (n>0)
    {
        var rem=n%10
        if (rem%2==0)
        {
            even += rem
        }
        else
        {
            odd+=rem
        }
        n /= 10
    }
    print(even)
    print(" ")
    print(odd)
}
fun printPairsWithSum(arr: IntArray, size: Int, x: Int) {
    arr.sort()
    var start=0
    var end=arr.size-1
    while (start<end)
    {
        if (arr[start]+arr[end]==x)
        {
            if (arr[start]==arr[end])
            {
                var count =end-start+1
                var n=count-1
                var totalCount=((n)*(n+1))/2
                while (totalCount>0)
                {
                    print(arr[start])
                    print(" ")
                    print(arr[end])
                    println()
                    totalCount--
                }
                start=end
            }
            else{
                var countStart=0
                var countEnd=0
                var temp=arr[start]
                var i=start
                while (arr[i]==temp&& i<end)
                {
                    i++
                    countStart++
                }
                temp=arr[end]
                var j=end
                while (arr[j]==temp&&j>start)
                {
                    j--
                    countEnd++
                }
                start=i
                end=j
                var ttimes=countStart*countEnd
                while (ttimes>0)
                {
                    print(arr[start-1])
                    print(" ")
                    print(arr[end+1])
                    println()
                    ttimes--
                }
            }
        }
        else if (arr[start]+arr[end]<x)
        {
            start++
        }
        else{
            end--
        }
    }
}