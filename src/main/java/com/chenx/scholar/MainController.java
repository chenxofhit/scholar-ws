package com.chenx.scholar;

import java.io.BufferedReader;
import java.io.InputStreamReader;

import org.springframework.context.annotation.Configuration;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.beans.factory.annotation.Value;  


/**
 * 
 * Main Controller
 * 
 * @author chenx<chenxofhit@gmail.com>
 *
 */

@Controller
public class MainController {

	@Value("${scholarpath}") 
	private  String scholarpath;
	
	public String getScholarpath() {
		return scholarpath;
	}

	public void setScholarpath(String scholarpath) {
		this.scholarpath = scholarpath;
	}

	@GetMapping("/index")
    public String index(){
        return "home";
    }
	
	@PostMapping("/query")
	@ResponseBody
	public MyJsonView queryScholar(String topic, String type) {
		
		StringBuilder sBuilder = new StringBuilder();
		MyJsonView jsonView;
		
		try {
//			Process pr = Runtime.getRuntime().exec("python /Users/chenx/Documents/Project/scholar.py/scholar.py -c 1 --author \"albert einstein\" --phrase \"quantum theory\"");
			
			StringBuilder sbBuilder = new StringBuilder("python " + this.getScholarpath() + " -c 1");
			//sbBuilder.append(" -t \\\"" + topic + "\\\"");
			sbBuilder.append(" -A " + "\"" + topic + "\"");
			if(null != type && !type.equalsIgnoreCase("others"))
				sbBuilder.append(" --citation " + type );
			
			String cmd = sbBuilder.toString();
			System.out.println("CMD:" + cmd);

			Process pr = Runtime.getRuntime().exec(cmd);
			
			BufferedReader in = new BufferedReader(new InputStreamReader(pr.getInputStream()));
			String line;
			while ((line = in.readLine()) != null) {
				sBuilder.append(line);
			}
			in.close();
			pr.waitFor();
			System.out.println(sBuilder.toString());
			jsonView = new MyJsonView().successMsg(sBuilder.toString());
			
		} catch (Exception e) {
			e.printStackTrace();
			jsonView = new MyJsonView().failureMsg("Error");
		}
		
		return jsonView;
	}
	
}
