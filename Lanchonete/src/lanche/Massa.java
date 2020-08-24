package lanche;

public class Massa extends Lanche {
	private String molho;
	
	private String pizza;
	private String lasanha;
	private final int tempoPreparo = 30;

	private String[] ingredientes = new String[4];

	public String getIngredientes() {
		String todos = "";
		for (String ingrediente : ingredientes) {
			if (ingrediente != null) {
				todos += " " + ingrediente;
			}
		}
		return todos;
	}

	public String getMolho() {
		return molho;
	}

	public void setMolho(String molho) {
		this.molho = molho;
	}



	public String getPizza() {
		return pizza;
	}

	public void setPizza(String pizza) {
		this.pizza = pizza;
	}

	public String getLasanha() {
		return lasanha;
	}

	public void setLasanha(String lasanha) {
		this.lasanha = lasanha;
	}

	public void setIngredientes(String[] ingredientes) {
		this.ingredientes = ingredientes;
	}

	@Override
	public int calculaTempo(int distancia) {
		return super.calculaTempo(distancia) + tempoPreparo;
	}

}
