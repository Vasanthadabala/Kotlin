interface MilkFrother{
    fun getMilk():String
}
class FakeMilkFrother:MilkFrother{
    override fun getMilk(): String {
        return "hot milk"
    }
}
class CoffeeMachine(private val milkFrother: MilkFrother)
{
    fun makeCoffee():String{
        return "Coffee with"+milkFrother.getMilk()
    }
}