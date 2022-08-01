package es.pildoras.pruebaannotations;

import org.springframework.beans.factory.DisposableBean;
import org.springframework.beans.factory.InitializingBean;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

//primer bean por clase java
@Component
public class ComercialExperimentado implements Empleados,InitializingBean,DisposableBean {
	
	@Autowired
	@Qualifier("informeFinancieroTrim4") //Bean id que debe utilizar
	private CreacionInformeFinanciero nuevoInforme;
	
	//Para injectar dependencias
	/*@Autowired
	public ComercialExperimentado(CreacionInformeFinanciero nuevoInforme) {
		this.nuevoInforme = nuevoInforme;
	}*/
	
	/*@Autowired
	public void setNuevoInforme(CreacionInformeFinanciero nuevoInforme) {
		this.nuevoInforme = nuevoInforme;
	}*/
	

	@Override
	public String getTareas() {
		// TODO Auto-generated method stub
		return "Vender, vender, vender ";
	}

	

	@Override
	public String getInforme() {
		// TODO Auto-generated method stub
		return nuevoInforme.getInformeFinanciero();
	}



	@Override
	public void destroy() throws Exception {
		// TODO Auto-generated method stub
		System.out.println("Ejecutando tras creación de Bean");
	}



	@Override
	public void afterPropertiesSet() throws Exception {
		// TODO Auto-generated method stub
		System.out.println("Ejecutado antes  de la destrucción del  Bean");
	}

}
