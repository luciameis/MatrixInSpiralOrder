package com.luciameis.matrix

fun Array<Array<Int>>.print() = indices.forEach { println(this[it].contentToString()) }