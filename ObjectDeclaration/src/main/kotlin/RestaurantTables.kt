object RestaurantTables {
    val Customers= mutableListOf<String>()
    fun addCustomer(customer:String)
    {
        Customers.add(customer)
    }
    fun removeCustomer(customer: String)
    {
        Customers.remove(customer)
    }

}