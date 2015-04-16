package org.owasp.webgoat.benchmark.testcode;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/BenchmarkTest20536")
public class BenchmarkTest20536 extends HttpServlet {
	
	private static final long serialVersionUID = 1L;
	
	@Override
	public void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		doPost(request, response);
	}

	@Override
	public void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
	
		org.owasp.webgoat.benchmark.helpers.SeparateClassRequest scr = new org.owasp.webgoat.benchmark.helpers.SeparateClassRequest( request );
		String param = scr.getTheValue("foo");

		String bar = doSomething(param);
		
		Object[] obj = { "a", "b" };
		
		response.getWriter().format(bar,obj);
	}  // end doPost
	
	private static String doSomething(String param) throws ServletException, IOException {

		// Chain a bunch of propagators in sequence
		String a31432 = param; //assign
		StringBuilder b31432 = new StringBuilder(a31432);  // stick in stringbuilder
		b31432.append(" SafeStuff"); // append some safe content
		b31432.replace(b31432.length()-"Chars".length(),b31432.length(),"Chars"); //replace some of the end content
		java.util.HashMap<String,Object> map31432 = new java.util.HashMap<String,Object>();
		map31432.put("key31432", b31432.toString()); // put in a collection
		String c31432 = (String)map31432.get("key31432"); // get it back out
		String d31432 = c31432.substring(0,c31432.length()-1); // extract most of it
		String e31432 = new String( new sun.misc.BASE64Decoder().decodeBuffer( 
		    new sun.misc.BASE64Encoder().encode( d31432.getBytes() ) )); // B64 encode and decode it
		String f31432 = e31432.split(" ")[0]; // split it on a space
		org.owasp.webgoat.benchmark.helpers.ThingInterface thing = org.owasp.webgoat.benchmark.helpers.ThingFactory.createThing();
		String g31432 = "barbarians_at_the_gate";  // This is static so this whole flow is 'safe'
		String bar = thing.doSomething(g31432); // reflection
	
		return bar;	
	}
}