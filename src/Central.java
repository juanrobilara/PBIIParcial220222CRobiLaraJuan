import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;


public class Central {

	List<Alarma> alarmas;
	List<Usuario> usuarios;
	
	
	
	public Central() {
		alarmas = new LinkedList<Alarma>();
		usuarios = new LinkedList<Usuario>();
		
	}


	public Boolean agregarUsuario(Usuario actual) {
		
		usuarios.add(actual);
		return true;
	}
	
	public void agregarUsuarioAUnaAlarma(Integer dniUsuario, Integer idAlarma, String codigoConfig)  throws CodigoAlarmaIncorrectoException{
		
		for(Alarma alarma : alarmas) {
			if(idAlarma == alarma.idAlarma) {
				for(Usuario user : usuarios) {
					if (user.getDni()==dniUsuario) {
						if(alarma.codigoConfiguracion == codigoConfig) {
							alarma.usuariosAutorizados.add(user);
						} else throw new CodigoAlarmaIncorrectoException("Falló");												
					}
				}
				
			}
			
		}
		
	}
	
	public Boolean agregarAlarma(Alarma a) {
		alarmas.add(a);
		return true;
	}
	
	public Boolean agregarSensorAAlarma(int idAlarma)

}
