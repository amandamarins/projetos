package models;

public class Empresa {
	private Long id;
	private String nome;
	private String nome_fantasia;
	private String cnpj;
	private Integer endereco;
		
	public long getId() { return id; }
	public void setId(long id_end) { this.id = id_end; }
	 
    public String getNome() { return nome; }
    public void setNome(String nome_emp) { this.nome = nome_emp; }
    
    public String getNome_Fantasia() { return nome_fantasia; }
    public void setNome_Fantasia(String nome_fantansia_emp) { this.nome_fantasia = nome_fantansia_emp; }
    
    public String getCnpj() { return cnpj; }
    public void setCnpj(String cnpj_emp) { this.cnpj = cnpj_emp; }
	
    public Integer getEndereco() { return endereco; }
    public void setEndereco(Integer endereco_cli) { this.endereco = endereco_cli; }

}
