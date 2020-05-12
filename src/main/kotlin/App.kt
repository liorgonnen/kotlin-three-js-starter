import three.js.*
import kotlin.js.*
import kotlin.browser.document
import kotlin.browser.window

fun main() {
    val scene = Scene()
    val camera = PerspectiveCamera(75, window.innerWidth / window.innerHeight, 0.1, 1000)

    val renderer = WebGLRenderer()
    document.body?.appendChild(renderer.domElement)
    renderer.setSize(window.innerWidth, window.innerHeight)
    renderer.setPixelRatio(window.devicePixelRatio)

    val cube = Mesh(BoxGeometry(1, 1, 1), MeshPhongMaterial().apply { color = Color(0x0000ff) })
    scene.add(cube)

    scene.add(DirectionalLight(0xffffff, 1).apply { position.set(-1, 2, 4) })

    scene.add(AmbientLight(0x404040, 1))

    camera.position.z = 3

    window.onresize = {
        camera.aspect = window.innerWidth / window.innerHeight
        camera.updateProjectionMatrix()
        renderer.setSize(window.innerWidth, window.innerHeight)
    }

    fun animate(time: Double) {
        val seconds = time * 0.001

        cube.rotation.x = seconds
        cube.rotation.y = seconds

        renderer.render(scene, camera)

        window.requestAnimationFrame(::animate)
    }

    animate(0.0)
}
