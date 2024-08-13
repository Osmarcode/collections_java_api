package collections_java_api;

public class Tarefa {
	
	private String descricao = " ";
	
	
	// constructor
	public Tarefa(String descricao) {
		super();
		this.descricao = descricao;
	}
	
	public String getDescricao() {
		return descricao;
	}

	@Override
	public String toString() {
		return descricao;
	}
	
	
	
}

	
