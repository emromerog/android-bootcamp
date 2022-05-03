package com.example.android_bootcamp.poo

/*Por defecto las clases en kotlin son Final, una data class contiene una funcionalidad estandar
* */
data class DataClass(var temperature: Int = 0) {
}

class Class {
    var temperature: Int = 0
}

open class OpenClass {
    var temperature: Int = 0
}

