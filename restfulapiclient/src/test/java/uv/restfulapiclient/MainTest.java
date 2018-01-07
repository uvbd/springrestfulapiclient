package uv.restfulapiclient;

import org.springframework.web.client.RestTemplate;

public class MainTest {

	public static void main(String[] args) {
		
		    final String uri = "http://localhost:5010/systemInfoResource/getConnectionInfoMetadata";
		     
		    RestTemplate restTemplate = new RestTemplate();
		    String result = restTemplate.getForObject(uri, String.class);
		    System.out.println(result);
		

	}

}
