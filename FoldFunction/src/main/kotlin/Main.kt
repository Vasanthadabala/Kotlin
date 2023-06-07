fun main()
{
    println(Menu().allIngredients())
    println(Balance(140.00).balanceAfterOrders(
        listOf(20.00,15.00,30.50)
    ))
}