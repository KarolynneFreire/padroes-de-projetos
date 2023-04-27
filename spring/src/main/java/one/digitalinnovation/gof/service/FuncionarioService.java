package one.digitalinnovation.gof.service;

import one.digitalinnovation.gof.model.Funcionario;

/**
 * Interface que define o padrão <b>Strategy</b> no domínio de cliente. Com
 * isso, se necessário, podemos ter multiplas implementações dessa mesma
 * interface.
 *  */
public interface FuncionarioService {

	Iterable<Funcionario> buscarTodos();

	Funcionario buscarPorId(Long id);

	void inserir(Funcionario funcionario);

	void atualizar(Long id, Funcionario funcionario);

	void deletar(Long id);

}
