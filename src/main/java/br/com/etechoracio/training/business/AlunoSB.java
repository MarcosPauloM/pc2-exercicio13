package br.com.etechoracio.training.business;

import javax.transaction.Transactional;

import org.springframework.stereotype.Service;

import br.com.etechoracio.common.business.BaseSB;
import br.com.etechoracio.training.dao.AlunoDAO;
import br.com.etechoracio.training.model.Aluno;

@Service
public class AlunoSB extends BaseSB {

	private AlunoDAO alunoDAO;

	@Override
	protected void postConstructImpl() {
		alunoDAO = getDAO(AlunoDAO.class);
		// TODO Auto-generated method stub

	}

@Transactional	
	public void save(Aluno aluno) {
		alunoDAO.save(aluno);
	}

}
