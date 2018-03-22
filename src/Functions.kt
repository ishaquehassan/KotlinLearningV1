fun main(args: Array<String>) {
    hello()
    helloWithParam("Ishaq")
    helloWithOptionalParam("Xyz",22)
    helloWithOptionalParamRearrange(name = "Abc",age = 30)

    val hello = fun (abc:Int){
        println(abc)
    }

    fun abcInner(){
        println("abcInner")
    }

    hello(23000)
    abcInner()

    myHocFun {
        println("Here is the param $it")
    }

    myHocFun {param ->
        println("Here is the param $param")
    }

    println("Sum is ${sum(2,5)}")

    println(returnAFunc()("Ishaq"))
}

fun returnAFunc():(String) -> String{
    val abc = fun (name:String) : String {
        return "Hello world $name"
    }
    return abc
}
fun sum(a:Int,b:Int):Int{
    return a+b
}

fun myHocFun(hello:(String) -> Unit){
    hello("Passing Param From myHocFun")
}

fun hello(){
    println("Hello world")
}

fun helloWithParam(name:String){
    println("Hello $name")
}

fun helloWithOptionalParam(name:String,age:Int = 10){
    println("Hello $name and age is $age")
}

fun helloWithOptionalParamRearrange(age:Int = 10,name:String){
    println("Hello $name and age is $age")
}
