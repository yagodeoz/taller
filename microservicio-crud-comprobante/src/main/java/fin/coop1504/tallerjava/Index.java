package fin.coop1504.tallerjava;

import javax.servlet.http.HttpServletResponse;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Index {

	@Value("${info.author}")
	private String nombre;
	@Value("${info.description}")
	private String descripcion;  
	@Value("${info.version}")
	private String version;
	@Value("${info.name}")
	private String app;
		  
	
	@GetMapping(path = "/")
	public String index(HttpServletResponse response) {
		return "Datos del microservicio: Aplicación: " + app + 
				", Descripcion: " + descripcion + ", versión: " + version + ", autor: " + nombre;  
	}
}
  