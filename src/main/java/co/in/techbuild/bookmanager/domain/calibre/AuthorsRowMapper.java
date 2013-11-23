package co.in.techbuild.bookmanager.domain.calibre;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.jdbc.core.RowMapper;

public class AuthorsRowMapper implements RowMapper<Authors> {

	public Authors mapRow(ResultSet rs, int rowNum) throws SQLException {
		Authors authors=new Authors();
		authors.setId(rs.getString("id"));
		authors.setName(rs.getString("name"));
		authors.setSort(rs.getString("sort"));
		authors.setLink(rs.getString("link"));
		return authors;
	}

}
