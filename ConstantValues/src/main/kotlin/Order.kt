class Order(val amountBeforeTax:Int) {
    companion object{
        const val Tax_Percentage=5
        fun getNetOrderAmount(orderAmount:Int):Double
        {
            return  orderAmount+(orderAmount* Tax_Percentage/100.0)
        }
    }
}