package co.in.techbuild.bookmanager.domain.calibre;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.jdbc.core.RowMapper;

public class BooksRowMapper implements RowMapper<Books> {

	public Books mapRow(ResultSet rs, int rowNum) throws SQLException {
		Books books=new Books();
		books.setAuthor_sort(rs.getString("author_sort"));
		books.setFlags(rs.getInt("flags"));
		books.setHas_cover(rs.getBoolean("has_cover"));
		books.setId(rs.getString("id"));
		books.setIsbn(rs.getString("isbn"));
		books.setLast_modified(rs.getString("last_modified"));
		books.setLccn(rs.getString("lccn"));
		books.setPath(rs.getString("path"));
		books.setPubdate(rs.getString("pubdate"));
		books.setSeries_index(rs.getString("series_index"));
		books.setSort(rs.getString("sort"));
		books.setTimestamp(rs.getString("timestamp"));
		books.setTitle(rs.getString("title"));
		books.setUuid(rs.getString("uuid"));
		return books;
	}

}
