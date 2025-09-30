/**
 * Class contain the product info.
 */
data class Product(val id: Int = 0, val name: String, val price: Double)

/**
 * The class handle all services related to the product.
 */
class  ProductService(){
    /**
     * The product list to handle
     */
    private val  products = mutableListOf<Product>()

    /**
     * The func is used to add new product.
     * @param item New product information.
     */
    fun addProduct(item: Product){
        this.products.add(item)
    }

    /**
     * The func is used to print all product information to console screen.
     */
    fun printAllProduct(){
        for (item in products) {
            println("${item.id} - ${item.name} - ${item.price}")
        }
    }

    /**
     * The func is used to remove a product by id from product list.
     * @param id The product id will be removed from the list.
     */
    fun removeProduct(id: Int){
        products.removeIf { it.id == id }
    }

    /**
     * Filter all products with price greater than or equal to the entered price.
     */
    fun  filterProductByPrice(price: Double){
        val filtered = products.filter { it.price >= price }
    }
}