package models;

public class Endereco {
	private Long id;
	private String rua;
	private Integer numero;
	private String bairro;
	private String cidade;
		
	public long getId() { return id; }
	public void setId(long id_end) { this.id = id_end; }
	 
    public String getRua() { return rua; }
    public void setRua(String rua_end) { this.rua = rua_end; }
    
    public Integer getNumero() { return numero; }
    public void setNumero(Integer numero_end) { this.numero = numero_end; }
    
    public String getBairro() { return bairro; }
    public void setBairro(String bairro_end) { this.bairro = bairro_end; }
	
    public String getCidade() { return cidade; }
    public void setCidade(String cidade_end) { this.cidade = cidade_end; }

}
