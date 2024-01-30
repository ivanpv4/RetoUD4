package retoUD4;

public class Entrenamiento extends Avion{
	
	private boolean tieneDobleMando;
	
	public Entrenamiento(int idAvion, String modAvion, int capAvion, Piloto piloto, boolean tieneDobleMando) {
		
		super(idAvion, modAvion, capAvion, piloto);
		
		this.tieneDobleMando = tieneDobleMando;
	}
	
	public boolean getTieneDobleMando() {
		return tieneDobleMando;
	}
	
	public void setTieneDobleMando(boolean tieneDobleMando) {
		this.tieneDobleMando = tieneDobleMando;
	}
	
	public void mostrarAvion() {
		super.mostrarAvion();
		System.out.println("Doble mando: " + (getTieneDobleMando() ? "Sí" : "No"));
	}

}
