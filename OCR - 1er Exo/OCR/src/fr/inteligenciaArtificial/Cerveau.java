package fr.inteligenciaArtificial;

public class Cerveau {
	
	private Multimap savoir;
	
	//TODO
	// Rempir cerveau

	public Cerveau() {
		super();
	}

	public Cerveau(Multimap savoir) {
		super();
		this.savoir = savoir;
	}

	public Multimap getSavoir() {
		return savoir;
	}

	public void setSavoir(Multimap savoir) {
		this.savoir = savoir;
	}
	
	

}
