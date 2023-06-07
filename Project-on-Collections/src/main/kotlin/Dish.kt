class Menu {

    data class MenuItem(val name: String, val ingredients:Set<String>)

    val List = listOf<MenuItem>(
        MenuItem("Fish", setOf("cod","oil","flour","Salt")),
        MenuItem("Salad", setOf("Tomato","Carrot","Cucumber")),
        MenuItem("Onion Rings", setOf("onion","oil","flour"))
    )
    fun easyDishes(maximumIngredients:Int)=
        List.filter{ it.ingredients.size<=maximumIngredients }.
        map {"${it.name} (${it.ingredients.size})"}
}