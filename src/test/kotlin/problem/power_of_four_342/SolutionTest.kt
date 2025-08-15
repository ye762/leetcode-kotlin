package problem.power_of_four_342

import org.junit.jupiter.api.Assertions.*
import org.junit.jupiter.api.Test
import org.ye.problem.power_of_four_342.Solution

class SolutionTest {
    private val solution = Solution()

    @Test
    fun when_N_is_16_ThenTrue() =
        assertTrue {
            val n = 16
            val result = solution.isPowerOfFour(n)
            println(String.format("%d? : %b", n, result))
            result
        }

    @Test
    fun when_N_Is_5_ThenTrue() =
        assertFalse {
            val n = 5
            val result = solution.isPowerOfFour(n)
            println(String.format("%d? : %b", n, result))
            result
        }

    @Test
    fun when_N_Is_1_ThenTrue() =
        assertTrue {
            val n = 1
            val result = solution.isPowerOfFour(n)
            println(String.format("%d? : %b", n, result))
            result
        }
}