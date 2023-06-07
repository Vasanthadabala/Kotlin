import java.util.Collections.addAll

class Menu {

    data class MenuItem(val name: String, val ingredients:Set<String>)

    val List = listOf<MenuItem>(
        MenuItem("Fish", setOf("cod","oil","flour")),
        MenuItem("Salad", setOf("Tomato","Carrot","Cucumber")),
        MenuItem("Onion Rings", setOf("onion","oil","flour"))
    )
    fun allIngredients()=List.fold(mutableSetOf<String>()){acc,dish->
        acc.apply{
            addAll(dish.ingredients)
        }
    }
}