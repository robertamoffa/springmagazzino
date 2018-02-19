package model;

public class Dipendente {
	
	private int id;
	
	private String nome;
	
	private String cognome;
	
	private int eta;
	
	private int idRuolo;
	
	private int idTitolo;

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getCognome() {
		return cognome;
	}

	public void setCognome(String cognome) {
		this.cognome = cognome;
	}

	public int getEta() {
		return eta;
	}

	public void setEta(int eta) {
		this.eta = eta;
	}

	public int getIdRuolo() {
		return idRuolo;
	}

	public void setIdRuolo(int idRuolo) {
		this.idRuolo = idRuolo;
	}

	public int getIdTitolo() {
		return idTitolo;
	}

	public void setIdTitolo(int idTitolo) {
		this.idTitolo = idTitolo;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((cognome == null) ? 0 : cognome.hashCode());
		result = prime * result + eta;
		result = prime * result + id;
		result = prime * result + idRuolo;
		result = prime * result + idTitolo;
		result = prime * result + ((nome == null) ? 0 : nome.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Dipendente other = (Dipendente) obj;
		if (cognome == null) {
			if (other.cognome != null)
				return false;
		} else if (!cognome.equals(other.cognome))
			return false;
		if (eta != other.eta)
			return false;
		if (id != other.id)
			return false;
		if (idRuolo != other.idRuolo)
			return false;
		if (idTitolo != other.idTitolo)
			return false;
		if (nome == null) {
			if (other.nome != null)
				return false;
		} else if (!nome.equals(other.nome))
			return false;
		return true;
	}

	@Override
	public String toString() {
		return "Dipendente [id=" + id + ", nome=" + nome + ", cognome=" + cognome + ", eta=" + eta + ", idRuolo="
				+ idRuolo + ", idTitolo=" + idTitolo + "]";
	}

	public Dipendente() {
	}

	public Dipendente(int id, String nome, String cognome, int eta, int idRuolo, int idTitolo) {
		this.id = id;
		this.nome = nome;
		this.cognome = cognome;
		this.eta = eta;
		this.idRuolo = idRuolo;
		this.idTitolo = idTitolo;
	}
	
	

}
