import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.json.JSONException;
import org.json.JSONObject;

import com.fasterxml.jackson.databind.ObjectMapper;

import Validators.FLRMValidator;
import VisaType.FLRM;

/**
 * Servlet implementation class DocumentValidator
 */
@WebServlet("/validator")
public class DocumentValidator extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public DocumentValidator() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	@Override
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// 1. get received JSON data from request
        BufferedReader br = new BufferedReader(new InputStreamReader(request.getInputStream()));
        String json = "";
        if(br != null){
            json = br.readLine();
        }
        
        ObjectMapper mapper = new ObjectMapper();
        FLRM flrMarriageVisa = mapper.readValue(json, FLRM.class);
 
        // 2. initiate jackson mapper
 //       ObjectMapper mapper = new ObjectMapper();
 
        // 3. Convert received JSON to Article
 //       FLRM flrMarriageVisa = mapper.readValue(json, FLRM.class);
 
        flrMarriageVisa = FLRMValidator.validate(flrMarriageVisa);
        
        //response.setContentType("application/json");  
       // mapper.writeValue(response.getOutputStream(), flrMarriageVisa);
        
        
        response.setContentType("application/json");
        response.setCharacterEncoding("utf-8");
        PrintWriter out = response.getWriter();

          //create Json Object
          JSONObject jsonVisa = new JSONObject();

            // put some value pairs into the JSON object .
        try {
			jsonVisa.put("isValid", flrMarriageVisa.isValid());
			jsonVisa.put("validationMessage", flrMarriageVisa.getValidationMessage());
		} catch (JSONException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

        // finally output the json string       
        out.append(jsonVisa.toString());
        out.close();
        
        
        
        
//        response.setContentType("text/html");
//        PrintWriter out = response.getWriter();
//        out.append("Your string goes here: " + flrMarriageVisa.getAddressDocumentsTotal());
//        out.close();
        
        
//        // 4. Set response type to JSON
//        response.setContentType("application/json");            
// 
//        // 5. Add article to List<Article>
//        articles.add(article);
// 
//        // 6. Send List<Article> as JSON to client
//        mapper.writeValue(response.getOutputStream(), articles);
	}

}
