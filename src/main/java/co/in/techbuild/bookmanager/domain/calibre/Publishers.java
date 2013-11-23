package co.in.techbuild.bookmanager.domain.calibre;

public class Publishers {
	private String id;
	private String name;
	private String sort;

	public Publishers() {
	}

	public Publishers(String id, String name, String sort) {
		super();
		this.id = id;
		this.name = name;
		this.sort = sort;
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getSort() {
		return sort;
	}

	public void setSort(String sort) {
		this.sort = sort;
	}

	@Override
	public String toString() {
		return "Publishers [id=" + id + ", name=" + name + ", sort=" + sort + "]";
	}

}
