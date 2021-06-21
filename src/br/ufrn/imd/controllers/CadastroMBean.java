package br.ufrn.imd.controllers; 
  
import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;

import br.ufrn.imd.dominio.Tarefa;
import com.postgresdb.App;
 
/**
 * Managed Bean para cadastrar uma tarefa
 * @author João Pedro Fonseca Dantas
 */
@ManagedBean 
@SessionScoped 
public class CadastroMBean {
 
	Tarefa tarefa;
	
	public CadastroMBean() { 
		tarefa = new Tarefa(); 
	} 
	  
	public Tarefa getTarefa() { 
		return tarefa; 
	} 
	  
	public void setTarefa(Tarefa tarefa) { 
		this.tarefa = tarefa; 
	} 
	  
	/** 
	 * @brief Método para realizar um cadastro
	 * @return String "/sucesso.jsf"
	 */
	public String cadastrar() {
		return "/sucesso.jsf"; 
	}
}