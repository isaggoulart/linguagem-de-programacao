package school.sptech;

import org.apache.commons.dbcp2.BasicDataSource;
import org.springframework.jdbc.core.JdbcTemplate;

public class DatabaseConfiguration {
    // executor de queries

    private JdbcTemplate template;

    public DatabaseConfiguration() {
        // construtor

        BasicDataSource dataSource = new BasicDataSource();
        dataSource.setDriverClassName("org.h2.Driver");
        dataSource.setUrl("jdbc:h2:file:./banco_teste");
        dataSource.setUsername("sa");
        dataSource.setPassword("");
        this.template = new JdbcTemplate(dataSource);
    }

    // getter
    public JdbcTemplate getTemplate() {
        return template;
    }
}
