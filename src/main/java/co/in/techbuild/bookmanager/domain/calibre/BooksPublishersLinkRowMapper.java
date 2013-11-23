package co.in.techbuild.bookmanager.domain.calibre;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.jdbc.core.RowMapper;

public class BooksPublishersLinkRowMapper implements RowMapper<BooksPublishersLink> {

	public BooksPublishersLink mapRow(ResultSet rs, int rowNum) throws SQLException {
		BooksPublishersLink booksPublishersLink = new BooksPublishersLink();
		booksPublishersLink.setId(rs.getString("id"));
		booksPublishersLink.setBook(rs.getString("book"));
		booksPublishersLink.setPublisher(rs.getString("publisher"));
		return booksPublishersLink;
	}

}
