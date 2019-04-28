package br.edu.ifpb.controller;

import java.io.Serializable;

import javax.annotation.PostConstruct;
import javax.enterprise.context.SessionScoped;
import javax.inject.Named;

import br.edu.ifpb.model.dao.PessoaDao;
import br.edu.ifpb.model.domain.Pessoa;


@SessionScoped
@Named
public class PessoaController implements Serializable{
	
	private PessoaDao service = new PessoaDao();
	
	private Pessoa pessoa = new Pessoa();
	
	@PostConstruct
	public void init() {}
	
	public String salvar() {
		service.salvar(pessoa);
		pessoa = new Pessoa();
		return null;
	}
	
	public String selecionar(Pessoa pessoa) {
		this.pessoa = pessoa;
		System.out.println(this.pessoa);
		return null;
	}
	
	public String editar() {
		service.remover(pessoa);
		service.salvar(pessoa);
		return null;
	}
	
	public String excluir(Pessoa pessoa) {
		service.remover(pessoa);
		return null;
	}

	public Pessoa getPessoa() {
		return pessoa;
	}

	public void setPessoa(Pessoa pessoa) {
		this.pessoa = pessoa;
	}

	public PessoaDao getService() {
		return service;
	}

	public void setService(PessoaDao service) {
		this.service = service;
	}
}
