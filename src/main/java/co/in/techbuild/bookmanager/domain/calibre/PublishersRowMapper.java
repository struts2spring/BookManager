package co.in.techbuild.bookmanager.domain.calibre;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.jdbc.core.RowMapper;

public class PublishersRowMapper implements RowMapper<Publishers> {

	public Publishers mapRow(ResultSet rs, int rowNum) throws SQLException {
		Publishers publishers=new Publishers();
		publishers.setId(rs.getString("id"));
		publishers.setName(rs.getString("name"));
		publishers.setSort(rs.getString("sort"));
		return publishers;
	}
}
