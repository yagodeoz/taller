package fin.coop1504.tallerjava;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

import de.codecentric.boot.admin.server.config.EnableAdminServer;

@SpringBootApplication
@EnableAdminServer
@EnableEurekaServer
public class MicroservicioAdministradorApplication {

	public static void main(String[] args) {
		SpringApplication.run(MicroservicioAdministradorApplication.class, args);
	}
}
