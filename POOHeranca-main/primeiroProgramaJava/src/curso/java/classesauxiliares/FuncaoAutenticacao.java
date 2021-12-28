package curso.java.classesauxiliares;

import curso.java.interfaces.PermitirAcesso;

/*Realmente e somente receber alguem que tem o contrato
 *  da interface de permitir acesso e chamar o autenticar*/
public class FuncaoAutenticacao {
	
	private PermitirAcesso permitirAcesso;
	
	public boolean autenticar() {
		return permitirAcesso.Autenticar();
	}
	
	public  FuncaoAutenticacao(PermitirAcesso acesso) {
		this.permitirAcesso = acesso;
	}

}
