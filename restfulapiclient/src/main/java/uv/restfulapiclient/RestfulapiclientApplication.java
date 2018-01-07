package uv.restfulapiclient;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.web.client.RestTemplateBuilder;
import org.springframework.context.annotation.Bean;
import org.springframework.web.client.RestTemplate;

@SpringBootApplication(scanBasePackages="uv.restfulapiclient.*")
@EnableAutoConfiguration
public class RestfulapiclientApplication {

	private static final Logger log = LoggerFactory.getLogger(RestfulapiclientApplication.class);
	
	public static void main(String[] args) {
		SpringApplication.run(RestfulapiclientApplication.class, args);
	}
	
	
	@Bean
	public RestTemplate restTemplate(RestTemplateBuilder builder) {
		return builder.build();
	}
	
}
