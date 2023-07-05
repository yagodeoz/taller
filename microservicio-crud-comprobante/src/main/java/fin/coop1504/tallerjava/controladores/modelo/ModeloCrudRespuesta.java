package fin.coop1504.tallerjava.controladores.modelo;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@NoArgsConstructor
@Getter
@Setter
public class ModeloCrudRespuesta<T extends Object> {

	private String mensajeRespuesta;
	private String codigoError;
	private T resultado;

	public ModeloCrudRespuesta(String mensajeRespuesta, String codigoError, T valor) {
		this.mensajeRespuesta = mensajeRespuesta;
		this.codigoError = codigoError;
		this.resultado = valor;
	}
}
