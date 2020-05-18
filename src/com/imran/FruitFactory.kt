package com.imran

class FruitFactory {
    fun createFruit(type:FruitType) :Fruit{
         return when (type){
             FruitType.BANANA -> Banana("Banana", "sweet")
             FruitType.MANGO -> Fruit.Mango("Mango", "sweet")
             FruitType.BLUEBERRY -> Fruit.Blueberry("BlueBerry", "Sour", true)
             FruitType.HELP -> Fruit.Help
         }
    }
}