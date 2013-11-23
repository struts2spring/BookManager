package co.in.techbuild.bookmanager.domain.calibre;

public class Authors {

	private String id;
	private String name;
	private String sort;
	private String link;

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

	public String getLink() {
		return link;
	}

	public void setLink(String link) {
		this.link = link;
	}

	@Override
	public String toString() {
		return "Authors [id=" + id + ", name=" + name + ", sort=" + sort + ", link=" + link + "]";
	}

}
