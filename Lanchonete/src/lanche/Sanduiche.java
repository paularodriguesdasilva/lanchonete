package lanche;


public class Sanduiche extends Lanche{
	private final int tempoPreparo = 15;
	private String[] ingredientes = new String[10];
	
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
		return super.calculaTempo(distancia) + this.tempoPreparo;
	}
	



}
