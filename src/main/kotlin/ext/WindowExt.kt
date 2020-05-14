package ext

import org.w3c.dom.Window

val Window.aspectRatio get() = innerWidth.toDouble() / innerHeight
