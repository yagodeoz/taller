/**
 * @author BYRON
 * 
 */
package fin.coop1504.tallerjava.modelo;

import java.io.Serializable;
import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

import lombok.Getter;
import lombok.Setter;

// TODO: Auto-generated Javadoc
/**
 * The Class ComprobanteElectronico.
 */
@Entity
@Table(name = "TAB_COMPROBANTES")
@Getter
@Setter
public class ComprobanteElectronico implements Serializable {

	/** The Constant serialVersionUID. */
	private static final long serialVersionUID = 1L;

	/** The clave acceso. */
	@Id
	@Column(name = "CLAVE_ACCESO")
	private String claveAcceso;

	/** The estado. */
	private String estado;

	/** The fecha registro. */
	@Temporal(TemporalType.TIMESTAMP)
	@Column(name = "FECHA_REGISTRO")
	private Date fechaRegistro;

	/** The fecha actualizacion. */
	@Temporal(TemporalType.TIMESTAMP)
	@Column(name = "FECHA_ACTUALIZACION")
	private Date fechaActualizacion;

	/** The observacion. */
	private String observacion;

}
