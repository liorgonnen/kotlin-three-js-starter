@file:JsQualifier("THREE")
@file:Suppress("ABSTRACT_MEMBER_NOT_IMPLEMENTED", "VAR_TYPE_MISMATCH_ON_OVERRIDE", "INTERFACE_WITH_SUPERCLASS", "OVERRIDING_FINAL_MEMBER", "RETURN_TYPE_MISMATCH_ON_OVERRIDE", "CONFLICTING_OVERLOADS", "EXTERNAL_DELEGATION", "PackageDirectoryMismatch")
package three.js

import kotlin.js.*
import kotlin.js.Json
import org.khronos.webgl.*
import org.w3c.dom.*
import org.w3c.dom.events.*
import org.w3c.dom.parsing.*
import org.w3c.dom.svg.*
import org.w3c.dom.url.*
import org.w3c.fetch.*
import org.w3c.files.*
import org.w3c.notifications.*
import org.w3c.performance.*
import org.w3c.workers.*
import org.w3c.xhr.*

open external class GridHelper : LineSegments {
    constructor(size: Number, divisions: Number, color1: Color, color2: Color)
    constructor(size: Number, divisions: Number, color1: Color, color2: Number)
    constructor(size: Number, divisions: Number, color1: Number, color2: Color)
    constructor(size: Number, divisions: Number, color1: Number, color2: Number)
    open fun setColors(color1: Color = definedExternally, color2: Color = definedExternally)
    open fun setColors(color1: Color = definedExternally, color2: Number = definedExternally)
    open fun setColors(color1: Number = definedExternally, color2: Color = definedExternally)
    open fun setColors(color1: Number = definedExternally, color2: Number = definedExternally)
    open fun setColors()
}