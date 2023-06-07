class Menu {

    data class MenuItem(val name: String, val ingredients:Set<String>)

    val List = listOf<MenuItem>(
        MenuItem("Fish", setOf("cod","oil","flour")),
        MenuItem("Salad", setOf("Tomato","Carrot","Cucumber")),
        MenuItem("Onion Rings", setOf("onion","oil","flour"))
    )
    fun dishnFilter(ingredient:String)=List.filter {
        it.ingredients.contains(ingredient) }
    }