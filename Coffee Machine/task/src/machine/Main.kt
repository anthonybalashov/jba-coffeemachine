package machine

import java.util.*

fun coffee(water: Int, milk: Int ,beans: Int, money: Int): Boolean {
    when {
        water < 0 -> {
            println("Sorry, not enough water!")
            return false
        }
        milk < 0 -> {
            println("Sorry, not enough milk!")
            return false
        }
        beans < 0 -> {
            println("Sorry, not enough coffee beans!")
            return false
        }
        else -> {
            println("I have enough resources, making you a coffee!")
        }
    }
    return true
}
fun main(args: Array<String>) {
    val scanner = Scanner(System.`in`)
    var waterQty: Int = 400
    var milkQty: Int = 540
    var beansQty: Int = 120
    var cupsQty: Int = 9
    var money: Int = 550
    do {
        println("Write action (buy, fill, take, remaining, exit):")
        var action = scanner.next()
        when (action) {
            "buy" -> {
                println("What do you want to buy? 1 - espresso, 2 - latte, 3 - cappuccino, back - to main menu:")
                when (scanner.next()) {
                    "1" -> {
                        if(coffee(waterQty - 250,  milkQty - 0, beansQty -16, money + 4)) {
                            waterQty -= 250
                            beansQty -= 16
                            money += 4
                            cupsQty -= 1
                        }
                    }
                    "2" -> {
                        if(coffee(waterQty - 350, milkQty - 75 ,beansQty -20, money + 7)) {
                            waterQty -= 350
                            milkQty -= 75
                            beansQty -= 20
                            money += 7
                            cupsQty -= 1
                        }
                    }
                    "3" -> {
                        if(coffee(waterQty - 200, milkQty - 100 ,beansQty -12, money + 6)) {
                            waterQty -= 200
                            milkQty -= 100
                            beansQty -= 12
                            money += 6
                            cupsQty -= 1
                        }
                    }
                }
            }
            "fill" -> {
                println("Write how many ml of water do you want to add: ")
                waterQty += scanner.nextInt()
                println("Write how many ml of milk do you want to add:")
                milkQty += scanner.nextInt()
                println("Write how many grams of coffee beans do you want to add:")
                beansQty += scanner.nextInt()
                println("Write how many disposable cups of coffee do you want to add:")
                cupsQty += scanner.nextInt()
            }
            "take" -> {
                println("I gave you $$money")
                money = 0
            }
            "remaining" -> {
                println("The coffee machine has:")
                println("$waterQty of water")
                println("$milkQty of milk")
                println("$beansQty of coffee beans ")
                println("$cupsQty of disposable cups")
                println("$$money of money")
            }
        }

    } while (action != "exit")
}