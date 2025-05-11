@file:Suppress("FunctionName", "Unused")

package com.easy

object ImGui {
    @JvmStatic
    external fun Begin(name: String)

    @JvmStatic
    external fun End()

    @JvmStatic
    external fun Text(name: String)

    @JvmStatic
    external fun CheckBox(label: String, boolRef: ObjRef<Boolean?>): Boolean

    @JvmStatic
    external fun InputText(
        label: String, strRef: ObjRef<String?>,
        size: Int, imGuiTestFlags: Int = 0
    ): Boolean

    @JvmStatic
    external fun SliderFloat(
        label: String,
        floatRef: ObjRef<Float?>,
        min: Float, max: Float,
        format: String = "%.3f",
        flags: Int = 0
    ): Boolean
}