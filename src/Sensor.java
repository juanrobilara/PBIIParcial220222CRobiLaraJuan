
public class Sensor {
	private Integer identificador;
	private Boolean estado = false;
	
	
	
	
	public Sensor(Integer identificador, Boolean estado) {
		
		this.identificador = identificador;
		this.estado = estado;
	}
	public Integer getIdentificador() {
		return identificador;
	}
	public void setIdentificador(Integer identificador) {
		this.identificador = identificador;
	}
	public Boolean getEstado() {
		return estado;
	}
	public void setEstado(Boolean estado) {
		this.estado = estado;
	}
	
	
}
