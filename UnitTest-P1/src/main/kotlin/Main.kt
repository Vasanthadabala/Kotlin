data class Product(
    var title:String,
    var price:Double,
    var stockAmount:Int
)
{
    fun applyDiscount(discountPercentage:Int)
    {
        if(stockAmount>0 && stockAmount<=10)
        {
            price=price-(price*discountPercentage/100)
        }
    }
}