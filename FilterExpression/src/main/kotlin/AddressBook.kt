class AddressBook
{
    val employees= listOf(
        Employee("Vasanth","2023/01/01"),
        Employee("Vasu","2023/03/09"),
        Employee("Vishnu","2023/06/19"),
        Employee("Varun","2023/09/29")
    )
    data class Employee(
        val name:String,
        val startDate:String
    )
    fun EmployeeFilter(startDate: String)=
        employees.filter {
            it.startDate>=startDate
        }
}