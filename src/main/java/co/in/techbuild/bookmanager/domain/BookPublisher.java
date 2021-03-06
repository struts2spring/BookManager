package co.in.techbuild.bookmanager.domain;

// Generated 19 Nov, 2013 9:54:39 AM by Hibernate Tools 3.4.0.CR1

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

/**
 * BookPublisher generated by hbm2java
 */
@Entity
@Table(name = "BOOK_PUBLISHER", schema = "PUBLIC", catalog = "TEST")
public class BookPublisher implements java.io.Serializable {

	private int id;
	private Publisher publisher;
	private Book book;

	public BookPublisher() {
	}

	public BookPublisher(int id) {
		this.id = id;
	}

	public BookPublisher(int id, Publisher publisher, Book book) {
		this.id = id;
		this.publisher = publisher;
		this.book = book;
	}

	@Id
	@Column(name = "ID", unique = true, nullable = false)
	public int getId() {
		return this.id;
	}

	public void setId(int id) {
		this.id = id;
	}

	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "PUB_ID")
	public Publisher getPublisher() {
		return this.publisher;
	}

	public void setPublisher(Publisher publisher) {
		this.publisher = publisher;
	}

	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "BOOK_ID")
	public Book getBook() {
		return this.book;
	}

	public void setBook(Book book) {
		this.book = book;
	}

	@Override
	public String toString() {
		return "BookPublisher [id=" + id + ", publisher=" + publisher + ", book=" + book + "]";
	}

}
