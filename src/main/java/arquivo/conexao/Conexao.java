package arquivo.conexao;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public class Conexao {
	
	private EntityManagerFactory enf = Persistence.createEntityManagerFactory("arquivo_jpa");
	private EntityManager en = enf.createEntityManager();
	
	
	public Conexao() {
		super();
	}


	public EntityManagerFactory getEnf() {
		return enf;
	}


	public void setEnf(EntityManagerFactory enf) {
		this.enf = enf;
	}


	public EntityManager getEn() {
		return en;
	}


	public void setEn(EntityManager en) {
		this.en = en;
	}
	
	
	
	

}
