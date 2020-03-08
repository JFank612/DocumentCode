class Commercial(name: String,phone: String,
                 address: String,squareFeet: Double,
                 propertyName: String, properties: Boolean):
    Customer(name,phone,
        address,squareFeet)
{

    var propertyName = ""
    var price = 0.0
    var properties = false

    init{
        this.name = name
        this.phone = phone
        this.address = address
        this.squareFeet = squareFeet
        this.propertyName = propertyName
        this.properties = properties
    }

    fun charges(){
        price = 5 * squareFeet/1000

        if(properties == true)
        {
            price = price*.9
        }

        println("Multi-property: " + properties +"\nWeekly charge: $" + price + "\nProperty Name: " + propertyName)
    }
}

class Residential(name: String,phone: String,
                  address: String,squareFeet: Double,
                  Senior: Boolean):
    Customer(name,phone,
        address,squareFeet) {
    var price = 0.0
    var Senior = false

    init {
        this.name = name
        this.phone = phone
        this.address = address
        this.squareFeet = squareFeet
        this.Senior = Senior
    }

    fun charges() {
        price = 6 * squareFeet / 1000

        if (Senior == true) {
            price = price * .85
        }

        println("Senior discount: $Senior\nWeekly charge: $$price")
    }
}
