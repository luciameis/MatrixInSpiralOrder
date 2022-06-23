package com.luciameis.matrix

import org.junit.Test
import org.junit.Assert.*

class SpiralMatrixTest {

    @Test
    fun `Test with a square matrix`() {
        val matrix = squareMatrix
        val result = matrix.inSpiralOrder()
        assertEquals(expectedSquareMatrix, result)
    }

    @Test
    fun `Test with a matrix with more rows than columns`() {
        val matrix = matrix4By2
        val result = matrix.inSpiralOrder()
        assertEquals(expectedMatrix4By2, result)
    }

    @Test
    fun `Test with a matrix with more columns than rows`() {
        val matrix = matrix3By8
        val result = matrix.inSpiralOrder()
        assertEquals(expectedMatrix3By8, result)
    }
}