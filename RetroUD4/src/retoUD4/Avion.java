package retoUD4;

public class Avion {
	
	protected int idAvion;
	protected String modAvion;
	protected int capAvion;
	protected Piloto piloto;
	
	public Avion(int idAvion, String modAvion, int capAvion, Piloto piloto) {
		this.idAvion = idAvion;
		this.modAvion = modAvion;
		this.capAvion = capAvion;
		this.piloto = piloto;
	}

	public int getIdAvion() {
		return idAvion;
	}

	public void setIdAvion(int idAvion) {
		this.idAvion = idAvion;
	}

	public String getModAvion() {
		return modAvion;
	}

	public void setModAvion(String modAvion) {
		this.modAvion = modAvion;
	}

	public int getCapAvion() {
		return capAvion;
	}

	public void setCapAvion(int capAvion) {
		this.capAvion = capAvion;
	}

	public Piloto getPiloto() {
		return piloto;
	}

	public void setPiloto(Piloto piloto) {
		this.piloto = piloto;
	}
	
	public void mostrarAvion() {
		System.out.println("ID Avión: " + getIdAvion());
		System.out.println("Modelo: " + getModAvion());
		System.out.println("Capacidad: " + getCapAvion());
		System.out.println("Piloto: " + getPiloto().getIdPiloto() + ", " + getPiloto().getNomPiloto() + ", " + getPiloto().getHorasVueloPiloto() + ", "
				 + getPiloto().getRangoPiloto());
	}

}
