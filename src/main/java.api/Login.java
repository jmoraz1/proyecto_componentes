package java.api;

import javax.ws.rs.*;
@Path ("login")
public class Login {
	@GET
	@PRODUCES("application/xml")
	
	public String requestLogin() {
		StringBuilder sb = new StringBuilder();
		sb.append("<note>");
		sb.append("<to>Guest</to>");
		sb.append("<from>Admin</from>");
		sb.append("<body>Please login</body>");
		sb.append("</note>");
		
		return sb.toString();
		
	}
}
