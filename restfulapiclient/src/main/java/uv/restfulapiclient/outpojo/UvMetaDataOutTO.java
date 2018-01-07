/**
 * 
 */
package uv.restfulapiclient.outpojo;

import java.io.Serializable;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

/**
 * @author A.Riaydh
 *
 */


@JsonIgnoreProperties(ignoreUnknown = true)
public class UvMetaDataOutTO implements Serializable{
	
	 /**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private String rootUser;
	 private String postgresVersion;
	 private String postgresVersionDetails;
	 private Long uvVersion;
	 
	public UvMetaDataOutTO() {
			super();
			
		}
		
	public String getRootUser() {
		return rootUser;
	}
	public void setRootUser(String rootUser) {
		this.rootUser = rootUser;
	}
	public String getPostgresVersion() {
		return postgresVersion;
	}
	public void setPostgresVersion(String postgresVersion) {
		this.postgresVersion = postgresVersion;
	}
	public String getPostgresVersionDetails() {
		return postgresVersionDetails;
	}
	public void setPostgresVersionDetails(String postgresVersionDetails) {
		this.postgresVersionDetails = postgresVersionDetails;
	}
	public Long getUvVersion() {
		return uvVersion;
	}
	public void setUvVersion(Long uvVersion) {
		this.uvVersion = uvVersion;
	}

	@Override
	public String toString() {
		return "UvMetaDataOutTO [rootUser=" + rootUser + ", postgresVersion=" + postgresVersion
				+ ", postgresVersionDetails=" + postgresVersionDetails + ", uvVersion=" + uvVersion + "]";
	}
	
	

}
