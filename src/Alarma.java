import java.util.LinkedList;
import java.util.List;

public class Alarma {
	protected Integer idAlarma;
	protected String codigoActivacion;
	protected String codigoConfiguracion;
	protected String nombre;	
	List<Usuario> usuariosAutorizados;
	List<Accion> accionesRealizadas;
	List<Sensor> sensores;
	
	
	
	
	public Alarma(Integer idAlarma, String codigoActivacion, String codigoConfiguracion, String nombre) {
		
		usuariosAutorizados = new LinkedList<Usuario>();
		accionesRealizadas = new LinkedList<Accion>();
		sensores = new LinkedList<Sensor>();
		
		this.idAlarma = idAlarma;
		this.codigoActivacion = codigoActivacion;
		this.codigoConfiguracion = codigoConfiguracion;
		this.nombre = nombre;

	}
	
	public Alarma(Integer idAlarma, String codigoConfiguracion) {
		this.idAlarma=idAlarma;
		this.codigoConfiguracion = codigoConfiguracion;
	}
	
	
	
	public Integer getIdAlarma() {
		return idAlarma;
	}
	public void setIdAlarma(Integer idAlarma) {
		this.idAlarma = idAlarma;
	}
	public String getCodigoActivacion() {
		return codigoActivacion;
	}
	public void setCodigoActivacion(String codigoActivacion) {
		this.codigoActivacion = codigoActivacion;
	}
	public String getCodigoConfiguracion() {
		return codigoConfiguracion;
	}
	public void setCodigoConfiguracion(String codigoConfiguracion) {
		this.codigoConfiguracion = codigoConfiguracion;
	}
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public List<Usuario> getUsuariosAutorizados() {
		return usuariosAutorizados;
	}
	public void setUsuariosAutorizados(List<Usuario> usuariosAutorizados) {
		this.usuariosAutorizados = usuariosAutorizados;
	}
	public List<Accion> getAccionesRealizadas() {
		return accionesRealizadas;
	}
	public void setAccionesRealizadas(List<Accion> accionesRealizadas) {
		this.accionesRealizadas = accionesRealizadas;
	}
	public List<Sensor> getSensores() {
		return sensores;
	}
	public void setSensores(List<Sensor> sensores) {
		this.sensores = sensores;
	}

	
	
	
	
}
