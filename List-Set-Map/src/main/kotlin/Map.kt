fun main() {
    val Map = mapOf(1 to "One", 2 to "Two", 3 to "Three")
    println(Map[1])
    println(Map)
    for (x in Map) {
        println(x)
    }
    for (x in Map) {
        println(x.key)
    }
    for (x in Map) {
        println(x.value)
    }
}