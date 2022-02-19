package br.com.alura.rh.service.reajuste;

import java.math.BigDecimal;
import java.util.List;

import br.com.alura.rh.model.Funcionario;

public class ReajusteService {
	
	private List<ValidaReajuste> validacoes;
	
	public ReajusteService(List<ValidaReajuste> validacoes) {
		this.validacoes = validacoes;
	}

	public void reajustarSalarioDoFuncionario(Funcionario funcionario, BigDecimal aumento) {
		
		this.validacoes.forEach(v -> v.validar(funcionario, aumento));

		BigDecimal novoSalario = funcionario.getSalario().add(aumento);
		
		funcionario.atualizarSalario(novoSalario);
	}
	
}
