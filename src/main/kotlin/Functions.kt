@file:Suppress("unused", "FunctionName", "PropertyName", "UNCHECKED_CAST")

package com.easy

class NativeFunction0<R> : () -> R? {
    var NativeBufferPtr: Long = 0

    override fun invoke(): R? {
        var ret: R? = null
        try {
            ret = NativeInvoke() as R?
        } catch (e: Exception) {
            e.printStackTrace()
        }

        return ret
    }

    constructor(ptr: Long) {
        this.NativeBufferPtr = ptr
    }

    external fun NativeInvoke(): Any?

    fun CastToInterface(): () -> Any? {
        return this as () -> Any?
    }

}

class NativeFunction1<T1, R> : (T1?) -> R? {
    var NativeBufferPtr: Long = 0

    override fun invoke(arg: T1?): R? {
        return NativeInvoke(arg) as R?
    }

    constructor(ptr: Long) {
        this.NativeBufferPtr = ptr
    }

    external fun NativeInvoke(arg: Any?): Any?

    fun CastToInterface(): (Any?) -> Any? {
        return this as (Any?) -> Any?
    }
}

class NativeFunction2<T1, T2, R> : (T1?, T2?) -> R? {
    var NativeBufferPtr: Long = 0

    override fun invoke(arg1: T1?, arg2: T2?): R? {
        var ret: R? = null
        try {
            ret = NativeInvoke(arg1, arg2) as R?
        } catch (e: Exception) {
            e.printStackTrace()
        }

        return ret
    }

    constructor(ptr: Long) {
        this.NativeBufferPtr = ptr
    }

    external fun NativeInvoke(arg1: Any?, arg2: Any?): Any?

    fun CastToInterface(): (Any?, Any?) -> Any? {
        return this as (Any?, Any?) -> Any?
    }
}

class NativeFunction3<T1, T2, T3, R> : (T1?, T2?, T3?) -> R? {
    var NativeBufferPtr: Long = 0

    override fun invoke(arg1: T1?, arg2: T2?, arg3: T3?): R? {
        var ret: R? = null
        try {
            ret = NativeInvoke(arg1, arg2, arg3) as R?
        } catch (e: Exception) {
            e.printStackTrace()
        }

        return ret
    }

    constructor(ptr: Long) {
        this.NativeBufferPtr = ptr
    }

    external fun NativeInvoke(arg1: Any?, arg2: Any?, arg3: Any?): Any?

    fun CastToInterface(): (Any?, Any?, Any?) -> Any? {
        return this as (Any?, Any?, Any?) -> Any?

    }
}

class NativeFunction4<T1, T2, T3, T4, R> : (T1?, T2?, T3?, T4?) -> R? {
    var NativeBufferPtr: Long = 0

    override fun invoke(arg1: T1?, arg2: T2?, arg3: T3?, arg4: T4?): R? {
        var ret: R? = null
        try {
            ret = NativeInvoke(arg1, arg2, arg3, arg4) as R?
        } catch (e: Exception) {
            e.printStackTrace()
        }

        return ret
    }

    constructor(ptr: Long) {
        this.NativeBufferPtr = ptr
    }

    external fun NativeInvoke(arg1: Any?, arg2: Any?, arg3: Any?, arg4: Any?): Any?

    fun CastToInterface(): (Any?, Any?, Any?, Any?) -> Any? {
        return this as (Any?, Any?, Any?, Any?) -> Any?
    }
}

class NativeFunction5<T1, T2, T3, T4, T5, R> : (T1?, T2?, T3?, T4?, T5?) -> R? {
    var NativeBufferPtr: Long = 0

    override fun invoke(arg1: T1?, arg2: T2?, arg3: T3?, arg4: T4?, arg5: T5?): R? {
        var ret: R? = null
        try {
            ret = NativeInvoke(arg1, arg2, arg3, arg4, arg5) as R?
        } catch (e: Exception) {
            e.printStackTrace()
        }

        return ret
    }

