package co.in.techbuild.bookmanager.dao;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;

import co.in.techbuild.bookmanager.domain.Author;
import co.in.techbuild.bookmanager.domain.Book;
import co.in.techbuild.bookmanager.domain.BookAuthor;
import co.in.techbuild.bookmanager.domain.BookLang;
import co.in.techbuild.bookmanager.domain.BookPublisher;
import co.in.techbuild.bookmanager.domain.BookTag;
import co.in.techbuild.bookmanager.domain.Language;
import co.in.techbuild.bookmanager.domain.Publisher;
import co.in.techbuild.bookmanager.domain.Tag;

public class BookDAOImpl implements BookDAO {

	@Autowired
	private SessionFactory sessionFactory;

	public void saveBook(Book book) {
		Session session = sessionFactory.getCurrentSession();
		session.merge(book);
	}

	public void saveAuthor(Author author) {
		Session session = sessionFactory.getCurrentSession();
		session.merge(author);
	}

	public void saveBookAuthor(BookAuthor bookAuthor) {
		Session session = sessionFactory.getCurrentSession();
		session.merge(bookAuthor);
	}

	public void saveTag(Tag tag) {
		Session session = sessionFactory.getCurrentSession();
		session.merge(tag);

	}

	public void savePublisher(Publisher publisher) {
		Session session = sessionFactory.getCurrentSession();
		session.merge(publisher);

	}

	public void saveLanguage(Language language) {
		Session session = sessionFactory.getCurrentSession();
		session.merge(language);

	}

	public void saveBookTag(BookTag bookTag) {
		Session session = sessionFactory.getCurrentSession();
		session.merge(bookTag);
	}

	public void saveBookPublisher(BookPublisher bookPublisher) {
		Session session = sessionFactory.getCurrentSession();
		session.merge(bookPublisher);
		
	}

	public void saveBookLang(BookLang bookLang) {
		Session session = sessionFactory.getCurrentSession();
		session.merge(bookLang);
		
	}
}
