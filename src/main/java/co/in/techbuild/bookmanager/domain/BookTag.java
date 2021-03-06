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
 * BookTag generated by hbm2java
 */
@Entity
@Table(name = "BOOK_TAG", schema = "PUBLIC", catalog = "TEST")
public class BookTag implements java.io.Serializable {

	private int id;
	private Book book;
	private Tag tag;

	public BookTag() {
	}

	public BookTag(int id) {
		this.id = id;
	}

	public BookTag(int id, Book book, Tag tag) {
		this.id = id;
		this.book = book;
		this.tag = tag;
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
	@JoinColumn(name = "BOOK_ID")
	public Book getBook() {
		return this.book;
	}

	public void setBook(Book book) {
		this.book = book;
	}

	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "TAG_ID")
	public Tag getTag() {
		return this.tag;
	}

	public void setTag(Tag tag) {
		this.tag = tag;
	}

}
