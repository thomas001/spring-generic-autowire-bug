package com.example;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class SpringGenericAutowireBugApplication {

	@Bean
	public BeanCollector<Foo> fooBeanCollector() {
		return new BeanCollector<>("foo");
	}

	@Bean
	public BeanCollector<Bar> barBeanCollector() {
		return new BeanCollector<>("bar");
	}

	@Bean
	public BaseBeanCollector<Foo> fooBaseBeanCollector() {
		return new BaseBeanCollector<Foo>("foo base");
	}

	@Bean
	public BaseBeanCollector<Bar> barBaseBeanCollector() {
		return new BaseBeanCollector<>("bar base");
	}


	@Bean
	public BaseBeanCollector<Foo> fooBaseBeanCollectorAnonClass() {
		return new BaseBeanCollector<Foo>("foo base anonymous class") {};
	}

	@Bean
	public BaseBeanCollector<Bar> barBaseBeanCollectorAnonClass() {
		return new BaseBeanCollector<Bar>("bar base anonymous class") {};
	}


	@Bean
	public BeanCollector<Foo> fooBeanCollectorAnonClass() {
		return new BeanCollector<Foo>("foo anonymous class") {};
	}

	@Bean
	public BeanCollector<Bar> barBeanCollectorAnonClass() {
		return new BeanCollector<Bar>("bar anonymous class") {};
	}

	@Bean
	public FooBeanCollector fooBeanCollector2() {
		return new FooBeanCollector();
	}

	public static void main(String[] args) {
		SpringApplication.run(SpringGenericAutowireBugApplication.class, args);
	}
}
