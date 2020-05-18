package com.imran

fun main(){
    val message = when(val fruit=FruitFactory().createFruit(FruitType.HELP)){
        Fruit.Help -> "${Fruit.Help.description}"
        is Banana -> "name: ${fruit.name}, test: ${fruit.test}"
        is Fruit.Mango -> "name: ${fruit.name}, test: ${fruit.test}"
        is Fruit.Blueberry -> "name: ${fruit.name}, test: ${fruit.test} , isSour: ${fruit.isSour}"
    }
    print(message)
}