package com.soywiz.korma

import kotlin.test.Test
import kotlin.test.assertEquals

class Matrix3DTest {
    @Test
    fun testMatrix4() {
        val matrix = Matrix3D()
        val identityData = listOf(
            1, 0, 0, 0,
            0, 1, 0, 0,
            0, 0, 1, 0,
            0, 0, 0, 1
        )
        assertEquals(identityData, matrix.data.map { it.toInt() })
        val matrix2 = matrix.clone().transpose()
        assertEquals(identityData, matrix2.data.map { it.toInt() })
    }
}