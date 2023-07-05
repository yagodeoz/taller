/**
 * @author BYRON
 * 
 */
package fin.coop1504.tallerjava.repositorio;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import fin.coop1504.tallerjava.modelo.ComprobanteElectronico;

// TODO: Auto-generated Javadoc
/**
 * The Interface ComprobanteProcesadoIndividualEAO.
 */
@Repository
public interface ComprobanteElectronicoRepositorio extends JpaRepository<ComprobanteElectronico, String> {
	public List<ComprobanteElectronico> findByEstado(String estado);

}
