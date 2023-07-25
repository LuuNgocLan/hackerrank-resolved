package lanltn.com.hackerrank_resolved_kotlin.hackerrank


/*
 * Complete the 'pairs' function below.
 *
 * The function is expected to return an INTEGER.
 * The function accepts following parameters:
 *  1. INTEGER k
 *  2. INTEGER_ARRAY arr
 */

/**
 * Sort the array arr
 * Take two pointers, l, and r, both pointing to 1st element
 * Take the difference arr[r] – arr[l]
 * If value diff is K, increment count and move both pointers to next element
 * if value diff > k, move l to next element
 * if value diff < k, move r to next element
 * return count
 * */

fun pairs(k: Int, arr: Array<Int>): Int {
    var count = 0
    arr.sort()
    var l = 0
    var r = 0

    while (r < arr.size) {
        if (arr[r] - arr[l] == k) {
            count++
            l++
            r++
        }
        else if (arr[r] - arr[l] > k) {
            l++
        } else {
            r++
        }
    }
    return count
}

fun main(args: Array<String>) {
    val first_multiple_input = readLine()!!.trimEnd().split(" ")

    val n = first_multiple_input[0].toInt()

    val k = first_multiple_input[1].toInt()

    val arr = readLine()!!.trimEnd().split(" ").map{ it.toInt() }.toTypedArray()

    val result = pairs(k, arr)

    println(result)
}
