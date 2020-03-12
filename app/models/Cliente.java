package models;

public class Cliente {
	private Long id;
	private String nome;
	private String cpf;
	private Integer endereco;
	
	
	public long getId() { return id; }
	public void setId(long id_cli) { this.id = id_cli; }
	 
    public String getNome() { return nome; }
    public void setNome(String nome_cli) { this.nome = nome_cli; }
    
    public String getCpf() { return cpf; }
    public void setCpf(String Cpf_cli) { this.cpf = Cpf_cli; }
    
    public Integer getEndereco() { return endereco; }
    public void setEndereco(Integer endereco_cli) { this.endereco = endereco_cli; }
	
	
}
