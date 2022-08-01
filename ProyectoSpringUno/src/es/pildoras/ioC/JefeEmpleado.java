package es.pildoras.ioC;

public class JefeEmpleado implements Empleados{

	public JefeEmpleado(CreacionInformes informeNuevo) {
		this.informeNuevo = informeNuevo;
	}

		//Creación de campo tipo creacionInforme(interfaz)
		private CreacionInformes informeNuevo;
	public String getTareas() {
		return "Gestiono las cuestiones relativas a mis empleados de seccion";
	}

	@Override
	public String getInforme() {
		// TODO Auto-generated method stub
		return "Informe presentado por el jefe con arreglos: " + informeNuevo.getInforme();
	}
}
