package co.in.techbuild.bookmanager.dao;

import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import co.in.techbuild.bookmanager.dao.calibre.BooksDAO;
import co.in.techbuild.bookmanager.domain.Author;
import co.in.techbuild.bookmanager.domain.Book;
import co.in.techbuild.bookmanager.domain.BookAuthor;
import co.in.techbuild.bookmanager.domain.BookLang;
import co.in.techbuild.bookmanager.domain.BookPublisher;
import co.in.techbuild.bookmanager.domain.BookTag;
import co.in.techbuild.bookmanager.domain.Language;
import co.in.techbuild.bookmanager.domain.Publisher;
import co.in.techbuild.bookmanager.domain.Tag;
import co.in.techbuild.bookmanager.domain.calibre.Authors;
import co.in.techbuild.bookmanager.domain.calibre.Books;
import co.in.techbuild.bookmanager.domain.calibre.BooksAuthorsLink;
import co.in.techbuild.bookmanager.domain.calibre.BooksLanguagesLink;
import co.in.techbuild.bookmanager.domain.calibre.BooksPublishersLink;
import co.in.techbuild.bookmanager.domain.calibre.BooksTagsLink;
import co.in.techbuild.bookmanager.domain.calibre.Languages;
import co.in.techbuild.bookmanager.domain.calibre.Publishers;
import co.in.techbuild.bookmanager.domain.calibre.Tags;
import co.in.techbuild.bookmanager.service.BookService;

public class Main {

	@Autowired
	private SessionFactory sessionFactory;

	public static void main(String[] args) {
		ApplicationContext context = new ClassPathXmlApplicationContext("/META-INF/spring/app-context.xml");

		BooksDAO booksdao = (BooksDAO) context.getBean("booksDAOImpl");
		BookService bookService = (BookService) context.getBean("bookService");

		try {
			for (Authors authors : booksdao.findAllAuthors()) {
				if (authors.getId() != null) {
					Author author = new Author();
					author.setAuthorId(Long.parseLong(authors.getId()));
					author.setName(authors.getName());
					bookService.saveAuthor(author);
				}
			}
		} catch (Exception ex) {
			ex.printStackTrace();
		}

		for (Books b : booksdao.findAllBooks()) {
			if (b.getId() != null) {
				Book book = new Book();
				book.setBookId(Integer.parseInt(b.getId()));
				book.setIsbn(b.getIsbn());
				book.setPath(b.getPath());
				// book.setPubDate(b.getPubdate());
				book.setUuid(b.getUuid());
				if (b.getHas_cover() != null && b.getHas_cover()) {
					book.setHasCover('Y');
				}
				book.setTitle(b.getTitle());

				bookService.saveBook(book);
			}
		}

		 for (BooksAuthorsLink booksAuthorsLink :
		 booksdao.findAllBooksAuthors()) {
		 BookAuthor bookAuthor = new BookAuthor();
		 bookAuthor.setId(Integer.parseInt(booksAuthorsLink.getId()));
		 Book book = new Book();
		 book.setBookId(Integer.parseInt(booksAuthorsLink.getBook()));
		 bookAuthor.setBook(book);
		 Author author = new Author();
		 author.setAuthorId(Long.parseLong(booksAuthorsLink.getAuthor()));
		 bookAuthor.setAuthor(author);
		 bookService.saveBookAuthor(bookAuthor);
		
		 }
		
		 for (Tags tags : booksdao.findAllTags()) {
		 // System.out.println(tags);
		 Tag tag = new Tag();
		 tag.setId(Integer.parseInt(tags.getId()));
		 tag.setTagName(tags.getName());
		 bookService.saveTag(tag);
		
		 }

		for (Publishers publishers : booksdao.findAllPublishers()) {
			// System.out.println(publishers);
			Publisher publisher = new Publisher();
			publisher.setId(Integer.parseInt(publishers.getId()));
			publisher.setPubName(publishers.getName());

			bookService.savePublisher(publisher);

		}
		 for (Languages languages : booksdao.findAllLanguages()) {
		 // System.out.println(languages);
		 Language language = new Language();
		 language.setId(Integer.parseInt(languages.getId()));
		 language.setLangCode(languages.getLang_code());
		 bookService.saveLanguage(language);
		
		 }

		 for (BooksTagsLink booksTagsLink : booksdao.findAllBooksTags()) {
		 // System.out.println(booksTagsLink);
		 BookTag bookTag = new BookTag();
		 bookTag.setId(Integer.parseInt(booksTagsLink.getId()));
		 Tag tag = new Tag();
		 tag.setId(Integer.parseInt(booksTagsLink.getTag()));
		 bookTag.setTag(tag);
		
		 Book book = new Book();
		 book.setBookId(Integer.parseInt(booksTagsLink.getBook()));
		 bookTag.setBook(book);
		
		 bookService.saveBookTag(bookTag);
		
		 }

		for (BooksPublishersLink booksPublishersLink : booksdao.findAllBooksPublishers()) {
			System.out.println(booksPublishersLink);
			BookPublisher bookPublisher = new BookPublisher();
			bookPublisher.setId(Integer.parseInt(booksPublishersLink.getId()));
			Book book = new Book();
			book.setBookId(Integer.parseInt(booksPublishersLink.getBook()));
			bookPublisher.setBook(book);
			Publisher publisher = new Publisher();
			publisher.setId(Integer.parseInt(booksPublishersLink.getPublisher()));
			bookPublisher.setPublisher(publisher);
			System.out.println(bookPublisher);
			bookService.saveBookPublisher(bookPublisher);

		}
		for (BooksLanguagesLink booksLanguagesLink : booksdao.findAllBooksLanguages()) {

			BookLang bookLang = new BookLang();
			bookLang.setId(Integer.parseInt(booksLanguagesLink.getId()));
			Book book = new Book();
			book.setBookId(Integer.parseInt(booksLanguagesLink.getBook()));
			bookLang.setBook(book);
			Language language = new Language();
			language.setId(Integer.parseInt(booksLanguagesLink.getLangCode()));
			bookLang.setLanguage(language);

			bookService.saveBookLang(bookLang);

		}
	}

}
