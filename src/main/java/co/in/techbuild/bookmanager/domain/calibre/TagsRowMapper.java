package co.in.techbuild.bookmanager.domain.calibre;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.jdbc.core.RowMapper;

public class TagsRowMapper implements RowMapper<Tags> {

	public Tags mapRow(ResultSet rs, int rowNum) throws SQLException {
		Tags tags=new Tags();
		tags.setId(rs.getString("id"));
		tags.setName(rs.getString("name"));
		return tags;
	}
}
