package br.edu.ifpb.model.dao;
import java.util.ArrayList;
import java.util.List;

import br.edu.ifpb.model.domain.Pessoa;

public class PessoaDao {
	private List<Pessoa> pessoas = new ArrayList<>();
	
	public void salvar(Pessoa pessoa) {
		pessoas.add(pessoa);
	}
	
	public List<Pessoa> listar() {
		return pessoas;
	}
	
	public void remover(Pessoa pessoa) {
		pessoas.remove(pessoa);
	}
	
	public void editar(Pessoa pessoa) {
		pessoas.remove(pessoa);
		salvar(pessoa);
	}
}
