package co.in.techbuild.bookmanager.domain.calibre;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.jdbc.core.RowMapper;

public class LanguagesRowMapper implements RowMapper<Languages> {

	public Languages mapRow(ResultSet rs, int rowNum) throws SQLException {
		Languages languages=new Languages();
		languages.setId(rs.getString("id"));
		languages.setLang_code(rs.getString("lang_code"));
		return languages;
	}

}
