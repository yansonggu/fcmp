package fcmp;
 
import javax.ws.rs.Consumes;
import javax.ws.rs.DELETE;
import javax.ws.rs.FormParam;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.WebApplicationException;
import javax.ws.rs.core.Context;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.MultivaluedMap;
import javax.ws.rs.core.Response;
import javax.ws.rs.core.UriInfo;
import javax.ws.rs.core.Response.ResponseBuilder;

import java.io.*;

@Path("/file")
public class Fcmp {

	@Path("/upLoadContent")
	@POST
	@Consumes(MediaType.APPLICATION_FORM_URLENCODED)
	public void compareFiles(@FormParam("file1") String sfw, @FormParam("file2") String sfn) { 
		String str_sfw="";
		String str_sfn="";
		System.out.println("file contents: "+sfw +"=============================================\n"+sfn);
		FileContentCompare fcp = new FileContentCompare();
		fcp.compare(sfw, sfn);
		str_sfw=fcp.getSFWOnly();
		str_sfn=fcp.getSFNOnly();
		
	}


}
 