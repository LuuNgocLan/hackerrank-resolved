package lanltn.com.hackerrank_resolved_kotlin.hackerrank.gridchallenge

/*
 * Complete the 'gridChallenge' function below.
 *
 * The function is expected to return a STRING.
 * The function accepts STRING_ARRAY grid as parameter.
 */

fun gridChallenge(grid: Array<String>): String {
    val size = grid.size
    for (i in grid.indices) {
        val tempArr = grid[i].toCharArray()
        tempArr.sort()
        grid[i] = tempArr.contentToString()
    }

    for (i in 0..size - 2) {
        val str1 = grid[i]
        val str2 = grid[i + 1]
        for (j in 0..str1.length - 2) {
            if (str1[j] > str2[j]) return "NO"
        }
    }
    return "YES"

}

fun main(args: Array<String>) {
    val t = readLine()!!.trim().toInt()

    for (tItr in 1..t) {
        val n = readLine()!!.trim().toInt()

        val grid = Array<String>(n) { "" }
        for (i in 0 until n) {
            val gridItem = readLine()!!
            grid[i] = gridItem
        }

        val result = gridChallenge(grid)

        println(result)
    }
}
