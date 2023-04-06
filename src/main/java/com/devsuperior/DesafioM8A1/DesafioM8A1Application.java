package com.devsuperior.DesafioM8A1;

import java.util.Locale;
import java.util.Scanner;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

import com.devsuperior.entities.Order;
import com.devsuperior.services.OrderService;

@SpringBootApplication
@ComponentScan({"com.devsuperior"})
public class DesafioM8A1Application implements CommandLineRunner {

	@Autowired
	private OrderService orderService;


	public static void main(String[] args) {
		SpringApplication.run(DesafioM8A1Application.class, args);
	}

	@Override
	public void run(String... args) throws Exception {

	Locale.setDefault(Locale.US);
	Scanner sc = new Scanner(System.in);

	int code = sc.nextInt();
	double basic = sc.nextDouble();
	double discount = sc.nextDouble();

	Order order = new Order(code, basic, discount);
	
	System.out.println("Pedido código "+ order.getCode());
	System.out.printf("Valor total: R$ %.2f",orderService.Total(order));
	sc.close();
	
	}
}