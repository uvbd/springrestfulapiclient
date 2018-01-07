/**
 * 
 */
package uv.restfulapiclient.serviceimpl;

import java.util.Arrays;
import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;
import org.springframework.web.servlet.ModelAndView;

import uv.restfulapiclient.RestfulapiclientApplication;
import uv.restfulapiclient.outpojo.OsmDataOutputTO;
import uv.restfulapiclient.outpojo.UvMetaDataOutTO;
import uv.restfulapiclient.service.OsmDataService;

/**
 * @author A.Riaydh
 *
 */
@Service
public class OsmDataServiceImpl implements OsmDataService {
	private static final Logger logger = LoggerFactory.getLogger(OsmDataServiceImpl.class);
	
	private  RestTemplate restTemplate;
	
	@Autowired
	public OsmDataServiceImpl(RestTemplate restTemplate) {
		this.restTemplate=restTemplate;
	}
    /**
     * 
     */
	public UvMetaDataOutTO getConnectionInfoMetadata() {
		  
	   final String uri = "http://localhost:5010/systemInfoResource/getConnectionInfoMetadata";
		UvMetaDataOutTO uvMetaDataOutTO = restTemplate.getForObject(uri, UvMetaDataOutTO.class);
	    return uvMetaDataOutTO;
	  }
	
	/**
	 * 
	 */
	public List<OsmDataOutputTO> getOsmBuidingInfo() {
		  
		final String uri = "http://localhost:5010/osmDataResource/getOsmBuidingInfo?osmDataInputTO={}";
		  
	    OsmDataOutputTO[] osmDataOutputTOs = restTemplate.getForObject(uri, OsmDataOutputTO[].class);
	    logger.info(String.format("Number of record found:%s", osmDataOutputTOs.length));
	    
	    return  Arrays.asList(osmDataOutputTOs);
	  }
	

}
