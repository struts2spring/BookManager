package co.in.techbuild.bookmanager.dao.calibre;

import java.util.List;
import java.util.Map;

import org.springframework.jdbc.core.simple.ParameterizedBeanPropertyRowMapper;
import org.springframework.jdbc.core.simple.SimpleJdbcDaoSupport;

import co.in.techbuild.bookmanager.domain.calibre.Authors;
import co.in.techbuild.bookmanager.domain.calibre.AuthorsRowMapper;
import co.in.techbuild.bookmanager.domain.calibre.Books;
import co.in.techbuild.bookmanager.domain.calibre.BooksAuthorsLink;
import co.in.techbuild.bookmanager.domain.calibre.BooksAuthorsLinkRowMapper;
import co.in.techbuild.bookmanager.domain.calibre.BooksLanguagesLink;
import co.in.techbuild.bookmanager.domain.calibre.BooksLanguagesLinkRowMapper;
import co.in.techbuild.bookmanager.domain.calibre.BooksPublishersLink;
import co.in.techbuild.bookmanager.domain.calibre.BooksPublishersLinkRowMapper;
import co.in.techbuild.bookmanager.domain.calibre.BooksRowMapper;
import co.in.techbuild.bookmanager.domain.calibre.BooksTagsLink;
import co.in.techbuild.bookmanager.domain.calibre.BooksTagsLinkRowMapper;
import co.in.techbuild.bookmanager.domain.calibre.Languages;
import co.in.techbuild.bookmanager.domain.calibre.LanguagesRowMapper;
import co.in.techbuild.bookmanager.domain.calibre.Publishers;
import co.in.techbuild.bookmanager.domain.calibre.PublishersRowMapper;
import co.in.techbuild.bookmanager.domain.calibre.Tags;
import co.in.techbuild.bookmanager.domain.calibre.TagsRowMapper;

public class BooksDAOImpl extends SimpleJdbcDaoSupport implements BooksDAO {

	// query mutiple rows with manual mapping
	public List<Books> findAll() {

		String sqlBook = "SELECT * FROM Books";
		String sqlAuthor = "SELECT * FROM Authors";
		String sqlBookAuthor = "SELECT * FROM books_authors_link";

		// List<Books> BooksList = new ArrayList<Books>();
		List<Books> booksList = getSimpleJdbcTemplate().query(sqlBook, ParameterizedBeanPropertyRowMapper.newInstance(Books.class));
		List<Authors> authorsList = getSimpleJdbcTemplate().query(sqlAuthor, ParameterizedBeanPropertyRowMapper.newInstance(Authors.class));
		List<BooksAuthorsLink> booksAuthorsList = getSimpleJdbcTemplate().query(sqlBookAuthor,
				ParameterizedBeanPropertyRowMapper.newInstance(BooksAuthorsLink.class));

		Map<String, Object> args = null;
		BooksAuthorsLinkRowMapper booksAuthorsLinkRowMapper = new BooksAuthorsLinkRowMapper();
		List<BooksAuthorsLink> lst = getSimpleJdbcTemplate().query(sqlBookAuthor, booksAuthorsLinkRowMapper, args);

		for (BooksAuthorsLink bal : lst) {
			System.out.println(bal);

		}
		// List<Map<String, Object>> rows = getJdbcTemplate().queryForList(sql);
		// for (Map row : rows) {
		// Books books = new Books();
		//
		// BooksList.add(books);
		// }
		//
		return null;
	}

	public List<Books> findAllBooks() {
		String sqlBook = "SELECT * FROM Books";
		Map<String, Object> args = null;
		BooksRowMapper booksRowMapper = new BooksRowMapper();
		List<Books> books = getSimpleJdbcTemplate().query(sqlBook, booksRowMapper, args);
		return books;
	}

	public List<Authors> findAllAuthors() {
		String sqlAuthor = "SELECT * FROM Authors";
		Map<String, Object> args = null;
		AuthorsRowMapper authorsRowMapper = new AuthorsRowMapper();
		List<Authors> authors = getSimpleJdbcTemplate().query(sqlAuthor, authorsRowMapper, args);
		return authors;
	}

	public List<BooksAuthorsLink> findAllBooksAuthors() {
		String sqlBookAuthor = "SELECT * FROM books_authors_link";
		Map<String, Object> args = null;
		BooksAuthorsLinkRowMapper booksAuthorsLinkRowMapper = new BooksAuthorsLinkRowMapper();
		List<BooksAuthorsLink> booksAuthorsLinks = getSimpleJdbcTemplate().query(sqlBookAuthor, booksAuthorsLinkRowMapper, args);
		return booksAuthorsLinks;
	}

	public List<BooksTagsLink> findAllBooksTags() {
		String sqlBookTag = "SELECT * FROM books_tags_link";
		Map<String, Object> args = null;
		BooksTagsLinkRowMapper booksTagsLinkRowMapper = new BooksTagsLinkRowMapper();
		List<BooksTagsLink> booksTagsLinks = getSimpleJdbcTemplate().query(sqlBookTag, booksTagsLinkRowMapper, args);
		return booksTagsLinks;
	}

	public List<Tags> findAllTags() {
		String sqlTags = "SELECT * FROM tags";
		Map<String, Object> args = null;
		TagsRowMapper tagsRowMapper = new TagsRowMapper();
		List<Tags> tagsList = getSimpleJdbcTemplate().query(sqlTags, tagsRowMapper, args);
		return tagsList;

	}

	public List<Publishers> findAllPublishers() {
		String sqlPublishers = "SELECT * FROM publishers";
		Map<String, Object> args = null;
		PublishersRowMapper publishersRowMapper = new PublishersRowMapper();
		List<Publishers> publishersList = getSimpleJdbcTemplate().query(sqlPublishers, publishersRowMapper, args);
		return publishersList;
	}

	public List<Languages> findAllLanguages() {
		String sqlLanguages = "SELECT * FROM languages";
		Map<String, Object> args = null;
		LanguagesRowMapper languagesRowMapper = new LanguagesRowMapper();
		List<Languages> languagesList = getSimpleJdbcTemplate().query(sqlLanguages, languagesRowMapper, args);
		return languagesList;
	}

	public List<BooksPublishersLink> findAllBooksPublishers() {
		String sqlBooksPublishersLink = "SELECT * FROM books_publishers_link";
		Map<String, Object> args = null;
		BooksPublishersLinkRowMapper booksPublishersLinkRowMapper = new BooksPublishersLinkRowMapper();
		List<BooksPublishersLink> booksPublishersLinks = getSimpleJdbcTemplate().query(sqlBooksPublishersLink, booksPublishersLinkRowMapper, args);
		return booksPublishersLinks;
	}

	public List<BooksLanguagesLink> findAllBooksLanguages() {
		String sqlBooksLanguagesLink = "SELECT * FROM books_languages_link";
		Map<String, Object> args = null;
		BooksLanguagesLinkRowMapper  booksLanguagesLinkRowMapper= new BooksLanguagesLinkRowMapper();
		List<BooksLanguagesLink> booksLanguagesLinks = getSimpleJdbcTemplate().query(sqlBooksLanguagesLink, booksLanguagesLinkRowMapper, args);
		return booksLanguagesLinks;
	}
}
