package co.in.techbuild.bookmanager.domain.calibre;

public class BooksAuthorsLink {

	private String id;
	private String book;
	private String author;

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

	public String getAuthor() {
		return author;
	}

	public void setAuthor(String author) {
		this.author = author;
	}

	@Override
	public String toString() {
		return "BooksAuthorsLink [id=" + id + ", book=" + book + ", author=" + author + "]";
	}

}
