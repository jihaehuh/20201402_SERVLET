package dao;
import java.util.ArrayList;
import dto.Product;

public class ProductRepository {
    private ArrayList<Product> listOfProducts = new ArrayList<Product>();
    private static ProductRepository instance = new ProductRepository();
    public static ProductRepository getInstance(){
	return instance;
    }
    public Product getProductById(String productId) {
		Product productById = null;
    		for (int i = 0; i < listOfProducts.size(); i++) {
			Product product = listOfProducts.get(i);
			if (product != null && product.getProductId() != null && product.getProductId().equals(productId)) {
				productById = product;
				break;
			}
		}
		return productById;
	}

	 
   
    public ProductRepository() {
		Product haribo = new Product("P1234", "HARIBO", 1000);
		haribo.setCategory("Jelly");
		haribo.setManufacturer("Germany");
		haribo.setCondition("New");
        haribo.setFilename("P1234.png");
        
        Product kinderChoco = new Product("P1235", "Kinder Chocolate", 1000);
		kinderChoco.setCategory("Chocolate");
		kinderChoco.setManufacturer("Germany");
		kinderChoco.setCondition("New");
        kinderChoco.setFilename("P1235.png");
        
        Product hersheychoco = new Product("P1236", "Hershey's Chocolate", 1000);
		hersheychoco.setCategory("Chocolate");
		hersheychoco.setManufacturer("America");
		hersheychoco.setCondition("New");
        hersheychoco.setFilename("P1236.png");
        		
        		
        Product candy = new Product("P1237", "Charms Candy", 1000);
		candy.setCategory("candy");
		candy.setManufacturer("America");
		candy.setCondition("New");
        candy.setFilename("P1237.png");
        
        
        
        Product loacker = new Product("P1238", "Loacker", 1000);
        loacker.setCategory("chocolate");
		loacker.setManufacturer("Italy");
		loacker.setCondition("New");
        loacker.setFilename("P1238.png");
        
        
        Product kido = new Product("P1239", "Kid-O", 1000);
        loacker.setCategory("cracker");
		loacker.setManufacturer("Philippine");
		loacker.setCondition("New");
        loacker.setFilename("P1239.png");
        
        
		

		// 위와 같이 상품 초기화 하고 아래에 상품을 추가

		listOfProducts.add(haribo);
		listOfProducts.add(kinderChoco);
		listOfProducts.add(hersheychoco);
        listOfProducts.add(candy);
        listOfProducts.add(loacker);
        listOfProducts.add(kido);
		// listOfProducts.add(상품명);
	}

	public ArrayList<Product> getAllProducts() {
		return listOfProducts;
	}
    
     public void addProduct(Product product) {
	listOfProducts.add(product);
   }
}