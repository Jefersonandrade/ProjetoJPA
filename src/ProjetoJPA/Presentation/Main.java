package ProjetoJPA.Presentation;

import ProjetoJPA.DomainModel.*;
import ProjetoJPA.DataAccess.*;;

public class Main {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		ClientesRepository repo = new ClientesRepository();
		Clientes obj = new Clientes();
		obj.setNome("bl� bl�");
		try {
			repo.Save(obj);
		}
		catch(Exception ex) {
			System.out.println(ex.getMessage());
		}

	}

}
