package com.dicoding.exam.optionalexam2

// TODO
fun minAndMax(number: Int): Int {
    val stringNumber = number.toString()
    val numbers  = stringNumber.toCharArray()
    numbers.sortDescending()
    val answers : Int = numbers[0].digitToInt() + numbers[numbers.size-1].digitToInt()
    return answers
}
