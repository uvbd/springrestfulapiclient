/**
 * 
 */
package uv.restfulapiclient.outpojo;

import java.io.Serializable;
import java.util.Date;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

/**
 * @author A.Riaydh
 *
 */

@JsonIgnoreProperties(ignoreUnknown = true)
public class UvPatchHistoryOutputTO implements Serializable{
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	Long patchOrVersionId;
    Date patchOrVersionBuildDate;
    String patchOrVersionNumber;
    String patchOrVersionDescription;
    
    
    
	public UvPatchHistoryOutputTO() {
		super();
		
	}
	public Long getPatchOrVersionId() {
		return patchOrVersionId;
	}
	public void setPatchOrVersionId(Long patchOrVersionId) {
		this.patchOrVersionId = patchOrVersionId;
	}
	public Date getPatchOrVersionBuildDate() {
		return patchOrVersionBuildDate;
	}
	public void setPatchOrVersionBuildDate(Date patchOrVersionBuildDate) {
		this.patchOrVersionBuildDate = patchOrVersionBuildDate;
	}
	public String getPatchOrVersionNumber() {
		return patchOrVersionNumber;
	}
	public void setPatchOrVersionNumber(String patchOrVersionNumber) {
		this.patchOrVersionNumber = patchOrVersionNumber;
	}
	public String getPatchOrVersionDescription() {
		return patchOrVersionDescription;
	}
	public void setPatchOrVersionDescription(String patchOrVersionDescription) {
		this.patchOrVersionDescription = patchOrVersionDescription;
	}
	@Override
	public String toString() {
		return "UvPatchHistoryOutputTO [patchOrVersionId=" + patchOrVersionId + ", patchOrVersionBuildDate="
				+ patchOrVersionBuildDate + ", patchOrVersionNumber=" + patchOrVersionNumber
				+ ", patchOrVersionDescription=" + patchOrVersionDescription + "]";
	}
    
    
    

}
