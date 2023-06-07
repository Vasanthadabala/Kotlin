fun main()
{
    val order=Order(100)
    val netOrderAmount =Order.getNetOrderAmount(order.amountBeforeTax)
    println(netOrderAmount)
}