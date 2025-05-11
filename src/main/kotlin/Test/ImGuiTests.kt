package com.easy.Test

import com.easy.ImGui
import com.easy.ObjRef

class ImGuiTests {
    private var m_TestBoolCheckBox : ObjRef<Boolean?> = ObjRef(false)
    private var m_TestSliderFloat : ObjRef<Float?> = ObjRef(0f)
    private var m_InputString = ObjRef<String?>("")

    constructor()

    fun Render() {
        ImGui.Begin("ImGui Tests")
        ImGui.CheckBox("Test CheckBox", m_TestBoolCheckBox)
        ImGui.Text("Test CheckBox Value: ${m_TestBoolCheckBox.Get()}")
        ImGui.InputText("Test InputText", m_InputString, 100)
        ImGui.Text("Test InputText Value: ${m_InputString.Get()}")
        ImGui.SliderFloat("Test SliderFloat", m_TestSliderFloat, 0f, 100f)
        ImGui.Text("Test SliderFloat Value: ${m_TestSliderFloat.Get()}")
        ImGui.End()
    }
}