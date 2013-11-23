package co.in.techbuild.bookmanager.domain.calibre;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.jdbc.core.RowMapper;

public class BooksLanguagesLinkRowMapper implements RowMapper<BooksLanguagesLink> {

	public BooksLanguagesLink mapRow(ResultSet rs, int rowNum) throws SQLException {
		BooksLanguagesLink booksLanguagesLink = new BooksLanguagesLink();
		booksLanguagesLink.setId(rs.getString("id"));
		booksLanguagesLink.setBook(rs.getString("book"));
		booksLanguagesLink.setLangCode(rs.getString("lang_code"));
		booksLanguagesLink.setItemOrder(rs.getString("item_order"));
		return booksLanguagesLink;
	}
}
