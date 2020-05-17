package edu.itsco;

public class SemanticException extends Exception{

	public final static int VARIABLE_NO_DEFINED = 10;
	public final static int VARIABLE_DUPLICATED = 20;
	public final static int VARIABLE_NO_INITIALIZED = 30;
	public final static int TYPES_NO_MATCH = 40;

	public SemanticException(Variable variable, int typeException) {
		super(getMensaje(variable, typeException));
	}
	private static String getMensaje(Variable variable, int typeException) {
		String mensaje ="";
		switch(typeException) { 
		case VARIABLE_NO_DEFINED:
			mensaje = "La variable"+variable.getId()+"no ha sido declarada";
			break;
		case VARIABLE_DUPLICATED:
			mensaje = "La variable"+variable.getId()+"ya fue declarada";
			break;
		case VARIABLE_NO_INITIALIZED:
			mensaje = "La variable"+variable.getId()+"no tiene valor";
			break;
		case TYPES_NO_MATCH:
			mensaje = "El tipo de dato no coinciden con el de la variable"+variable.getId();
			break;
		
		}
		return mensaje;
		
	}
}
