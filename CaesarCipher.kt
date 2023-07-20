package lanltn.com.hackerrank_resolved_kotlin.hackerrank

import java.util.Locale
import kotlin.io.*
import kotlin.text.*

/*
 * Complete the 'caesarCipher' function below.
 *
 * The function is expected to return a STRING.
 * The function accepts following parameters:
 *  1. STRING s
 *  2. INTEGER k
 */


fun caesarCipher(s: String, k: Int): String {
    var newStr = ""
    val lower = "abcdefghijklmnopqrstuvwxyz"
    for (i in s.indices) {

        newStr += if (s[i] in lower || s[i] in lower.toUpperCase()) {
            // Just transform alphabet letter
            val changedValue = s[i].toInt() + k % 26
            val transformedValue =
                // In case letter changed out of range [a-z] [A-Z] -> need to restart position

                if ((s[i] in lower && changedValue > 'z'.toInt()) ||
                    (s[i] in lower.toUpperCase() && changedValue > 'Z'.toInt())
                )
                    changedValue - 26
                else
                    changedValue
            transformedValue.toChar()
        } else
            s[i]

    }
    return newStr
}

fun main(args: Array<String>) {
    val n = readLine()!!.trim().toInt()

    val s = readLine()!!

    val k = readLine()!!.trim().toInt()

    val result = caesarCipher(s, k)

    println(result)
}



