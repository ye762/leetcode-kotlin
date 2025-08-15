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
