package arquivo.model;



public enum Sexo {
	MASCULINO("masculino"),
	FEMININO("femenino");

	private String sexo;
	
	Sexo(String sexo){
		this.sexo = sexo;
	}

	public String getSexo() {
		return sexo;
	}

	public void setSexo(String sexo) {
		this.sexo = sexo;
	}
	
	
}
