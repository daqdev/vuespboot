package ar.com.telecom.fmvue.model;

import ar.com.telecom.fmvue.util.Constante;
import jakarta.persistence.*;
import lombok.Data;

import java.util.Date;

import static ar.com.telecom.fmvue.util.Constante.N_Char;


@Entity
@Data
@Access(AccessType.FIELD)
@Table(name = "CT_ORDEN_TRABAJO_FALLIDA")
public class OrdenTrabajoFallida extends BaseTimeStamp implements BaseObject<Long, String> {

	@Id
	@Column(name = "ID_ORDEN_TRABAJO_FALLIDA", nullable = false)
	@SequenceGenerator(name = "seq_orden_trabajo_fallida", sequenceName = "CTS_ORDEN_TRABAJO_FALLIDA", allocationSize = 1)
	@GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "seq_orden_trabajo_fallida")
	private Long id;

	@Column(name = "NRO_OT")
	private String nroOT;

	@Column(name = "MENSAJE_ERROR")
	private String mensajeError;

	@Column(name = "JSON_MENSAJE")
	private String jsonMensaje;

	@Column(name = "FECHA_CIERRE")
	private Date fechaCierre;

	@Column(name = "EXCLUIR_OT")
	private Character excluirOt= N_Char;

	@Column(name = "USUARIO_CREACION_EXCLUSION")
	private String usuarioExclusion;

	@Column(name = "FECHA_CREACION_EXCLUSION")
	private Date fechaExclusion;
	
	@ManyToOne
	@JoinColumn(name = "ID_MOTIVO")
	private Motivo motivo;

	@Column(name = "NOTA")
	private String nota;

	@Column(name = "USUARIO_CREACION")
	private String usuarioCreacion;

	@Column(name = "USUARIO_ULT_MOD")
	private String usuarioUltMod;

	@Column(name = "PAIS")
	private String pais;
	
	@Column(name = "EMPRESA_CODIGO")
	private String empresaCodigo;

	@Override
	public Long getId() {
		return this.id;
	}

	@Override
	public void setId(Long id) {
		this.id = id;
	}

	@Override
	public String getUsuarioCreacion() {
		return this.usuarioCreacion;
	}

	@Override
	public void setUsuarioCreacion(String usuarioCreacion) {
		this.usuarioCreacion = usuarioCreacion;
	}

	@Override
	public String getUsuarioUltMod() {
		return this.usuarioUltMod;
	}

	@Override
	public void setUsuarioUltMod(String usuarioUltMod) {
		this.usuarioUltMod = usuarioUltMod;
	}
}
