@file:Suppress("unused", "FunctionName", "PropertyName")

package com.easy.Test

object FunctionTests {
    @JvmStatic
    fun TestInvokeIntInt(): (Int) -> Int {
        return {
            println("Invoked From Kotlin with arg: $it")
            it + 1
        }
    }

    @JvmStatic
    fun TestStringStringVoid(): (String, String) -> Unit {
        return { arg1, arg2 ->
            println("Invoked From Kotlin with args: $arg1, $arg2")
        }
    }
}