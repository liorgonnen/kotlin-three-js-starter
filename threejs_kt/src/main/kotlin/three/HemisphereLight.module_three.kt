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

open external class HemisphereLight : Light {
    constructor(skyColor: Color, groundColor: Color, intensity: Number)
    constructor(skyColor: Color, groundColor: String, intensity: Number)
    constructor(skyColor: Color, groundColor: Number, intensity: Number)
    constructor(skyColor: String, groundColor: Color, intensity: Number)
    constructor(skyColor: String, groundColor: String, intensity: Number)
    constructor(skyColor: String, groundColor: Number, intensity: Number)
    constructor(skyColor: Number, groundColor: Color, intensity: Number)
    constructor(skyColor: Number, groundColor: String, intensity: Number)
    constructor(skyColor: Number, groundColor: Number, intensity: Number)
    open var skyColor: Color
    open var groundColor: Color
    override var intensity: Number
    open var isHemisphereLight: Boolean
}