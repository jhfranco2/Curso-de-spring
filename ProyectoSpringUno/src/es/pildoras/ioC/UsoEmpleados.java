package es.pildoras.ioC;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class UsoEmpleados {

	public static void main(String[] args) {
		
		/*
		//Creacion de objetos de tipo Empleado
		Empleados Empleado1 = new DirectorEmpleado();
		
		
		//Uso de los objetos creados
		System.out.println(Empleado1.getTareas());*/
		
		ClassPathXmlApplicationContext contexto = new ClassPathXmlApplicationContext("applicationContext.xml");
		
		DirectorEmpleado Juan = contexto.getBean("miEmpleado", DirectorEmpleado.class);
		
		System.out.println(Juan.getTareas());
		
		System.out.println(Juan.getInforme());
		
		System.out.println(Juan.getEmail());
		
		System.out.println(Juan.getNombreEmpresa());
	/*SecretarioEmpleado maria = contexto.getBean("miSecretarioEmpleado", SecretarioEmpleado.class);
		
        System.out.println(maria.getTareas());
		
		System.out.println(maria.getInforme());
		
		System.out.println("Email: "+maria.getEmail());
		
		System.out.println(maria.getNombreEmpresa());*/
		
		
		
		contexto.close();
		
		
	}

}
