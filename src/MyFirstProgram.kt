fun main(args: Array<String>){
    println("Welcome to the Program! Please enter your name!")

    var person = TestClass()

    person.name = readLine()

    println("Hello World, it's a me: ${person.name}io")

//    var a: String? = ""
//    var b: String? = ""
//    a = readLine()
//    b = readLine()
//
//    if (a != null && b!=null) {
//        println(a.toInt() + b.toInt())
//    }

    //Bouncer app:
    println("Wie alt bist du??????")
    var age = readLine()

    if (age != null) {
        if (age.toInt() > 18){
            println("Yeah yeah, go ahead then")
        }
        else{
            println("Not today bro, grow a little")
        }
    }

}
