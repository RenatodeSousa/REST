package br.com.ex2.teste;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;

//http://localhost:8080/RestEx2/rest/restex2/multi=1

	@Path("/restex2")
public class ex2 {

				
		@GET
		@Path("multi={param1}")
		public String multi (@PathParam("param1")int a) {
			String out="";
			for (int i = 1; i <=10; i++) {
			
				
				
				out=out+ String.valueOf(i + " x " + a+ " = " +( a*i)+" ");;			
			}
			
			return out;
			
		}
		
}
