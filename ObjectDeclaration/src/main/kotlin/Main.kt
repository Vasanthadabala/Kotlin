import RestaurantTables.removeCustomer

fun main(args: Array<String>) {
   RestaurantTables.addCustomer("Vasanth")
    RestaurantTables.addCustomer("Lisa")
    RestaurantTables.addCustomer("Jessi")
    removeCustomer("Lisa")
    println(RestaurantTables.Customers)
    Waiter.branchAddress="Razole,AndhraPradesh"
    Waiter.branchName="Little Lemon"
}