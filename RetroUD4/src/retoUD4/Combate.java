package retoUD4;

public class Combate extends Avion{
	
	private boolean esFurtivo;
	
	public Combate(int idAvion, String modAvion, int capAvion, Piloto piloto, boolean esFurtivo) {
		
		super(idAvion, modAvion, capAvion, piloto);
		
		this.esFurtivo = esFurtivo;
	}
	
	public boolean getEsFurtivo() {
		return esFurtivo;
	}
	
	public void setEsFurtivo(boolean esFurtivo) {
		this.esFurtivo = esFurtivo;
	}
	
	public void mostrarAvion() {
		super.mostrarAvion();
		System.out.println("Furtivo: " + (getEsFurtivo() ? "Sí" : "No"));
	}

}
