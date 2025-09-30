data class Product(val id: Int = 0, val name: String, val price: Double)
class  ProductService(){
    private val  products = mutableListOf<Product>()

    fun addProduct(item: Product){
        this.products.add(item)
    }

    fun printAllProduct(){
        for (item in products) {
            println("${item.id} - ${item.name} - ${item.price}")
        }
    }

    fun removeProduct(id: Int){
        products.removeIf { it.id == id }
    }

    fun  filterProductByPrice(price: Double){
        val filtered = products.filter { it.price >= price }
    }
}