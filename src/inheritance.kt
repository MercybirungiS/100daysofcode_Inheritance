fun main() {
    var items=Supermarket ("Vegetables","Oranges","Biscuits","Soda",4500.toFloat())
    println(items.location("Kampala-Uganda"))
    items.price(6000)
    items.price(2000)
    val  things=Supermarket.Shop("Brocolli","Mangoes","Dorittos","Juice",900.toFloat())
    println(things.location("Nairobi-Kenya") )
}
 open class Supermarket(var groceries:String,var fruits:String,var snacks:String,var drinks:String , var budget :Float){
    open  fun location(name:String):String{
        return "It is located in $name"
    }
    fun price(amount:Int){
        var balance=amount-budget
        if (amount<=budget ){
            println("You can buy all the things")
        }
        else{
            println("Reduce the on the  $groceries you want to buy")
        }
    }
    class Shop(groceries: String,fruits: String,snacks: String,drinks: String,budget: Float):Supermarket(groceries, fruits, snacks, drinks, budget){
        override fun location(name: String): String {
            return " It is actually located in $name"
           }

         }
     }
