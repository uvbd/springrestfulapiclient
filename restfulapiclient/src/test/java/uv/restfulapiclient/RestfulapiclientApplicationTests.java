package uv.restfulapiclient;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.web.client.RestTemplate;

@RunWith(SpringRunner.class)
@SpringBootTest
public class RestfulapiclientApplicationTests {

	@Test
	public void contextLoads() {
	}
	
	@Test
	private static void getConnectionInfoMetadata(){
	    final String uri = "http://localhost:5010/systemInfoResource/getConnectionInfoMetadata";
	     
	    RestTemplate restTemplate = new RestTemplate();
	    String result = restTemplate.getForObject(uri, String.class);
	    System.out.println(result);
	}
	

}
