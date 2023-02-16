package arquivo.model;

public enum Cargo {
	ADM("adm"),
	GERENTE("gerente"),
	VENDEDOR("vendedor"),
	CONTADOR("contador"),
	SAC("sac"),
	SUPERVISOR_QUALIDADE("supervisor de qualidade");
	
	private String cargo;
	
	Cargo(String cargo){
		this.cargo = cargo;
	}

	public String getCargo() {
		return cargo;
	}

	public String setCargo(String cargo) {
		this.cargo = cargo;
		return cargo;
	}
	
	

}
