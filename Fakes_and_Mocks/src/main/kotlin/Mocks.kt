class Engine()
{
    fun PowerUp(){}
    fun getVoltage():String
}
class IceCreamMachine(private val engine: Engine)
{
    fun PowerUp(){
        engine.PowerUp()
    }
}