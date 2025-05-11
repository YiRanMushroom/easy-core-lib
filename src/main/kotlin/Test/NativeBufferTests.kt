package com.easy.Test

import com.easy.NativeBuffer

object NativeBufferTests {
    var arrayList = ArrayList<NativeBuffer>()

    @JvmStatic
    fun AddPtr(ptr: Long) {
        val nativeBuffer = NativeBuffer(ptr)
        arrayList.add(nativeBuffer)
    }

    @JvmStatic
    fun RemoveAll() {
//        println("RemoveAll")
        arrayList.removeAll { true }
    }
}