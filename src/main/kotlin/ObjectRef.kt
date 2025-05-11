@file:Suppress("FunctionName", "Unused", "PrivatePropertyName")

package com.easy

class ObjRef<T> {
    private var m_Value: T? = null

    constructor() {
        m_Value = null
    }

    constructor(value: T?) {
        m_Value = value
    }

    fun Get(): T? {
        return m_Value
    }

    fun Set(value: T?) {
        m_Value = value
    }

    fun IsNull(): Boolean {
        return m_Value == null
    }
}