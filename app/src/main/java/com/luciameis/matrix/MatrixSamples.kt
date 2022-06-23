package com.luciameis.matrix

val squareMatrix = arrayOf(
    arrayOf(1,2,3,4,5),
    arrayOf(6,7,8,9,10),
    arrayOf(11,12,13,14,15),
    arrayOf(16,17,18,19,20),
    arrayOf(21,22,23,24,25)
)

val expectedSquareMatrix = listOf(1,2,3,4,5,10,15,20,25,24,23,22,21,16,11,6,7,8,9,14,19,18,17,12,13)

val matrix3By8 = arrayOf(
    arrayOf(1,2,3,4,5,6,7,8),
    arrayOf(9,10,11,12,13,14,15,16),
    arrayOf(17,18,19,20,21,22,23,24)
)

val expectedMatrix3By8 = listOf(1,2,3,4,5,6,7,8,16,24,23,22,21,20,19,18,17,9,10,11,12,13,14,15)

val matrix4By2 = arrayOf(
    arrayOf(1,2),
    arrayOf(3,4),
    arrayOf(5,6),
    arrayOf(7,8)
)

val expectedMatrix4By2 = listOf(1,2,4,6,8,7,5,3)