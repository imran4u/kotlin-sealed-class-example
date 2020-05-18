package com.imran

sealed class Fruit{
    object Help:Fruit(){
        const val description = "Help me"
    }
    data class Mango(val name: String, val test:String):Fruit()
    data class Blueberry(val name:String, val test:String, val isSour:Boolean): Fruit()
}
data class Banana(val name:String, val test:String):Fruit()