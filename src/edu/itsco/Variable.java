package edu.itsco;

public class Variable {
	
	private String id;
	private String typeData;
	private boolean estaIniciada;
	
	public Variable() {}
	
	public Variable(String id, String typeDara) {
		
		this.id=id;
		this.typeData=typeData;
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getTypeData() {
		return typeData;
	}

	public void setTypeData(String typeData) {
		this.typeData = typeData;
	}

	public boolean isEstaIniciada() {
		return estaIniciada;
	}

	public void setEstaIniciada(boolean estaIniciada) {
		this.estaIniciada = estaIniciada;
	}
	@Override
	public boolean equals(Object obj) {
		if(obj instanceof Variable) { 
			Variable v = (Variable) obj;
			return this.id.equals(v.getId());
		
		}
		return false;
	}
}
