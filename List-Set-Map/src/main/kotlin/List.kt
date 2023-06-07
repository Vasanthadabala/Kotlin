data class List(
    val name:String,
    val age:Int
)
fun main() {
    val list = listOf(
        List("vasanth", 23),
        List("sai", 24),
        List("sneha", 22)
    )
    println("Size of List:${list.size}")            //Size of list
    println("Element One In List:${list[0]}")       //Accesing List
    println("All Elements In List:")
    for (x in list) {
        println(x)                                  //Iterating List
    }
}