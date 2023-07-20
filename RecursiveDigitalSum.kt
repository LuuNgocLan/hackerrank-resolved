package lanltn.com.hackerrank_resolved_kotlin.hackerrank.recursivedigitalsum

/*
 * Complete the 'superDigit' function below.
 *
 * The function is expected to return an INTEGER.
 * The function accepts following parameters:
 *  1. STRING n
 *  2. INTEGER k
 */

fun superDigit(n: String, k: Int): Int {
    if (k == 1 && n.length == 1) return n.toInt()
    else {
        var numInit = 0L
        //sum all digits in string
        numInit = n.toCharArray().map { Integer.parseInt(it.toString()) }.fold(0L) { x, y -> x + y }
        var p = sumDigit(numInit * k)
        return sumDigit(p.toLong())
    }
}

fun sumDigit(p: Long): Int {
    return if (p < 10)
        p.toInt()
    else
        sumDigit(sumDigit(p / 10) + p % 10)
}

fun main(args: Array<String>) {
    val first_multiple_input = readLine()!!.trimEnd().split(" ")

    val n = first_multiple_input[0]

    val k = first_multiple_input[1].toInt()

    val result = superDigit(n, k)

    println(result)
}
