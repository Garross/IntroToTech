import kotlin.random.Random

fun main() {
    println("Hit Enter to open the box")

    var command: String = readln()

    val carrotCount: Int = Random.nextInt(0, 2)

    if(carrotCount==1){
        println("carrot, shhhh")
    }
    else{
        println("no carrot :(")
    }

    println("Hit Enter to close the box")

    command = readln()


    for(i in 1..100){
        println()
    }

    println("The box is closed")

    println("Player 2, do you want to swap boxes? 'Yes' or 'No'")

    command = readln()

    if(command == "Yes" && carrotCount == 1){
        println("You win! YEEESSSSS")
    }
    else if(command == "No" && carrotCount == 0){
        println("You win! Carroooot Time")
    }
    else{
        println("You lose. No CARROT for you!!!")
    }

}