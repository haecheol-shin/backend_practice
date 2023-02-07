package ch08;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class ProductService {
	Map<String, Product> products = new HashMap<>();
	
	public ProductService() {
		Product p = new Product("101", "아이폰14", "Apple", 1200000, "2020.02.02");
		products.put("101", p);
		p = new Product("102", "갤럭시S22", "Samsung", 1100000, "2021.12.12");
		products.put("102", p);
		p = new Product("103", "아이패드Air", "Apple", 800000, "2023.03.03");
		products.put("103", p);
	}
	
	public List<Product> findAll() {
		return new ArrayList<>(products.values());
	}
	
	public Product find(String id) {
		return products.get(id);
	}
}
