import org.junit.Assert.*

class EngineTest{
    val mockEngine:Engine=mock()
    val classUnderTest = IceCreamMachine(mockEngine)
    classUnderTest.powerUp()
    verify(fakeEngine).powerUp()
    given { fakeEngine.getVoltage() }.willReturn("Some value")
}