@file:Suppress("FunctionName", "Unused")

package com.easy

import org.objectweb.asm.Type
import java.lang.reflect.Method
import java.lang.reflect.Modifier
import java.net.URLClassLoader
import javax.naming.LinkException
import java.lang.management.ManagementFactory
import java.lang.management.GarbageCollectorMXBean

object Lib {
    @JvmStatic
    fun GetClass(name: String): Class<*> {
        if (classNameToClassMap.containsKey(name)) {
            return classNameToClassMap[name]!!
        } else {
            val clazz = Class.forName(name)
            classNameToClassMap[name] = clazz
            return clazz
        }
    }

    @JvmStatic
    fun Init() {
        jarNameToUrlClassLoaderMap = mutableMapOf()
        classNameToClassMap = mutableMapOf()
    }

    @JvmStatic
    fun GetClassFromJar(jarName: String, className: String): Class<*> {
        if (classNameToClassMap.containsKey(className)) {
            return classNameToClassMap[className]!!
        } else {
            if (jarNameToUrlClassLoaderMap.containsKey(className)) {
                classNameToClassMap[className] = jarNameToUrlClassLoaderMap[className]!!.loadClass(className)
                return classNameToClassMap[className]!!
            } else {
                val jarFile = java.io.File(jarName)
                val classLoader = URLClassLoader(
                    arrayOf(jarFile.toURI().toURL()),
                    this::class.java.classLoader
                )
                jarNameToUrlClassLoaderMap[className] = classLoader
                classNameToClassMap[className] = classLoader.loadClass(className)
                return classNameToClassMap[className]!!
            }
        }
    }

    @JvmStatic
    fun GetMethodFromClassAndFunctionName(
        clazz: Class<*>,
        functionName: String,
        parameterTypes: Array<Class<*>>
    ): Method {
        return clazz.getDeclaredMethod(functionName, *parameterTypes)
    }

    @JvmStatic
    fun PrintClassInfo(clazz: Class<*>) {
        // print all methods and fields, constructors, we need to print the signature of the method, if it is static
        // first we need to print the class name
        NativePrintln("Class name: ${clazz.name}")

        // print all methods
        NativePrintln("Methods:")
        clazz.declaredMethods.forEach {
            NativePrintln(
                "[${if (Modifier.isStatic(it.modifiers)) "static" else "non-static"}] ${it.name}" +
                        "(${
                            it.parameterTypes.joinToString("") { Type.getDescriptor(it) }
                        })${Type.getDescriptor(it.returnType)}"
            )
        }

        // print all constructors
        NativePrintln("Constructors:")
        clazz.declaredConstructors.forEach {
            NativePrintln(
                "<init>" +
                        "(${
                            it.parameterTypes.joinToString("") { Type.getDescriptor(it) }
                        })V"
            )
        }

        // print all fields
        NativePrintln("Fields:")
        clazz.declaredFields.forEach {
            NativePrintln(
                "${it.name}(${if (Modifier.isStatic(it.modifiers)) "static" else "non-static"}):" +
                        "${Type.getDescriptor(it.type)}"
            )
        }
    }

    @JvmStatic
    fun CallInstanceMethod(
        instance: Any,
        method: Method,
        args: Array<Any?>
    ): Any? {
        // check if the method is static
        if (Modifier.isStatic(method.modifiers)) {
            return method.invoke(null, *args)
        } else {
            return method.invoke(instance, *args)
        }
    }

    @JvmStatic
    fun IsMethodStatic(method: Method): Boolean {
        return Modifier.isStatic(method.modifiers)
    }

    @JvmStatic
    fun CallStaticMethod(
        method: Method,
        args: Array<Any?>
    ): Any? {
        // check if the method is static
        if (Modifier.isStatic(method.modifiers)) {
            return method.invoke(null, *args)
        } else {
            throw IllegalArgumentException("Method is not static")
        }
    }

    @JvmStatic
    fun NativePrintln(str: String) {
        try {
            NativePrintlnImpl(str)
        } catch (ignored: LinkException) {
            println(str)
        }
    }

    @JvmStatic
    external fun NativePrintlnImpl(str: String)

    @JvmStatic
    var jarNameToUrlClassLoaderMap: MutableMap<String, URLClassLoader> = mutableMapOf()

    @JvmStatic
    var classNameToClassMap = mutableMapOf<String, Class<*>>()

    @JvmStatic
    fun UnBoxOrDefault(value: Int?): Int {
        return value ?: 0
    }

    @JvmStatic
    fun UnBoxOrDefault(value: Long?): Long {
        return value ?: 0L
    }

    @JvmStatic
    fun UnBoxOrDefault(value: Float?): Float {
        return value ?: 0f
    }

    @JvmStatic
    fun UnBoxOrDefault(value: Double?): Double {
        return value ?: 0.0
    }

    @JvmStatic
    fun UnBoxOrDefault(value: Boolean?): Boolean {
        return value ?: false
    }

    @JvmStatic
    fun UnBoxOrDefault(value: Char?): Char {
        return value ?: ' '
    }

    @JvmStatic
    fun UnBoxOrDefault(value: Byte?): Byte {
        return value ?: 0
    }

    @JvmStatic
    fun UnBoxOrDefault(value: Short?): Short {
        return value ?: 0
    }
}
