package ar.com.telecom.fmvue.model;


import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "CT_MOTIVO")
public class Motivo {

	@Id
	@Column(name = "ID_MOTIVO", nullable = false)
	private Long motivoId;
	
	@Column(name = "NOMBRE")
	private String nombre;
	
	@Column(name = "VISIBLE")
	private Character visible;
	
	@Column(name = "NOMBRE_CORTO")
	private String nombreCorto;
	
	@Column(name = "ACTIVO")
	private Character activo;

	@Column(name = "MARCA_MANUAL")
	private Character marcaManualConfig;

	public Long getMotivoId() {
		return motivoId;
	}

	public void setMotivoId(Long motivoId) {
		this.motivoId = motivoId;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public Character getActivo() {
		return activo;
	}

	public void setActivo(Character activo) {
		this.activo = activo;
	}

	public String getNombreCorto() {
		return nombreCorto;
	}

	public void setNombreCorto(String nombreCorto) {
		this.nombreCorto = nombreCorto;
	}

	public Character getVisible() {
		return visible;
	}

	public void setVisible(Character visible) {
		this.visible = visible;
	}

	public Character getMarcaManualConfig() {
		return marcaManualConfig;
	}

	public void setMarcaManualConfig(Character marcaManualConfig) {
		this.marcaManualConfig = marcaManualConfig;
	}
}
