package com.easy.Test

class BasicTests {
    var name: String?
    var age: Int
    var height: Double?

    constructor(name: String?, age: Int, height: Double?) {
        this.name = name
        this.age = age
        this.height = height
    }

    constructor(age: Int) {
        this.name = "Unknown"
        this.age = age
        this.height = null
    }

    constructor() {
        this.name = "Unknown"
        this.age = 0
        this.height = null
    }

    constructor(name: String?) {
        this.name = name
        this.age = 0
        this.height = null
    }

    fun ToString(): String {
        return "name: ${this.name}, age: ${this.age}, height: ${this.height}"
    }

    companion object {
        @JvmStatic
        fun Create(name: String, age: Int, height: Double): BasicTests {
            return BasicTests(name, age, height)
        }
    }
}