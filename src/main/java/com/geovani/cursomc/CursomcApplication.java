package com.geovani.cursomc;

import java.util.Arrays;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.geovani.cursomc.domain.Address;
import com.geovani.cursomc.domain.Category;
import com.geovani.cursomc.domain.City;
import com.geovani.cursomc.domain.Client;
import com.geovani.cursomc.domain.Product;
import com.geovani.cursomc.domain.State;
import com.geovani.cursomc.domain.enums.ClientType;
import com.geovani.cursomc.repositories.AddressRepository;
import com.geovani.cursomc.repositories.CategoryRepository;
import com.geovani.cursomc.repositories.CityRepository;
import com.geovani.cursomc.repositories.ClientRepository;
import com.geovani.cursomc.repositories.ProductRepository;
import com.geovani.cursomc.repositories.StateRepository;


@SpringBootApplication
public class CursomcApplication implements CommandLineRunner {

	@Autowired
	private CategoryRepository categoryRepository; 
	
	@Autowired
	private ProductRepository productRepository;
	
	@Autowired
	private StateRepository stateRepository;
	
	@Autowired
	private CityRepository cityRepository;
	
	@Autowired
	private ClientRepository clientRepository;
	
	@Autowired
	private AddressRepository addressRepository;
	
	public static void main(String[] args) {
		SpringApplication.run(CursomcApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		Category cat1 = new Category(null, "Informática");
		Category cat2 = new Category(null, "Escritório");
		
		Product p1 = new Product(null, "Computador", 2000.00);
		Product p2 = new Product(null, "Impressora", 800.00);
		Product p3 = new Product(null, "Mouse", 80.00);
		
		cat1.getProducts().addAll(Arrays.asList(p1, p2, p3));
		cat2.getProducts().addAll(Arrays.asList(p2));
		
		p1.getCategories().addAll(Arrays.asList(cat1));
		p2.getCategories().addAll(Arrays.asList(cat1, cat2));
		p3.getCategories().addAll(Arrays.asList(cat1));
	
		
		categoryRepository.saveAll(Arrays.asList(cat1, cat2));
		productRepository.saveAll(Arrays.asList(p1, p2, p3));
		
		State state1 = new State(null, "Minas Gerais");
		State state2 = new State(null, "São Paulo");
		
		City city1 = new City(null, "Uberlândia", state1);
		City city2 = new City(null, "São Paulo", state2);
		City city3 = new City(null, "Campinas", state2);
		
		state1.getCities().addAll(Arrays.asList(city1));
		state2.getCities().addAll(Arrays.asList(city2, city3));
		
		stateRepository.saveAll(Arrays.asList(state1, state2));
		cityRepository.saveAll(Arrays.asList(city1, city2, city3));
		
		Client cli1 = new Client(null, "Maria Silva", "maria@gmail.com", "36378912345", ClientType.PESSOAFISICA);
		cli1.getPhones().addAll(Arrays.asList("3216545", "54684213"));
		
		Address e1 = new Address(null, "Rua Flores", "300", "Apto 303", "Jardim", "38220834", cli1, city1);
		Address e2 = new Address(null, "Avenida Matos", "105", "Sala 800", "Centro", "5645431", cli1, city2);
		
		cli1.getAddresses().addAll(Arrays.asList(e1, e2));
		
		clientRepository.save(cli1);
		addressRepository.saveAll(Arrays.asList(e1, e2));
		
	}

}
