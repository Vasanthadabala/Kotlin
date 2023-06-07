val taxCalculator:(Double,Double)->Double={     //Function as an Object
        price,taxRatio->price*taxRatio
}
fun main()
{
    val tax=taxCalculator(200.0,0.065)
    println(tax)
}