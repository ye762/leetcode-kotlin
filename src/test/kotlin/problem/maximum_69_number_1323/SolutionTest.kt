package problem.maximum_69_number_1323

import org.junit.jupiter.api.Assertions.assertEquals
import org.junit.jupiter.api.Test
import org.ye.problem.maximum_69_number_1323.Solution

class SolutionTest {
    private val solution = Solution()

    @Test
    fun when_9669_Then_9969() {
        // given
        val num = 9669
        val expected = 9969
        // when
        val actual = solution.maximum69Number(num)
        // then
        assertEquals(actual, expected)
    }

    @Test
    fun when_9996_Then_9999() {
        // given
        val num = 9996
        val expected = 9999
        // when
        val actual = solution.maximum69Number(num)
        // then
        assertEquals(actual, expected)
    }

    @Test
    fun when_9999_Then_9999() {
        // given
        val num = 9999
        val expected = 9999
        // when
        val actual = solution.maximum69Number(num)
        // then
        assertEquals(actual, expected)
    }

    @Test
    fun when_6_Then_9() {
        // given
        val num = 6
        val expected = 9
        // when
        val actual = solution.maximum69Number(num)
        // then
        assertEquals(actual, expected)
    }

    @Test
    fun when_9_Then_9() {
        // given
        val num = 9
        val expected = 9
        // when
        val actual = solution.maximum69Number(num)
        // then
        assertEquals(actual, expected)
    }
}