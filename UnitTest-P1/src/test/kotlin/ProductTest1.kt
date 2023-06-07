import junit.framework.TestCase

import org.junit.Assert.*
import org.junit.Test

class ProductTest1 : TestCase()
{
    @Test
    fun test1()
    {
        val result=Product("Spaghetti",20.0,3)
        result.applyDiscount(20)
        assertEquals(16.00, result.price, 0.0)
    }
    @Test
    fun test2()
    {
        val result=Product("Steak ",30.0,8)
        result.applyDiscount(20)
        assertEquals(30.00,result.price, 0.0)
    }
    @Test
    fun test3()
    {
        val result=Product("Lasagna  ",10.0,0)
        result.applyDiscount(20)
        assertEquals(10.00,result.price, 0.0)
    }
}