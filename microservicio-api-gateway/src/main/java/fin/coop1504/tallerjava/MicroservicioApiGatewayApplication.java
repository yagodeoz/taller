package fin.coop1504.tallerjava;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

@SpringBootApplication
@EnableEurekaClient
public class MicroservicioApiGatewayApplication {

	public static void main(String[] args) {
		SpringApplication.run(MicroservicioApiGatewayApplication.class, args);
	}

}
