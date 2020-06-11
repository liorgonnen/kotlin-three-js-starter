@file:Suppress("INTERFACE_WITH_SUPERCLASS", "OVERRIDING_FINAL_MEMBER", "RETURN_TYPE_MISMATCH_ON_OVERRIDE", "CONFLICTING_OVERLOADS", "EXTERNAL_DELEGATION", "PackageDirectoryMismatch")
package stats.js

import org.w3c.dom.HTMLCanvasElement
import org.w3c.dom.HTMLDivElement

@JsModule("stats-js")
@JsNonModule
@Suppress("NESTED_CLASS_IN_EXTERNAL_INTERFACE")
external class Stats {
    var REVISION: Number
    var dom: HTMLDivElement
    fun addPanel(panel: Stats.Panel): Stats.Panel
    fun showPanel(id: Number)
    fun begin()
    fun end()
    fun update()
    var domElement: HTMLDivElement
    fun setMode(id: Number)
    interface Panel {
        var dom: HTMLCanvasElement
        fun update(value: Number, maxValue: Number)
    }

    companion object {
        fun Panel(): Panel
    }
}