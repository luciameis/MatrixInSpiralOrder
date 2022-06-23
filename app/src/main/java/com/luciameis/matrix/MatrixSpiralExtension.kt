package com.luciameis.matrix

fun Array<Array<Int>>.inSpiralOrder(): List<Int> {

    var firstRow = 0
    var endRow = size - 1
    var firstColumn = 0
    var endColumn = this[0].size - 1

    val result = mutableListOf<Int>()

    while (firstRow <= endRow && firstColumn <= endColumn) {

        for (i in firstColumn..endColumn) {
            result.add(this[firstRow][i])
        }
        firstRow++

        for (i in firstRow..endRow) {
            result.add(this[i][endColumn])
        }
        endColumn--

        if (firstRow <= endRow) {
            for (i in endColumn downTo firstColumn) {
                result.add(this[endRow][i])
            }
            endRow--
        }

        if (firstColumn <= endColumn) {
            for (i in endRow downTo firstRow) {
                result.add(this[i][firstColumn])
            }
            firstColumn++
        }
    }

    return result
}

