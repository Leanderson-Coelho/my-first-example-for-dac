package br.edu.ifpb.model.domain;

public class CPF {
	private String valor;
	
	public CPF(String valor) {
		this.valor = valor;
	}
	
	public String formatado() {
        return String.format(
            "%s.%s.%s-%s",
            this.valor.substring(0,3),
            this.valor.substring(3,6),
            this.valor.substring(6,9),
            this.valor.substring(9,11)
        );
    }

	public String getValor() {
		return valor;
	}

	public void setValor(String valor) {
		this.valor = valor;
	}

	@Override
	public String toString() {
		return "CPF [valor=" + valor + "]";
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((valor == null) ? 0 : valor.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		CPF other = (CPF) obj;
		if (valor == null) {
			if (other.valor != null)
				return false;
		} else if (!valor.equals(other.valor))
			return false;
		return true;
	}
}
