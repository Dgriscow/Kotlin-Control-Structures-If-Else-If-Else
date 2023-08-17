fun main(args: Array<String>) {
    println("What is your current Temperature?")
    val userTemperature:Double = readln()!!.toDouble()

    if (userTemperature > 99.5){
        println("Temperature is to High!")
    }else if (userTemperature in 97.5..99.5){
        println("Temperature is Normal")
    }else if (userTemperature < 97.5){
        println("Temperature is to Low!")
    }


}