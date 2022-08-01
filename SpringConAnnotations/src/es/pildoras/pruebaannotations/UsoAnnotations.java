package es.pildoras.pruebaannotations;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class UsoAnnotations {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//leer el xml de configuración
		ClassPathXmlApplicationContext contexto = new ClassPathXmlApplicationContext("applicationContext.xml");
		
		// pedir un bean al contenedor
		
		Empleados Antonio = contexto.getBean("comercialExperimentado",Empleados.class);
		
		//Usar el bean
		System.out.println(Antonio.getInforme());
		System.out.println(Antonio.getTareas());
		
		
		//cerrar el contexto
		contexto.close();

	}

}
