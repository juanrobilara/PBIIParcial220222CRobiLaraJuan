
public class Administrador extends Usuario implements Activable, Configurable {

	
	
	public Administrador(Integer dni, String nombre) {
		super(dni, nombre);
		
	}

	public Boolean agregarAlarma(Alarma a, Central c) {
		c.agregarAlarma(a);
		return true;
	}
	
	public Boolean registrarUsuario(Usuario usuario, Central c) {
		
		
		c.agregarUsuario(usuario);
		return true;
	}
	
	public void agregarUsuarioAUnaAlarma(Integer dniUsuario, Integer idAlarma, String codigoConfigAlarma, Central c) throws CodigoAlarmaIncorrectoException {
		
		
		c.agregarUsuarioAUnaAlarma(dniUsuario, idAlarma, codigoConfigAlarma);
		
		
	}
	
	public void agregarSensorAAlarma(Integer idAlarma, String codigoConfiguracion, Sensor sensor, Integer idConfigurador) {
		
	}
}
