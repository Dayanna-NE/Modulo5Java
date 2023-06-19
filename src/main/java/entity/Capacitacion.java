package entity;

public class Capacitacion {
	private int idCapacitacion;
    private String rutEmpresa;
    private String diaCapacitacion;
    private String horaCapacitacion;
    private String lugarCapacitacion;
    private int duracionCapacitacion;
    private int cantidadDeAsistentes;
    
    // <-------------------------------Constructor vacio ----------------------------------->
	public Capacitacion() {
		super();
	}
	
    // <-------------------------------Constructor lleno ----------------------------------->

	public Capacitacion(int idCapacitacion, String rutEmpresa, String diaCapacitacion, String horaCapacitacion,
			String lugarCapacitacion, int duracionCapacitacion, int cantidadDeAsistentes) {
		super();
		this.idCapacitacion = idCapacitacion;
		this.rutEmpresa = rutEmpresa;
		this.diaCapacitacion = diaCapacitacion;
		this.horaCapacitacion = horaCapacitacion;
		this.lugarCapacitacion = lugarCapacitacion;
		this.duracionCapacitacion = duracionCapacitacion;
		this.cantidadDeAsistentes = cantidadDeAsistentes;
	}
	// <-------------------------------Getters and setters ----------------------------------->

	public int getIdCapacitacion() {
		return idCapacitacion;
	}

	public void setIdCapacitacion(int idCapacitacion) {
		this.idCapacitacion = idCapacitacion;
	}

	public String getRutEmpresa() {
		return rutEmpresa;
	}

	public void setRutEmpresa(String rutEmpresa) {
		this.rutEmpresa = rutEmpresa;
	}

	public String getDiaCapacitacion() {
		return diaCapacitacion;
	}

	public void setDiaCapacitacion(String diaCapacitacion) {
		this.diaCapacitacion = diaCapacitacion;
	}

	public String getHoraCapacitacion() {
		return horaCapacitacion;
	}

	public void setHoraCapacitacion(String horaCapacitacion) {
		this.horaCapacitacion = horaCapacitacion;
	}

	public String getLugarCapacitacion() {
		return lugarCapacitacion;
	}

	public void setLugarCapacitacion(String lugarCapacitacion) {
		this.lugarCapacitacion = lugarCapacitacion;
	}

	public int getDuracionCapacitacion() {
		return duracionCapacitacion;
	}

	public void setDuracionCapacitacion(int duracionCapacitacion) {
		this.duracionCapacitacion = duracionCapacitacion;
	}

	public int getCantidadDeAsistentes() {
		return cantidadDeAsistentes;
	}

	public void setCantidadDeAsistentes(int cantidadDeAsistentes) {
		this.cantidadDeAsistentes = cantidadDeAsistentes;
	}
	
	// <-------------------------------To String----------------------------------->

	@Override
	public String toString() {
		return "Capacitacion [idCapacitacion=" + idCapacitacion + ", rutEmpresa=" + rutEmpresa + ", diaCapacitacion="
				+ diaCapacitacion + ", horaCapacitacion=" + horaCapacitacion + ", lugarCapacitacion="
				+ lugarCapacitacion + ", duracionCapacitacion=" + duracionCapacitacion + ", cantidadDeAsistentes="
				+ cantidadDeAsistentes + "]";
	}
}
