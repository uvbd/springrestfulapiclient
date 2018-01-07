package uv.restfulapiclient.controller;


import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import uv.restfulapiclient.RestfulapiclientApplication;
import uv.restfulapiclient.outpojo.OsmDataOutputTO;
import uv.restfulapiclient.outpojo.UvMetaDataOutTO;
import uv.restfulapiclient.service.OsmDataService;

@Controller
@RequestMapping("/osmData")
public class OsmDataController {
	
private static final Logger logger = LoggerFactory.getLogger(RestfulapiclientApplication.class);
	
@Autowired
private  OsmDataService osmDataService;

  @GetMapping("/connectionInfoMetadata")
  public ModelAndView getConnectionInfoMetadata() {
	
	UvMetaDataOutTO uvMetaDataOutTO =osmDataService.getConnectionInfoMetadata();
	 
    ModelAndView mav = new ModelAndView();
    mav.setViewName("connectionInfoMetadata");
    mav.addObject("uvMetaDataOutTO",  uvMetaDataOutTO);
    return mav;
  }
  
  
  @GetMapping("/osmBuidingInfo")
  public ModelAndView getOsmBuidingInfo() {
	  
   List <OsmDataOutputTO> osmDataOutputTOs =osmDataService.getOsmBuidingInfo();
    logger.info(String.format("Number of record found:%s", osmDataOutputTOs.size()));
    
    ModelAndView mav = new ModelAndView();
    mav.setViewName("osmBuidingInfo");
    mav.addObject("osmDataInputTOs",  osmDataOutputTOs);
    return mav;
  }
  
  
  
	  
	  
}
