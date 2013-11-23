package co.in.techbuild.bookmanager.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

import co.in.techbuild.bookmanager.dao.BookDAO;
import co.in.techbuild.bookmanager.domain.Author;
import co.in.techbuild.bookmanager.domain.Book;
import co.in.techbuild.bookmanager.domain.BookAuthor;
import co.in.techbuild.bookmanager.domain.BookLang;
import co.in.techbuild.bookmanager.domain.BookPublisher;
import co.in.techbuild.bookmanager.domain.BookTag;
import co.in.techbuild.bookmanager.domain.Language;
import co.in.techbuild.bookmanager.domain.Publisher;
import co.in.techbuild.bookmanager.domain.Tag;

public class BookServiceImpl implements BookService {

	@Autowired
	BookDAO bookDAO;

	@Transactional
	public void saveBook(Book book) {
		bookDAO.saveBook(book);
	}

	@Transactional
	public void saveAuthor(Author author) {
		bookDAO.saveAuthor(author);

	}

	@Transactional
	public void saveBookAuthor(BookAuthor bookAuthor) {
		bookDAO.saveBookAuthor(bookAuthor);
	}

	@Transactional
	public void saveTag(Tag tag){
		bookDAO.saveTag(tag);
	}

	@Transactional
	public void savePublisher(Publisher publisher){
		bookDAO.savePublisher(publisher);
	}

	@Transactional
	public void saveLanguage(Language language){
		bookDAO.saveLanguage(language);
	}
	@Transactional
	public void saveBookTag(BookTag bookTag){
		bookDAO.saveBookTag(bookTag);
	}

	@Transactional(propagation=Propagation.REQUIRED)
	public void saveBookPublisher(BookPublisher bookPublisher) {
		bookDAO.saveBookPublisher(bookPublisher);
	}

	@Transactional(propagation=Propagation.REQUIRED)
	public void saveBookLang(BookLang bookLang) {
		bookDAO.saveBookLang(bookLang);
		
	}

	
}
