fun main()
{
    println( Menu().easyDishes(3))
    AddressBook().printNewEmployees(
        listOf(
            AddressBook.Employee("Vasanth","2023/01/01",false),
            AddressBook.Employee("Vasu","2023/03/09",false),
            AddressBook.Employee("Vishnu","2023/06/19",false),
        )
    )
}