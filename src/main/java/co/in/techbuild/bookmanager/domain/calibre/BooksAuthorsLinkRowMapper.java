package co.in.techbuild.bookmanager.domain.calibre;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.jdbc.core.RowMapper;

public class BooksAuthorsLinkRowMapper implements RowMapper<BooksAuthorsLink> {

	public BooksAuthorsLink mapRow(ResultSet rs, int rowNum) throws SQLException {
		BooksAuthorsLink booksAuthorsLink=new BooksAuthorsLink();
		booksAuthorsLink.setId(rs.getString("id"));
		booksAuthorsLink.setAuthor(rs.getString("author"));
		booksAuthorsLink.setBook(rs.getString("book"));
		return booksAuthorsLink;
	}

}
