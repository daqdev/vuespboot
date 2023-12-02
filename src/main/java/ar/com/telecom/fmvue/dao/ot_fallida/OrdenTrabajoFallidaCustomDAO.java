package ar.com.telecom.fmvue.dao.ot_fallida;

import ar.com.telecom.fmvue.model.OrdenTrabajoFallida;
import org.springframework.stereotype.Repository;

import java.util.Date;
import java.util.List;

@Repository
public interface OrdenTrabajoFallidaCustomDAO {
	List<OrdenTrabajoFallida> findByFilters(
			String nroOT, 
			Date fechaCierreDesde, 
			Date fechaCierreHasta, 
			String mensajeError,
			String contratista, 
			String excluida);
}




