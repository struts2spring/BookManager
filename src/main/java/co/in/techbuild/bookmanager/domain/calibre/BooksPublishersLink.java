package co.in.techbuild.bookmanager.domain.calibre;

public class BooksPublishersLink {
	private String id;
	private String book;
	private String publisher;

	public BooksPublishersLink() {
	}

	public BooksPublishersLink(String id, String book, String publisher) {
		super();
		this.id = id;
		this.book = book;
		this.publisher = publisher;
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

	public String getPublisher() {
		return publisher;
	}

	public void setPublisher(String publisher) {
		this.publisher = publisher;
	}

	@Override
	public String toString() {
		return "BooksPublishersLink [id=" + id + ", book=" + book + ", publisher=" + publisher + "]";
	}

}
