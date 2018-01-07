/**
 * 
 */
package uv.restfulapiclient.service;

import java.util.List;

import org.springframework.stereotype.Service;

import uv.restfulapiclient.outpojo.OsmDataOutputTO;
import uv.restfulapiclient.outpojo.UvMetaDataOutTO;

/**
 * @author A.Riaydh
 *
 */
@Service
public interface OsmDataService {
	public UvMetaDataOutTO getConnectionInfoMetadata();
	public List<OsmDataOutputTO> getOsmBuidingInfo();
}
