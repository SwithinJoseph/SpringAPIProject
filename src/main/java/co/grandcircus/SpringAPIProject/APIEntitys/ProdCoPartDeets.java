package co.grandcircus.SpringAPIProject.APIEntitys;

public class ProdCoPartDeets {
	private int id;
	private String logo_path;
	private String name;
	private String origin_country;
	
	public ProdCoPartDeets() {}
	
	public ProdCoPartDeets(int id, String logo_path, String name, String origin_country) {
		super();
		this.id = id;
		this.logo_path = logo_path;
		this.name = name;
		this.origin_country = origin_country;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getLogo_path() {
		return logo_path;
	}

	public void setLogo_path(String logo_path) {
		this.logo_path = logo_path;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getOrigin_country() {
		return origin_country;
	}

	public void setOrigin_country(String origin_country) {
		this.origin_country = origin_country;
	}

	@Override
	public String toString() {
		return "ProdCoPartDeets [id=" + id + ", logo_path=" + logo_path + ", name=" + name + ", origin_country="
				+ origin_country + "]";
	}
}
