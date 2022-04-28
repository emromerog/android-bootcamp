package com.example.android_bootcamp.solid

class OpenClosed {
    /*El principio indica que una clae debe estar abierta para extenderse y cerrada para modificarse
    En vez de estar modificando la clase Car con cada tipo de auto nuevo, se crean clases
    * por auto y se extiende la principal que es Car2*/
}

/*Mala implementación*/
class Car(){
    fun accelerate(){
        // accelerate car
    }

    fun stop(){
        //stop car
    }

    fun accelerate(isCarRace: Boolean){
        // accelerate car

        if(isCarRace){
            injectExtraGas()
        }
    }

    private fun injectExtraGas(){
        //inject extra gas
    }
    /**/
}

/*Buena implementación*/
abstract class Car2(){
    fun accelerate(){
        // accelerate car
    }

    fun stop(){
        //stop car
    }
}

class RaceCar(): Car2(){
    private fun injectExtraGas(){
        //inject extra gas
    }
}