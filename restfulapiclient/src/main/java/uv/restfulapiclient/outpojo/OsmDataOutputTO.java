/**
 * 
 */
package uv.restfulapiclient.outpojo;

import java.io.Serializable;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

/**
 * @author A.Islam
 *
 */

@JsonIgnoreProperties(ignoreUnknown = true)
public class OsmDataOutputTO implements Serializable {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	Long gId;
	Long osmId;
	String type;
	String name;
	String geom;
	Double areaSqm;
	Double areaSqkm;
	
	public OsmDataOutputTO() {
		super();
		
	}
	
	public Double getAreaSqm() {
		return areaSqm;
	}
	public void setAreaSqm(Double areaSqm) {
		this.areaSqm = areaSqm;
	}
	public Double getAreaSqkm() {
		return areaSqkm;
	}
	public void setAreaSqkm(Double areaSqkm) {
		this.areaSqkm = areaSqkm;
	}
	public String getGeom() {
		return geom;
	}
	public void setGeom(String geom) {
		this.geom = geom;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public Long getgId() {
		return gId;
	}
	public void setgId(Long gId) {
		this.gId = gId;
	}
	public Long getOsmId() {
		return osmId;
	}
	public void setOsmId(Long osmId) {
		this.osmId = osmId;
	}
	public String getType() {
		return type;
	}
	public void setType(String type) {
		this.type = type;
	}
	@Override
	public String toString() {
		return "OsmDataOutputTO [gId=" + gId + ", osmId=" + osmId + ", type=" + type + ", name=" + name + ", geom="
				+ geom + ", areaSqm=" + areaSqm + ", areaSqkm=" + areaSqkm + "]";
	}
	
	
	
}
