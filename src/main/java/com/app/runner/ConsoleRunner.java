package com.app.runner;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import com.app.model.Product;
import com.app.repo.ProductRepository;

@Component
public class ConsoleRunner implements CommandLineRunner {
	
	@Autowired
	private ProductRepository repo;
	

	@Override
	public void run(String... args) throws Exception {
		// TODO Auto-generated method stub
		
	//1.save method
		repo.save(new Product(10,"A",3.3));
		repo.save(new Product(11,"B",4.3));
		repo.save(new Product(12,"C",5.3));
		repo.save(new Product(13,"D",6.3));
	
		/*	
	//2.Update Call
		repo.save(new Product(10,"g",8.7));  
		
	//3. Bulk Insert
		
		List<Product> prds= Arrays.asList(new Product(14,"E",7.3), new Product(15,"F",8.3), new Product(16,"G",9.3));
		repo.saveAll(prds);
		
	//4. fetch one row
		Optional<Product> p= repo.findById(12);  //optional for avoid NullPointerEx.
		if(p.isPresent()) {
		Product prd= p.get();
		System.out.println(prd.getProdCode());
			}else
			{
				System.out.println("Row not found");
			}
		
	//5. fetch All Rows
		List<Product> list= repo.findAll();
		list.forEach(System.out::println); 
	
	//6.Delete Operations
		
		repo.deleteById(10);
	
	//7. DeleteAll Rows
		
		repo.All();  
		repo.deleteAllInBatch(); */
	}

}
