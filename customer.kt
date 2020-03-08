open class Customer(name: String, phone: String,
                    address: String,squareFeet: Double) {
    var name = ""
    var phone = ""
    var address = ""
    var squareFeet = 0.0
    init{
        println("Creating a customer")
        this.name = name
        this.phone = phone
        this.address = address
        this.squareFeet = squareFeet
    }

    fun showInfo(){
        println("Name: " + name + "\nPhone: " + phone +
                "\nAddress: " + address + "\nSquare Feet: " + squareFeet)
    }
}
