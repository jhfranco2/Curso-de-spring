package es.pildoras.ioC;

public class DirectorEmpleado implements Empleados {
	//metodo init.Ejecutar tareas antes de que el bean esté disponible
	
	public void metodoInicial() {
		
		System.out.println("Dentro del método init. Aqui irían las tareas a ejecutar antes de eque el bean este listo");
	}
	
   public void metodoFinal() {
		
		System.out.println("Dentro del método destroy. Aqui irían las tareas a ejecutar despues de que el bean muera");
	}
	
	//método destroy.Ejecutar tareas después de que el bean haya sido utilizado
	private String email;

	private String nombreEmpresa;

	//Creación de campo tipo creacionInforme(interfaz)
	private CreacionInformes informeNuevo;
	
	//Creacion del constructor que inyecta la dependencia
	public DirectorEmpleado(CreacionInformes informeNuevo) {
		this.informeNuevo = informeNuevo;
	}
	@Override
	public String getTareas() {
		// TODO Auto-generated method stub
		return "Gestionar la plantilla de la empresa";
	}

	@Override
	public String getInforme() {
		// TODO Auto-generated method stub
		return "Informe creado por el Director: " + informeNuevo.getInforme();
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getNombreEmpresa() {
		return nombreEmpresa;
	}
	public void setNombreEmpresa(String nombreEmpresa) {
		this.nombreEmpresa = nombreEmpresa;
	}
	public CreacionInformes getInformeNuevo() {
		return informeNuevo;
	}
	public void setInformeNuevo(CreacionInformes informeNuevo) {
		this.informeNuevo = informeNuevo;
	}
	
	

}
