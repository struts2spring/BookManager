package co.in.techbuild.bookmanager.domain.calibre;

public class BooksLanguagesLink {
	private String id;
	private String book;
	private String langCode;
	private String itemOrder;

	public BooksLanguagesLink() {
	}

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

	public String getLangCode() {
		return langCode;
	}

	public void setLangCode(String langCode) {
		this.langCode = langCode;
	}

	public String getItemOrder() {
		return itemOrder;
	}

	public void setItemOrder(String itemOrder) {
		this.itemOrder = itemOrder;
	}

	@Override
	public String toString() {
		return "BooksLanguagesLink [id=" + id + ", book=" + book + ", langCode=" + langCode + ", itemOrder=" + itemOrder + "]";
	}

}
