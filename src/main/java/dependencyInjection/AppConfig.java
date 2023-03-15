package dependencyInjection;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.util.ArrayList;

@Configuration
public class AppConfig{
    @Bean
    public ArrayList<Library> names(){
        ArrayList <Library> names = new ArrayList<>();
        names.add(new Library("Data Mining"));
        names.add(new Library("Software Engineering"));
        return names;

    }
}
