//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
fun main() {
    val service: ProductService = ProductService();
    service.addProduct(Product(1,"Iphone 17", 15000.0))
    service.printAllProduct()
    
}