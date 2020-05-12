Kotlin/JS + three.js Starter
===============
This project will make it easy for you to quickly start writing 3D apps with [Kotlin](https://kotlinlang.org/) and [three.js](https://github.com/mrdoob/three.js/) .

Although JetBrains introduced [Dukat](https://github.com/kotlin/dukat) to convert JS/WebIDL/TS types to Kotlin external declarations, there's still a long way to go until it's fully functional.

I spent several days modifying Dukat in order to successfully generate the externals for [three.js](https://github.com/mrdoob/three.js/). (I'll link to this project separately). I didn't want to just modify the generated files by hand, so that I can easily upgrade to newer versions of three.js as they come in a scalable way.
 
![Demo](readme/demo.gif)

The generated files are placed in their own module (_**threejs_kt**_) and referenced from the main gradle file, so that you can easily move this module from one project to another.