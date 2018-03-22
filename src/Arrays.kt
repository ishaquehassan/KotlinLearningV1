fun main(args: Array<String>) {
    val friends = arrayOf("Ishaq","Hassan")
    for (friend in friends){
        println(friend)
    }
    println("========")
    for (fi in 0 until friends.size){
        println("$fi = ${friends[fi]}")
    }
    println("========")
    friends.forEach {
        println("Friend Name $it")
    }
}