package org.ye.problem.power_of_four_342

class Solution {
    fun isPowerOfFour(n: Int): Boolean {
        if (n < 1) return false
        if (n == 1) return true
        var previous  = 1
        (0 .. 15).forEach { i ->
            previous = previous shl 2
            if (previous == n) return true
        }
        return false
    }
}

fun main() {
    val solution: Solution = Solution()
    var n = -1
    n = 16
    println(String.format("%d? : %b", n, solution.isPowerOfFour(n)))
    n = 5
    println(String.format("%d? : %b", n, solution.isPowerOfFour(n)))
    n = 1
    println(String.format("%d? : %b", n, solution.isPowerOfFour(n)))
    return
    // where n [-2^31, 0] != any 4^x
    // 1 = 4^0
    // where n [2, 2^31-1] = 4^x
    //
    // 4^0 = 2^0 = 1
    // 4^1 = 2^2 = 4
    // 4^2 = 2^4 = 16
    // 0000 = 0
    // 0001 = 1 = 4^0, n = 1
    // 0100 = 4 = 4^1, n = 4
    // 10000 = 16, 4^2, n = 16

    /*val fP0: Int = 1
    println("0:"+ fP0)
    val fP1: Int = fP0 shl 2
    println("1:"+ fP1)
    val fP2: Int = fP1 shl 2
    println("2:"+ fP2)
    val fP3: Int = fP2 shl 2
    println("3:"+ fP3)
    val fP4: Int = fP3 shl 2
    println("4:"+ fP3)
    val fP5: Int = fP4 shl 2
    println("5:"+ fP5)
    val fP6: Int = fP5 shl 2
    println("6:"+ fP6)
    val fP7: Int = fP6 shl 2
    println("7:"+ fP7)
    val fP8: Int = fP7 shl 2
    println("8:"+ fP8)
    val fP9: Int = fP8 shl 2
    println("9:"+ fP9)
    val fP10: Int = fP9 shl 2
    println("10:"+ fP10)
    val fP11: Int = fP10 shl 2
    println("11:"+ fP11)
    val fP12: Int = fP11 shl 2
    println("12:"+ fP12)
    val fP13: Int = fP12 shl 2
    println("13:"+ fP13)
    val fP14: Int = fP13 shl 2
    println("14:"+ fP14)
    val fP15: Int = fP14 shl 2
    println("15:"+ fP15)
    val fP16: Int = fP15 shl 2
    println("16:"+ fP16)*/
    /*val n = 64
    var previous  = 1
    for (i in 0 .. 15) {
        println(String.format("%d:%d", i, previous))
        previous = previous shl 2
    }
    println("last:" + previous)*/
}

