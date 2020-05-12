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

open external class InstancedMesh : Mesh {
    constructor(geometry: Geometry, material: Material, count: Number)
    constructor(geometry: Geometry, material: Array<Material>, count: Number)
    constructor(geometry: BufferGeometry, material: Material, count: Number)
    constructor(geometry: BufferGeometry, material: Array<Material>, count: Number)
    open var count: Number
    open var instanceMatrix: BufferAttribute
    open var isInstancedMesh: Boolean
    open fun getMatrixAt(index: Number, matrix: Matrix4)
    open fun setMatrixAt(index: Number, matrix: Matrix4)
}