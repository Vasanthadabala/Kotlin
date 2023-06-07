class Menu {

    data class MenuItem(val name: String, val price: Double)

    val List = listOf<MenuItem>(
        MenuItem("Fish", 10.00),
        MenuItem("Salad", 5.00),
        MenuItem("Onion Rings", 4.50)
    )
    fun dscountedMenu(discount:Double)
    {
        List.forEach{item->
            println(item.copy(price = item.price*(1.0-discount)))
        }
    }
}