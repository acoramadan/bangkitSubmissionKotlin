package com.dicoding.exam.exam3

// TODO
fun <T> checkType(args: T): String {
    when (args) {
        is String -> {
            return "Yes! it's String"
        }

        is Boolean -> {
            return "Yes! it's Boolean"
        }

        is Int -> {
            return "Yes! it's Integer"
        }

        is Double -> {
            return "Yes! it's Double"
        }

        is List<*> -> {
            return "Yes! it's List"
        }

        is Map<*,*> -> {
            return "Yes! it's Map"
        }

        else -> return ""
    }
}