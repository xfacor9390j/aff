package com.example.assignment;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.annotation.Bean;
import org.springframework.http.MediaType;
import org.springframework.web.reactive.function.client.WebClient;

@SpringBootApplication
public class AssignmentApplication {

	@Autowired
	private TrainService trainService; // Autowire TrainService

	public static void main(String[] args) {
		ConfigurableApplicationContext context = SpringApplication.run(AssignmentApplication.class, args);
		AssignmentApplication application = context.getBean(AssignmentApplication.class);
		application.run(); // Call the non-static run() method
	}

	public void run() {
		String Token = "eyJhbGciOiJIUzI1NiIsInR5cCI6IkpXVCJ9.eyJleHAiOjE2OTIxMDM1MjYsImNvbXBhbnlOYW1lIjoiaWlpdGRtIiwiY2xpZW50SUQiOiJlMmZjNjk4NS1jZGY0LTRiNDctYTczNi1lNzViY2EyNjY3ZjIiLCJvd25lck5hbWUiOiIiLCJvd25lckVtYWlsIjoiIiwicm9sbE5vIjoiY2VkMTlpMDEyIn0.L3VS-ck7liEMyM51U2eKD2IGiH8Czcau5ALyrjcce6Q";
		String url = "http://20.244.56.144/train/trains";
		WebClient.Builder builder = WebClient.builder();
		String abhi = builder.build()
				.get()
				.uri(url)
				.header("Authorization", "Bearer " + Token)
				.retrieve()
				.bodyToMono(String.class)
				.block();

		System.out.println("--------------------------");
		System.out.println(abhi);
		System.out.println("---------------------------");

		trainService.addTrainData(abhi); // Set train data using TrainService
		System.out.println(abhi);
	}
}
