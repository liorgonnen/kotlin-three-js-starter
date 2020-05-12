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

open external class Texture : EventDispatcher {
    constructor(image: HTMLImageElement, mapping: Mapping, wrapS: Wrapping, wrapT: Wrapping, magFilter: TextureFilter, minFilter: TextureFilter, format: PixelFormat, type: TextureDataType, anisotropy: Number, encoding: TextureEncoding)
    constructor(image: HTMLCanvasElement, mapping: Mapping, wrapS: Wrapping, wrapT: Wrapping, magFilter: TextureFilter, minFilter: TextureFilter, format: PixelFormat, type: TextureDataType, anisotropy: Number, encoding: TextureEncoding)
    constructor(image: HTMLVideoElement, mapping: Mapping, wrapS: Wrapping, wrapT: Wrapping, magFilter: TextureFilter, minFilter: TextureFilter, format: PixelFormat, type: TextureDataType, anisotropy: Number, encoding: TextureEncoding)
    open var id: Number
    open var uuid: String
    open var name: String
    open var sourceFile: String
    open var image: Any
    open var mipmaps: Array<ImageData>
    open var mapping: Mapping
    open var wrapS: Wrapping
    open var wrapT: Wrapping
    open var magFilter: TextureFilter
    open var minFilter: TextureFilter
    open var anisotropy: Number
    open var format: PixelFormat
    open var internalFormat: Any?
    open var type: TextureDataType
    open var offset: Vector2
    open var repeat: Vector2
    open var center: Vector2
    open var rotation: Number
    open var generateMipmaps: Boolean
    open var premultiplyAlpha: Boolean
    open var flipY: Boolean
    open var unpackAlignment: Number
    open var encoding: TextureEncoding
    open var version: Number
    open var needsUpdate: Boolean
    open var isTexture: Boolean
    open var onUpdate: () -> Unit
    open fun clone(): Texture /* this */
    open fun copy(source: Texture): Texture /* this */
    open fun toJSON(meta: Any): Any
    open fun dispose()
    open fun transformUv(uv: Vector2): Vector2

    companion object {
        var DEFAULT_IMAGE: Any
        var DEFAULT_MAPPING: Any
    }
}