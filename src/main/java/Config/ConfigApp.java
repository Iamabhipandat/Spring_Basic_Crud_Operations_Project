package Config;

import db.DatabaseConnection;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan(basePackages = {"Controllers", "Service", "Repository", "db"})
public class ConfigApp {

    @Bean(initMethod = "init", destroyMethod = "Cleanup"  )
    public DatabaseConnection databaseConnection(){
        return new DatabaseConnection();
    }
}
