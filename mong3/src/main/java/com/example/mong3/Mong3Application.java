package com.example.mong3;

import com.example.mong3.entity.Mongo;
import com.example.mong3.repo.MongoRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.util.Arrays;
import java.util.List;

@SpringBootApplication
public class Mong3Application implements CommandLineRunner {

	@Autowired
	private MongoRepo mongoRepo;

	public static void main(String[] args) {

		SpringApplication.run(Mong3Application.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		Mongo customer1 = new Mongo("text1","text2");
		Mongo customer2 = new Mongo( "textTest1","textTest2");

		// insert
		mongoRepo.insert(Arrays.asList(customer1, customer2));

		// get
		List<Mongo> result = this.mongoRepo.findByText1("s1");
		System.out.println(result);
	}


}
