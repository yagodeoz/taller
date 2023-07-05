package fin.coop1504.tallerjava.controladores;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import fin.coop1504.tallerjava.controladores.modelo.ModeloCrudRespuesta;
import fin.coop1504.tallerjava.modelo.ComprobanteElectronico;
import fin.coop1504.tallerjava.servicios.ComprobanteElectronicoServicio;
import lombok.extern.slf4j.Slf4j;

@RestController
@RequestMapping(path = "/crud_comprobante")
@Slf4j
public class ControladorCrudComprobante {

	@Autowired
	private ComprobanteElectronicoServicio lServicio;

	@PostMapping(path = "/guardar")
	public ModeloCrudRespuesta<String> guardar(ComprobanteElectronico lComprobante) {
		log.info("Inicio de metodo de registro de comprobante");
		try {
			lServicio.guardar(lComprobante);
			log.info("Registro de comprobante exitoso", new ModeloCrudRespuesta<>("Registro Exitoso", "0000", ""));
			return new ModeloCrudRespuesta<>("Registro Exitoso", "0000", "");
		} catch (Exception e) {
			String msg = "Error al realizar el registro del comprobante, CLASS ControladorCrudComprobante - guardar ";
			log.error(msg, e);
			return new ModeloCrudRespuesta<String>(msg, "1111", "");
		}
	}

}
