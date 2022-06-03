package machine

fun main() {
    var water = 400
    var milk = 540
    var beans = 120
    var cups = 9
    var cash = 550
      
    fun remaining() {
        println("The coffee machine has:")
        println("$water of water")
        println("$milk of milk")
        println("$beans of coffee beans")
        println("$cups of disposable cups")
        println("$cash of money")
    }
    
    fun buyCoffee() {
        println("What do you want to buy? 1 - espresso, 2 - latte, 3 - cappuccino, back - to main menu: > ")
        val choiсe = readLine()!!
        if (water < 200) {
            println ("Sorry, not enough water!")
        } else if (milk < 100) {
            println("Sorry, not enough milk!")
        } else if (beans < 20) {
            println("Sorry, not enough beans!")
        } else if (cups < 1) {
            println("Sorry, not enough cups!")
        } else {
        when (choiсe) {
            "1" -> {
                water -= 250
                beans -= 16
                cups -= 1
                cash += 4
                println("I have enough resources, making you a coffee!")
            }
            "2" -> {
                water -= 350
                milk -= 75
                beans -= 20
                cups -= 1
                cash += 7
                println("I have enough resources, making you a coffee!")
            }
            "3" -> {
                water -= 200
                milk -= 100
                beans -= 12
                cups -= 1
                cash += 6
                println("I have enough resources, making you a coffee!")
            }
            "back" -> return
            }
        }
    }
    
    fun fillApp() {
        val (addWater, addMilk, addBeans, addCups) = Array(4) { readLine()!!.toInt() }
        println("Write how many ml of water do you want to add: > $addWater")
        println("Write how many ml of milk do you want to add: > $addMilk")
        println("Write how many grams of coffee beans do you want to add: > $addBeans")
        println("Write how many disposable cups of coffee do you want to add: > $addCups")
  
        water += addWater
        milk += addMilk
        beans += addBeans
        cups += addCups
    }
    
    fun takeMoney() {
        println("I gave you \$$cash")
        cash = 0
    }
    
    do{
    println("Write action (buy, fill, take, remaining, exit): > ")
    val action = readLine()!!
    when (action) {
       "buy" -> buyCoffee()
       "fill" -> fillApp()
       "take" -> takeMoney()
       "remaining" -> remaining()
       "exit" -> break
       }
    } while(action != "exit")
}
