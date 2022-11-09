
public class UsuarioConfigurador extends Usuario implements Configurable {

	public UsuarioConfigurador(Integer dni, String nombre) {
		super(dni, nombre);
		
	}
	
	public Boolean agregarUsuario(Usuario usuario) {
		
		
		return true;
	}
	
	public Boolean agregarSensor(Integer idSensor, Integer idAlarma, String codConfiguracion, Sensor sensor, Integer idUsuarioConfigurador) {
		
		return true;
	}
	
	public Boolean activarSensor(Integer idSensor, Integer idAlarma, String codigoActivacionAlarma) {
		
		
	return true;
	}

	
}
