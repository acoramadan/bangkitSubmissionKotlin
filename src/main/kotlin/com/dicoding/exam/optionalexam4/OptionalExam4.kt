package com.dicoding.exam.optionalexam4

// TODO
fun getMiddleCharacters(string: String): String {
    val char = string.toCharArray()
    val mid = char.size / 2
    val ans: String = if((char.size % 2) == 0) {
        char[mid-1].toString() + char[mid].toString()
    }
    else{
        char[mid].toString()
    }
    return ans
}