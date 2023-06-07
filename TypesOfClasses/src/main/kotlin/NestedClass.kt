class Order//Outer Class
{
    var id=1
    class DeliveryDetails //Nested Class
    {
        var deliveryFee="$10"
    }
}
fun main()
{
    val x= Order.DeliveryDetails()
    println(Order().id)
    println(x.deliveryFee)
}