    constructor(ptr: Long) {
        this.NativeBufferPtr = ptr
    }

    external fun NativeInvoke(arg1: Any?, arg2: Any?, arg3: Any?, arg4: Any?, arg5: Any?): Any?

    fun CastToInterface(): (Any?, Any?, Any?, Any?, Any?) -> Any? {
        return this as (Any?, Any?, Any?, Any?, Any?) -> Any?
    }
}

class NativeFunction6<T1, T2, T3, T4, T5, T6, R> : (T1?, T2?, T3?, T4?, T5?, T6?) -> R? {
    var NativeBufferPtr: Long = 0

    override fun invoke(arg1: T1?, arg2: T2?, arg3: T3?, arg4: T4?, arg5: T5?, arg6: T6?): R? {
        var ret: R? = null
        try {
            ret = NativeInvoke(arg1, arg2, arg3, arg4, arg5, arg6) as R?
        } catch (e: Exception) {
            e.printStackTrace()
        }

        return ret
    }

    constructor(ptr: Long) {
        this.NativeBufferPtr = ptr
    }

    external fun NativeInvoke(arg1: Any?, arg2: Any?, arg3: Any?, arg4: Any?, arg5: Any?, arg6: Any?): Any?

    fun CastToInterface(): (Any?, Any?, Any?, Any?, Any?, Any?) -> Any? {
        return this as (Any?, Any?, Any?, Any?, Any?, Any?) -> Any?
    }
}

class NativeFunction7<T1, T2, T3, T4, T5, T6, T7, R> : (T1?, T2?, T3?, T4?, T5?, T6?, T7?) -> R? {
    var NativeBufferPtr: Long = 0

    override fun invoke(arg1: T1?, arg2: T2?, arg3: T3?, arg4: T4?, arg5: T5?, arg6: T6?, arg7: T7?): R? {
        var ret: R? = null
        try {
            ret = NativeInvoke(arg1, arg2, arg3, arg4, arg5, arg6, arg7) as R?
        } catch (e: Exception) {
            e.printStackTrace()
        }

        return ret
    }

    constructor(ptr: Long) {
        this.NativeBufferPtr = ptr
    }

    external fun NativeInvoke(
        arg1: Any?,
        arg2: Any?,
        arg3: Any?,
        arg4: Any?,
        arg5: Any?,
        arg6: Any?,
        arg7: Any?
    ): Any?

    fun CastToInterface(): (Any?, Any?, Any?, Any?, Any?, Any?, Any?) -> Any? {
        return this as (Any?, Any?, Any?, Any?, Any?, Any?, Any?) -> Any?
    }
}

class NativeFunction8<T1, T2, T3, T4, T5, T6, T7, T8, R> : (T1?, T2?, T3?, T4?, T5?, T6?, T7?, T8?) -> R? {
    var NativeBufferPtr: Long = 0

    override fun invoke(arg1: T1?, arg2: T2?, arg3: T3?, arg4: T4?, arg5: T5?, arg6: T6?, arg7: T7?, arg8: T8?): R? {
        var ret: R? = null
        try {
            ret = NativeInvoke(arg1, arg2, arg3, arg4, arg5, arg6, arg7, arg8) as R?
        } catch (e: Exception) {
            e.printStackTrace()
        }

        return ret
    }

    constructor(ptr: Long) {
        this.NativeBufferPtr = ptr
    }

    fun CastToInterface(): (Any?, Any?, Any?, Any?, Any?, Any?, Any?, Any?) -> Any? {
        return this as (Any?, Any?, Any?, Any?, Any?, Any?, Any?, Any?) -> Any?
    }

    external fun NativeInvoke(
        arg1: Any?,
        arg2: Any?,
        arg3: Any?,
        arg4: Any?,
        arg5: Any?,
        arg6: Any?,
        arg7: Any?,
        arg8: Any?
    ): Any?
}

// 8 should be enough