package com.dicoding.exam.optionalexam3

// TODO
fun manipulateString(str: String, int: Int): String {
    val isNumber  = str.any{it.isDigit()}
    val multiply : Int?
    var ans = ""
    if(isNumber) {
        var number = ""
       for(char in str) {
           if(char.isDigit()) number += char
           else ans += char
       }
        multiply = number.toInt() * int
        ans += multiply
    }
    else{
        ans = str + int
    }
    return ans
}
