package fin.coop1504.tallerjava.servicios;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import fin.coop1504.tallerjava.modelo.ComprobanteElectronico;
import fin.coop1504.tallerjava.repositorio.ComprobanteElectronicoRepositorio;

@Service
public class ComprobanteElectronicoServicio {

	@Autowired
	private ComprobanteElectronicoRepositorio lRepositorio;

	@Transactional()
	public void guardar(ComprobanteElectronico lComprobante) {
		lRepositorio.save(lComprobante);
	}

	@Transactional(readOnly = true)
	public List<ComprobanteElectronico> listaCompletaComprobante(String estado) {
		// TODO Auto-generated method stub
		return lRepositorio.findByEstado(estado);
	}

}
