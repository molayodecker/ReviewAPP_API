package com.deckerllc.rp;

import com.deckerllc.rp.category.CategoryService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.RequestMapping;


@SpringBootApplication
public class ReviewAppApplication implements CommandLineRunner{

    @Autowired
	private CategoryService categoryService;

	private static final Logger LOGGER = LoggerFactory.getLogger(ReviewAppApplication.class);

	public static void main(String[] args) {
		SpringApplication.run(ReviewAppApplication.class, args);

		LOGGER.error("Message logged at Error Level");
        LOGGER.warn("Message logged at Warn Level");
        LOGGER.info("Message logged at Info Level");
        LOGGER.debug("Message logged at Debug Level");
	}

	@RequestMapping("/")
	public String Welcome(){
            return "HelloWorld!";
    }

	@Override
	public void run(String... args) throws Exception {
		categoryService.createCategory("EPO", "http://www.restaurant.com");
		categoryService.lookup().forEach(category -> System.out.println(category));
	}
}