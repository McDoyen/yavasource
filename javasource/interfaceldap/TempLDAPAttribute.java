package interfaceldap;

public class TempLDAPAttribute {
	private String attributeName;
	private String value;
	private boolean mappable;
	
	public TempLDAPAttribute(String attributeName, String value, boolean mappable){
		this.attributeName = attributeName;
		this.value = value;
		this.mappable = mappable;
	}

	public String getAttributeName() {
		return attributeName;
	}

	public void setAttributeName(String attributeName) {
		this.attributeName = attributeName;
	}

	public String getValue() {
		return value;
	}

	public void setValue(String value) {
		this.value = value;
	}

	public boolean isMappable() {
		return mappable;
	}

	public void setMappable(boolean mappable) {
		this.mappable = mappable;
	}
}
