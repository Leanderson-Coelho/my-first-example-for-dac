package br.edu.ifpb.converter;

import javax.faces.component.UIComponent;
import javax.faces.context.FacesContext;
import javax.faces.convert.Converter;
import javax.faces.convert.FacesConverter;

import br.edu.ifpb.model.domain.CPF;

@FacesConverter(value="converter.cpf")
public class CPFConverter implements Converter {

	@Override
	public Object getAsObject(FacesContext context, UIComponent component, String value) {
		CPF cpf = new CPF(value);
		return cpf;
	}

	@Override
	public String getAsString(FacesContext context, UIComponent component, Object value) {
		CPF cpf = (CPF) value;
		return cpf.getValor();
	}

}
