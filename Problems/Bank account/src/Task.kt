// write the BankAccount class here
class BankAccount constructor(deposited: Long, withdrawn: Long) {
    val deposited: Long = deposited
    val withdrawn: Long = withdrawn
    val balance = deposited - withdrawn
}
