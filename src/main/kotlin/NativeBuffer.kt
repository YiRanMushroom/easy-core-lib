@file:Suppress("PropertyName", "FunctionName", "Unused")

package com.easy

import java.lang.ref.Cleaner

class NativeBuffer {
    constructor(nativePtr: Long) {
        m_NativeBufferPtr = nativePtr
        s_Cleaner.register(this, NativeReleaser(m_NativeBufferPtr))
    }

    private var m_NativeBufferPtr: Long = 0

    fun GetNativeAddress(): Long {
        return m_NativeBufferPtr
    }

    companion object {
        val s_Cleaner: Cleaner = Cleaner.create()
    }

    class NativeReleaser : Runnable {
        private var m_NativeBufferPtr: Long = 0

        constructor(nativePtr: Long) {
            NotifyCreate(nativePtr)
            m_NativeBufferPtr = nativePtr
        }

        override fun run() {
            NativeDelete(m_NativeBufferPtr)
            m_NativeBufferPtr = 0
        }

        companion object {
            @JvmStatic
            external fun NativeDelete(ptr: Long)

            @JvmStatic
            external fun NotifyCreate(ptr: Long)
        }
    }
}