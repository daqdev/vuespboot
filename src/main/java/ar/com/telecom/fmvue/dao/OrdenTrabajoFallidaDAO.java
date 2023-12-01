package ar.com.telecom.fmvue.dao;


import ar.com.telecom.fmvue.model.OrdenTrabajoFallida;
import jakarta.transaction.Transactional;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;

@Transactional
@Repository
public interface OrdenTrabajoFallidaDAO extends JpaRepository<OrdenTrabajoFallida, Long>, OrdenTrabajoFallidaCustomDAO {
	List<OrdenTrabajoFallida> findByIdInAndExcluirOt(List<Long> nroOrdenesTrabajoList, Character excluida);
	List<OrdenTrabajoFallida> findByIdIn(List<Long> nroOrdenesTrabajoList);

	List<OrdenTrabajoFallida> findAll();
	OrdenTrabajoFallida findByNroOT(String nroOT);
	void deleteByNroOTIn(List<String> ordenTrabajoOK);

	List<OrdenTrabajoFallida> findTopByOrderByIdDesc();
	OrdenTrabajoFallida findTopByExcluirOtOrderByIdDesc(Character c);
	List<OrdenTrabajoFallida> findByNroOTIn(List<String>  nroOTs);

	@Query(value = "SELECT COUNT(1) "
			+ "FROM ct_orden_trabajo_fallida otf "
			+ "INNER JOIN ct_empresa emp ON emp.codigo=otf.empresa_codigo "
			+ "INNER JOIN ct_periodo pe ON TRUNC(otf.fecha_cierre) BETWEEN pe.fecha_desde AND pe.fecha_hasta "
			+ "INNER JOIN ct_acta ac ON ac.id_periodo = pe.id_periodo AND ac.id_empresa = emp.id_empresa "
			+ "WHERE ac.nro_acta=:nroActa AND otf.excluir_ot = 'N'", nativeQuery = true)
	Integer findOTFallidasContratistaPeriodo (String nroActa);

}
