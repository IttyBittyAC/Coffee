//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
fun main() {
    val coffeeOptions = listOf("coffee", "milk", "vanilla", "sugar")
    val customerPicks = listOf("coffee", "milk")

    println(calculateCaffeineLevel(8, 0, "hopes lost"))
    if(CanFullFillOrder(coffeeOptions, customerPicks)){
        println("enter name of drink")

    }
    else{
        "Order could not be full filled"
    }

}
fun CanFullFillOrder(availability: List<String>, customerOrder: List<String>): Boolean {
    var choices: Int = 0
    for (picks in customerOrder) {
         if (availability.contains(picks)) {
             choices++
         }
     }
    if (choices == customerOrder.size){
        return true
    }

    return false
}
fun calculateCaffeineLevel(hoursWorked: Int, bugsFound: Int, energy: String): String{
    when(energy){
        "tired" -> if (hoursWorked < 8 && bugsFound > 0){return "strong"}
                    else if(hoursWorked > 8 && bugsFound > 0) {"Jet Fuel"}
        "awake" -> if (hoursWorked < 6 && bugsFound > 0){return "regular"}
        "juiced" -> return "weak"
        "hopes lost" -> return "there is no coffee strong enough"
        else -> return "unknown"
    }

    return "Caffeine"
}
fun createDrinkName(name: String): String{
    return "$name has been set as drinks name"
}