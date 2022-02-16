
fun main() {

    var num = arrayOf(1,2,4,7,5,3,10,12)

    println(num.contentToString())

    var pattern = IntArray(5) { i -> i * 2 + 3 }
    println(pattern.contentToString())

    println(pattern.last())

    println(num.sortedArray().contentToString())

    var message: String? =""
    for(i in 1..12){

        when(i){
            1 -> message = "Jan"
            2 -> message = "Feb"
            12 -> message = "Dec"
            else -> message = i.toString()
        }
        println(message)
    }
}



