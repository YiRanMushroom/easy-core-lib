@file:Suppress("FunctionName", "PropertyName", "unused")

package com.easy

class NativeWString {
    var m_NativeBuffer : NativeBuffer

    constructor(nativePtr: Long) {
        m_NativeBuffer = NativeBuffer(nativePtr)
    }

    constructor(string: String) {
        this.m_NativeBuffer = NativeBuffer(CreateNativeFromString(string))
    }

    fun GetNativeAddress(): Long {
        return m_NativeBuffer.GetNativeAddress()
    }

    external fun Length() : Int

    external fun GetIndex(index: Int) : Char

    operator fun get(index: Int): Char {
        return GetIndex(index)
    }

    external fun SetIndex(index: Int, char: Char)

    operator fun set(index: Int, char: Char) {
        SetIndex(index, char)
    }

    override fun toString(): String {
        val length = Length()
        val chars = CharArray(length)
        for (i in 0 ..< length) {
            chars[i] = GetIndex(i)
        }
        return String(chars)
    }

    companion object {
        @JvmStatic
        external fun CreateNativeFromString(string: String): Long
    }
}

class NativeString {
    var m_NativeBuffer : NativeBuffer

    constructor(nativePtr: Long) {
        m_NativeBuffer = NativeBuffer(nativePtr)
    }

    constructor(string: String) {
        this.m_NativeBuffer = NativeBuffer(CreateNativeFromString(string))
    }

    fun GetNativeAddress(): Long {
        return m_NativeBuffer.GetNativeAddress()
    }

    external fun Length() : Int

    external fun GetIndex(index: Int) : Char

    operator fun get(index: Int): Char {
        return GetIndex(index)
    }

    external fun SetIndex(index: Int, char: Char)

    operator fun set(index: Int, char: Char) {
        SetIndex(index, char)
    }

    override fun toString(): String {
        val length = Length()
        val chars = CharArray(length)
        for (i in 0 ..< length) {
            chars[i] = GetIndex(i)
        }
        return String(chars)
    }

    companion object {
        @JvmStatic
        external fun CreateNativeFromString(string: String): Long
    }
}