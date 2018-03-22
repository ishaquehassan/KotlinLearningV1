fun main(args: Array<String>) {
    var name = "Ishaq"
    var nameStr:String = "Xyz"

    var anyType :Any  = "Any Value"
    anyType = 10
    anyType = 2000L
    anyType = 3.6f
    anyType = true
    anyType = "Again String"

    if(anyType is String){
        println(anyType.length)
    }

    var nullSafe : String? = null
    //nullSafe = "Hello world"

    val myLength:Int = nullSafe?.length ?: 10

    println(myLength)

}