package org.ye.problem.maximum_69_number_1323

class Solution {
    fun maximum69Number (num: Int): Int = transform(num, findIndex(num))

    // find `index` to swap in `num`
    fun findIndex(num: Int): Int {
        var mem: Int = num
        var index = 0
        var lastIndex = 0
        do {
            if (mem == 0) break
            index++
            if (mem % 10 == 6) lastIndex = index
            mem /= 10
        } while (mem != 0)
        return lastIndex
    }

    // generate `value` which sum(`num`, `value`) == `expected`
    fun transform(num: Int, index: Int): Int {
        var categoryToSwap: Int = if (index < 1) 0 else 1
        (2..index).forEach { _ ->
            categoryToSwap *= 10
        }
        return num + 3 * categoryToSwap
    }
}
