import javax.swing.SortOrder

class Balance(private val balance: Double) {
    fun balanceAfterOrders(order: Collection<Double>)=order.fold(balance){
        acc,element->
        acc+element
    }
}