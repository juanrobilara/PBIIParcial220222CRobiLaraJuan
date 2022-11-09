import static org.junit.Assert.*;

import org.junit.Test;

public class AlarmasTest {

	@Test
	public void queSePuedaCrearUnaAlarma() {
		Alarma a = new Alarma(1234, "a");
	}
	
	
//Tests pedidos	

	@Test 
	public void queSePuedaRegistrarUnaAlarmaEnLaCentral() {
		
		Central central = new Central();
		Alarma a = new Alarma(1234, "b");
		
		central.agregarAlarma(a);
		
		
	}
	
	@Test 
	public void queSePuedaAgregarUnUsuarioConfiguradorAUnaAlarma() {
		Alarma a = new Alarma(1234, "22C");
		Central central = new Central();		
		Administrador admin = new Administrador(123, "Jose");
		UsuarioConfigurador configurador = new UsuarioConfigurador(321, "Pedro");
				
		
		
		
	}
	
	@Test (expected = CodigoAlarmaIncorrectoException.class)
	public void alAgregarUnUsuarioAUnaAlarmaConCodigoDeConfiguracionDeAlarmaInvalidoSeLanceCodigoAlarmaIncorrectoException () throws CodigoAlarmaIncorrectoException {
		Alarma a = new Alarma(1234, "22C");
		Central central = new Central();		
		Administrador admin = new Administrador(123, "Jose");
		
		
			admin.agregarUsuarioAUnaAlarma(123, 1234, "22D", central);
		
		}
	
	@Test (expected = SensorDuplicadoException.class) 
	public void alAgregarUnSensorDuplicadoEnUnaAlarmaSeLanceUnSensorDuplicadoException() {
		
	}
	
	@Test
	public void queNoSePuedaActivarUnaAlarmaSiHayAlMenosUnSensorDesactivado() {
		
	}
	

}






