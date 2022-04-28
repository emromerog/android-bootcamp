package com.example.android_bootcamp.solid

//Principio de responsabilidad unica
class SingleResponsability {

    /*Si se dejan las funciones de signIn y signOut en la clase User
    * se viola el principio de unica responsabilidad, ya que cada vez
    * que se deban realizar modificaciones de login, se afecta dicha clase.
    * Por tanto lo adecuado es crear otra clase que se encargue de lo referente
    * al login (AuthenticationService) y que la clase User se encargue solo
    * de lo que concierne al usuario*/

}

class User(
    var id: Long,
    var name: String,
    var password: String
) {

    /*fun signIn(){
        //This method will do signing in operations
    }

    fun signOut(){
        //This method will do signing out operations
    }*/
}

class AuthenticationService() {

    fun signIn() {
        //This method will do signing in operations
    }

    fun signOut() {
        //This method will do signing out operations
    }
}

