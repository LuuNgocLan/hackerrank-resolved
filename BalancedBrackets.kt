package lanltn.com.hackerrank_resolved_kotlin.hackerrank

import java.io.*
import java.math.*
import java.security.*
import java.text.*
import java.util.*
import java.util.concurrent.*
import java.util.function.*
import java.util.regex.*
import java.util.stream.*
import kotlin.collections.*
import kotlin.comparisons.*
import kotlin.io.*
import kotlin.jvm.*
import kotlin.jvm.functions.*
import kotlin.jvm.internal.*
import kotlin.ranges.*
import kotlin.sequences.*
import kotlin.text.*

/*
 * Complete the 'isBalanced' function below.
 *
 * The function is expected to return a STRING.
 * The function accepts STRING s as parameter.
 */

fun isBalanced(s: String): String {
    // Use Stack to check
    var brackets = Stack<Char>()

    //traverse string
    for (i in s.indices) {
        //push all open brackets to stack
        if (s[i] == '(' || s[i] == '[' || s[i] == '{') {
            brackets.push(s[i])
            continue
        }
        //no open bracket -> wrong input
        if (brackets.empty()) return "NO"

        //if s[i] is close char -> check similar type
        val check: Char
        when (s[i]) {
            ')' -> {
                check = brackets.pop()
                if (check == '{' || check == '[') return "NO"
            }

            '}' -> {
                check = brackets.pop()
                if (check == '(' || check == '[') return "NO"
            }

            ']' -> {
                check = brackets.pop()
                if (check == '(' || check == '{') return "NO"
            }
        }
    }
    return if (brackets.isEmpty()) "YES" else "NO"
}

fun main(args: Array<String>) {
    val t = readLine()!!.trim().toInt()

    for (tItr in 1..t) {
        val s = readLine()!!

        val result = isBalanced(s)

        println(result)
    }
}
