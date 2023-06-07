class AddressBook
{
    val employees= listOf(
        Employee("Vasanth","2023/01/01",false),
        Employee("Vasu","2023/03/09",false),
        Employee("Vishnu","2023/06/19",false),
        Employee("Varun","2023/09/29",false)
    )
    data class Employee(
        val name:String,
        val startDate:String,
        val isVeteran:Boolean
    )
    fun printNewEmployees(newEmployees: List<Employee>)=
        employees.map{it.copy(isVeteran=true)}.
                fold(newEmployees.toMutableList()){acc,employee->
                    acc.apply { add(employee) }
                }.forEach{
                    println("${it.name}(veteran:${it.isVeteran})")
        }
}