class Dish(
    val dishName:String,
    val ingredients:MutableList<String>
)
fun Dish.printIngredients()
{
    println(ingredients)
}
fun Dish.removeSalt()
{
    ingredients.remove("Salt")
}
fun main() {
   // val List= mutableListOf<String>("Onion","Cheese","Water","Salt")
    //val onionSoup=Dish("Onion Soup", ingredients =List )
    val onionSoup=Dish("Onion Soup", mutableListOf<String>("Onion","Cheese","Water","Salt"))
    onionSoup.removeSalt()
    onionSoup.printIngredients()
}