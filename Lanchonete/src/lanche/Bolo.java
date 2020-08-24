package lanche;

public class Bolo  extends Lanche{
	String massa;
	String recheio;
	String cobertura;
	private final int tempoPreparo = 10;
	
	private String[] ingredientes = new String[4];
	
	public String getIngredientes() {
		String todos = "";
		for(String ingrediente : ingredientes) {
			if(ingrediente != null) {
				todos += " " + ingrediente;
			}
		}
		return todos;
	}

	public void setIngredientes(String[] ingredientes) {
		this.ingredientes = ingredientes;
	}

	
	
	@Override
	public int calculaTempo(int distancia) {
		return super.calculaTempo(distancia) + tempoPreparo;
	}
	
	
}
