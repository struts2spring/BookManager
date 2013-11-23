package co.in.techbuild.bookmanager.dao;

import java.util.List;
import java.util.Map;

import javax.sql.DataSource;

import org.springframework.jdbc.core.JdbcTemplate;

public class BooksDao {

    private JdbcTemplate jdbcTemplate;

    public void setDataSource(DataSource dataSource) {
        this.jdbcTemplate = new JdbcTemplate(dataSource);
    }

    public List<Map<String, Object>> getList() {
        return this.jdbcTemplate.queryForList("select * from Books");
    }
    public List<Map<String, Object>> getAllBooks_authors_link() {
    	return this.jdbcTemplate.queryForList("select * from books_authors_link ");
    }
}
