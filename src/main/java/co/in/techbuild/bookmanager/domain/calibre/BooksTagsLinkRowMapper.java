package co.in.techbuild.bookmanager.domain.calibre;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.jdbc.core.RowMapper;

public class BooksTagsLinkRowMapper implements RowMapper<BooksTagsLink> {
	public BooksTagsLink mapRow(ResultSet rs, int rowNum) throws SQLException {
		BooksTagsLink booksTagsLink=new BooksTagsLink();
		booksTagsLink.setId(rs.getString("id"));
		booksTagsLink.setBook(rs.getString("book"));
		booksTagsLink.setTag(rs.getString("tag"));
		return booksTagsLink;
	}

}
