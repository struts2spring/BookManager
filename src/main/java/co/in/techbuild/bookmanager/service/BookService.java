package co.in.techbuild.bookmanager.service;

import co.in.techbuild.bookmanager.domain.Author;
import co.in.techbuild.bookmanager.domain.Book;
import co.in.techbuild.bookmanager.domain.BookAuthor;
import co.in.techbuild.bookmanager.domain.BookLang;
import co.in.techbuild.bookmanager.domain.BookPublisher;
import co.in.techbuild.bookmanager.domain.BookTag;
import co.in.techbuild.bookmanager.domain.Language;
import co.in.techbuild.bookmanager.domain.Publisher;
import co.in.techbuild.bookmanager.domain.Tag;

public interface BookService {
	public void saveBook(Book book);

	public void saveAuthor(Author author);

	public void saveBookAuthor(BookAuthor bookAuthor);

	public void saveTag(Tag tag);

	public void savePublisher(Publisher publisher);

	public void saveLanguage(Language language);

	public void saveBookTag(BookTag bookTag);

	public void saveBookPublisher(BookPublisher bookPublisher);

	public void saveBookLang(BookLang bookLang);

}
