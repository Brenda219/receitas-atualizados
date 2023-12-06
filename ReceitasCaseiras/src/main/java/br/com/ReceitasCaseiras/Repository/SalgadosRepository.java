package br.com.ReceitasCaseiras.Repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import br.com.ReceitasCaseiras.model.SalgadosModel;
	
	@Repository
	public interface SalgadosRepository extends JpaRepository<SalgadosModel, Long>{

	}

