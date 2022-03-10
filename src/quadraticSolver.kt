import kotlin.math.*
import com.ourLibrary.UIhackedForCLI

fun main(){
    while(true){
        var UIresults: DoubleArray = UIhackedForCLI()

        var a: Double = UIresults[0]
        var b: Double = UIresults[1]
        var c: Double = UIresults[2]

        println("Finding the roots for ${a}x²+${b}x+${c}")

        var determinant: Double = b.pow(2)-4*a*c
        println(determinant)
        var root1: String
        var root2: String

        if(determinant >0){
            root1 = ((-1*b + sqrt(determinant))/(2*a)).toString()
            root2 = ((-1*b - sqrt(determinant))/(2*a)).toString()
        }
        else{
            var realPart = -b/(2*a)
            var imaginaryPart = sqrt(-determinant) / (2*a)

            root1 = "${realPart}+${imaginaryPart}i"
            root2 = "${realPart}-${imaginaryPart}i"
        }

        println("The roots are $root1 and $root2")

        //future work make the imaginary output prettier.
        //create a button to leave!
        var command = readLine()
        println("Press q to quit otherwise hit any key to continue")
        if(command == "q"){
            break
        }
    }
}

