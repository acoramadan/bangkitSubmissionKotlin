package com.dicoding.exam.optionalexam1

// TODO
fun sumOfBigThree(vararg numbers: Int): Int {
    numbers.sortDescending()
    val ans = numbers[0] + numbers[1] + numbers[2]
    return ans
}
