package br.com.ex3.teste;

import javax.ws.rs.GET;
import javax.ws.rs.Path;

//http://localhost:8082/RestExemplo1/rest/helloworld/show=teste
@Path("/ex3")
public class ex3 {
		
	@GET
	@Path("listar/")
	public String listar () {
		Pessoa p= new Pessoa();
		p.setNome("nome");
		p.setIdade(3);
		p.setPeso(4);
		p.setAltura(1);
		
	
	return p;
}
}
