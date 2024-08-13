package collections_java_api;

import java.util.ArrayList;
import java.util.List;

public class ListaTarefa {
	
	//atributo
	private List<Tarefa> tarefaList ;

	
	
	public ListaTarefa() {
		this.tarefaList = new ArrayList<>();;
	}
	
	
    public void adicionarTarefa(String descricao) {
		tarefaList.add(new Tarefa(descricao));
	}
	
	public void removerTarefa(String descricao) {
		List<Tarefa> tarefasParaRemover = new ArrayList<>();
		
		//percorrendo com for each 
		for(Tarefa t : tarefaList) {
			if(t.getDescricao().equalsIgnoreCase(descricao)) {
				tarefasParaRemover.add(t);
			}
		}
		tarefaList.removeAll(tarefasParaRemover);
	}
	
	public int obterNumeroTotalTarefas() {
		return tarefaList.size();
	}
	
	public void obterDescricoesTarefas() {
		System.out.println(tarefaList);
	}
	

	public static void main(String[] args) {
		
		
		//testando os métodos
		ListaTarefa listaTarefa = new ListaTarefa();
		System.out.println("numero total de tarefas " + listaTarefa.obterNumeroTotalTarefas());
		
		listaTarefa.adicionarTarefa("Fazer as compras");
		listaTarefa.adicionarTarefa("Fazer o almoço");
		listaTarefa.adicionarTarefa("Fazer as compras");
		
		System.out.println("numero total de tarefas " + listaTarefa.obterNumeroTotalTarefas());
		
		listaTarefa.removerTarefa("Fazer o almoço");
		System.out.println("numero total de tarefas " + listaTarefa.obterNumeroTotalTarefas());
		
		listaTarefa.obterDescricoesTarefas();
		
		
	}
	
	
}
