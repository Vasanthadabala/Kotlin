class Order2(val orderAmount:Int)//outer Class
{
    inner class TaxDetails{      //Inner Class
        val taxAmount=0.05 * orderAmount
    }
}
fun main()
{
    val tax = Order2(100).TaxDetails()
    println(tax.taxAmount)
}