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

external interface `T$44` {
    @nativeGetter
    operator fun get(header: String): String?
    @nativeSetter
    operator fun set(header: String, value: String)
}

open external class FileLoader(manager: LoadingManager = definedExternally) : Loader {
    open var mimeType: MimeType?
    open var responseType: String?
    open var withCredentials: String?
    open var requestHeader: `T$44`
    open fun load(url: String, onLoad: (response: dynamic /* String | ArrayBuffer */) -> Unit = definedExternally, onProgress: (request: ProgressEvent) -> Unit = definedExternally, onError: (event: ErrorEvent) -> Unit = definedExternally): Any
    open fun setMimeType(mimeType: MimeType): FileLoader
    open fun setResponseType(responseType: String): FileLoader
    open fun setWithCredentials(value: Boolean): FileLoader
    open fun setRequestHeader(value: `T$44`): FileLoader
}