package co.in.techbuild.bookmanager.domain.calibre;

public class BooksTagsLink {
	private String id;
	private String book;
	private String tag;

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getBook() {
		return book;
	}

	public void setBook(String book) {
		this.book = book;
	}

	public String getTag() {
		return tag;
	}

	public void setTag(String tag) {
		this.tag = tag;
	}

	@Override
	public String toString() {
		return "BooksTagsLink [id=" + id + ", book=" + book + ", tag=" + tag + "]";
	}

}
