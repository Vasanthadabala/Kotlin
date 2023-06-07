class Menu {

    data class MenuItem(val name: String, val price: Double)

    val List = listOf<MenuItem>(
        MenuItem("Fish", 10.00),
        MenuItem("Salad", 5.00),
        MenuItem("Onion Rings", 4.50)
    )
    fun itemNames()=List.map { item->
        println(item.name)
    }
}