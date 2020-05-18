package com.imran

fun main(){
    val message = when(val fruit=FruitFactory().createFruit(FruitType.BANANA)){
        Fruit.Help -> "${Fruit.Help.description}"
        is Banana -> "name: ${fruit.name}, test: ${fruit.test}"
        is Fruit.Mango -> "name: ${fruit.name}, test: ${fruit.test}"
    }
    print(message)
}