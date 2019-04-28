package br.edu.ifpb.validator;

import java.util.ArrayList;
import java.util.List;

import javax.faces.application.FacesMessage;
import javax.faces.component.UIComponent;
import javax.faces.context.FacesContext;
import javax.faces.validator.FacesValidator;
import javax.faces.validator.Validator;
import javax.faces.validator.ValidatorException;

import br.edu.ifpb.model.domain.CPF;

@FacesValidator(value="validator.cpf")
public class CPFValidator implements Validator{

	@Override
	public void validate(FacesContext context, UIComponent component, Object value) throws ValidatorException {
		CPF cpf = (CPF) value;
		List<FacesMessage> messages = new ArrayList<>();
		if(cpf.getValor().length()<11 || cpf.getValor().length()>11) {
			messages.add(new FacesMessage("Informe apenas 11 caracteres"));
			throw new ValidatorException(messages);
		}
		
	}

}
