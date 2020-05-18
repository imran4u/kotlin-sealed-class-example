package com.imran

sealed class Fruit{
    object Help:Fruit(){
        val description = "Help me"
    }
    data class Mango(val name: String, val test:String):Fruit()
    data class Blueberry(val name:String, val test:String, val isSour:Boolean)
}
data class Banana(val name:String, val test:String):Fruit()