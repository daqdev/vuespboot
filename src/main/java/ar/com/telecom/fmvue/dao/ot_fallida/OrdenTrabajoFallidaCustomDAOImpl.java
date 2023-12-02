package ar.com.telecom.fmvue.dao.ot_fallida;


import ar.com.telecom.fmvue.model.OrdenTrabajoFallida;
import ar.com.telecom.fmvue.util.Constante;
import jakarta.persistence.EntityManager;
import jakarta.persistence.PersistenceContext;
import jakarta.persistence.criteria.CriteriaBuilder;
import jakarta.persistence.criteria.CriteriaQuery;
import jakarta.persistence.criteria.Predicate;
import jakarta.persistence.criteria.Root;
import org.springframework.util.StringUtils;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import static ar.com.telecom.fmvue.util.Constante.*;

public class OrdenTrabajoFallidaCustomDAOImpl implements OrdenTrabajoFallidaCustomDAO {

	@PersistenceContext
	EntityManager entityManager;
	
	@Override
	public List<OrdenTrabajoFallida> findByFilters(String nroOT, Date fechaCierreDesde, Date fechaCierreHasta, String mensajeError,
												   String contratista, String excluida) {

		CriteriaBuilder builder = entityManager.getCriteriaBuilder();
		CriteriaQuery<OrdenTrabajoFallida> criteria = builder.createQuery(OrdenTrabajoFallida.class);
		Root<OrdenTrabajoFallida> ordenTrabajoFallida = criteria.from(OrdenTrabajoFallida.class);
		List<Predicate> predicados = new ArrayList<Predicate>();
		if (!StringUtils.hasLength(excluida)) {
			if (excluida.equalsIgnoreCase(N_STR)) {
				Predicate p1 = (builder.equal(builder.upper(ordenTrabajoFallida.get("excluirOt")), N_Char));
				Predicate p2 = (builder.isNull(ordenTrabajoFallida.get("excluirOt")));
				
				predicados.add(builder.or(p1, p2));				
			}else {
				predicados.add(builder.equal(builder.upper(ordenTrabajoFallida.get("excluirOt")), S_Char));
			}
		}

		if(nroOT != null && !nroOT.isEmpty()) {
			predicados.add(builder.equal(builder.upper(ordenTrabajoFallida.get("nroOT")), nroOT.toUpperCase()));
		}

		if(fechaCierreDesde!=null) {
			predicados.add(builder.greaterThanOrEqualTo(ordenTrabajoFallida.get("fechaCierre"), fechaCierreDesde));
			if(fechaCierreHasta!=null) {
				predicados.add(builder.lessThanOrEqualTo(ordenTrabajoFallida.get("fechaCierre"), fechaCierreHasta));
			}
		}
		if(mensajeError != null && !mensajeError.isEmpty()) {
			predicados.add(builder.like(builder.upper(ordenTrabajoFallida.get("mensajeError")), "%"+mensajeError.toUpperCase()+"%"));
		}
		criteria.select(ordenTrabajoFallida);
		criteria.where(builder.and(predicados.toArray(new Predicate[predicados.size()])));
		List<OrdenTrabajoFallida> result = entityManager.createQuery(criteria).getResultList();

		return result;
	}
}