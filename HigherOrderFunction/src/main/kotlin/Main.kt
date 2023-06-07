fun greet(name: String, function: (name: String) -> Unit) {
    function(name)
}
fun print(name: String) {
    println("Hello $name")
}
fun main()
{
    greet("Joe", ::print)
    greet("Joe") { println("Hi $it") }
}