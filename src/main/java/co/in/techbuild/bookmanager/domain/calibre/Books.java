package co.in.techbuild.bookmanager.domain.calibre;

public class Books {

	private String id;
	private String title;
	private String sort;
	private String timestamp;
	private String pubdate;
	private String series_index;
	private String author_sort;
	private String isbn;
	private String lccn;
	private String path;
	private Integer flags;
	private String uuid;
	private Boolean has_cover;
	private String last_modified;

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getSort() {
		return sort;
	}

	public void setSort(String sort) {
		this.sort = sort;
	}

	public String getTimestamp() {
		return timestamp;
	}

	public void setTimestamp(String timestamp) {
		this.timestamp = timestamp;
	}

	public String getPubdate() {
		return pubdate;
	}

	public void setPubdate(String pubdate) {
		this.pubdate = pubdate;
	}

	public String getSeries_index() {
		return series_index;
	}

	public void setSeries_index(String series_index) {
		this.series_index = series_index;
	}

	public String getAuthor_sort() {
		return author_sort;
	}

	public void setAuthor_sort(String author_sort) {
		this.author_sort = author_sort;
	}

	public String getIsbn() {
		return isbn;
	}

	public void setIsbn(String isbn) {
		this.isbn = isbn;
	}

	public String getLccn() {
		return lccn;
	}

	public void setLccn(String lccn) {
		this.lccn = lccn;
	}

	public String getPath() {
		return path;
	}

	public void setPath(String path) {
		this.path = path;
	}

	public Integer getFlags() {
		return flags;
	}

	public void setFlags(Integer flags) {
		this.flags = flags;
	}

	public String getUuid() {
		return uuid;
	}

	public void setUuid(String uuid) {
		this.uuid = uuid;
	}

	public Boolean getHas_cover() {
		return has_cover;
	}

	public void setHas_cover(Boolean has_cover) {
		this.has_cover = has_cover;
	}

	public String getLast_modified() {
		return last_modified;
	}

	public void setLast_modified(String last_modified) {
		this.last_modified = last_modified;
	}

	@Override
	public String toString() {
		return "Books [id=" + id + ", title=" + title + ", sort=" + sort + ", timestamp=" + timestamp + ", pubdate=" + pubdate
				+ ", series_index=" + series_index + ", author_sort=" + author_sort + ", isbn=" + isbn + ", lccn=" + lccn + ", path="
				+ path + ", flags=" + flags + ", uuid=" + uuid + ", has_cover=" + has_cover + ", last_modified=" + last_modified + "]";
	}

}
