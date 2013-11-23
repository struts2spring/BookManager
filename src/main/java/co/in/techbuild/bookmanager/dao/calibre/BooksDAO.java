package co.in.techbuild.bookmanager.dao.calibre;

import java.util.List;

import co.in.techbuild.bookmanager.domain.calibre.Authors;
import co.in.techbuild.bookmanager.domain.calibre.Books;
import co.in.techbuild.bookmanager.domain.calibre.BooksAuthorsLink;
import co.in.techbuild.bookmanager.domain.calibre.BooksLanguagesLink;
import co.in.techbuild.bookmanager.domain.calibre.BooksPublishersLink;
import co.in.techbuild.bookmanager.domain.calibre.BooksTagsLink;
import co.in.techbuild.bookmanager.domain.calibre.Languages;
import co.in.techbuild.bookmanager.domain.calibre.Publishers;
import co.in.techbuild.bookmanager.domain.calibre.Tags;

public interface BooksDAO {
	public List<Books> findAll();

	public List<Books> findAllBooks();

	public List<Authors> findAllAuthors();

	public List<BooksAuthorsLink> findAllBooksAuthors();

	public List<BooksTagsLink> findAllBooksTags();

	public List<Tags> findAllTags();

	public List<Publishers> findAllPublishers();

	public List<Languages> findAllLanguages();

	public List<BooksPublishersLink> findAllBooksPublishers();

	public List<BooksLanguagesLink> findAllBooksLanguages();

}
