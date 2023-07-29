package dcx.ufpb.br.workshop.config;

import dcx.ufpb.br.workshop.entities.User;
import dcx.ufpb.br.workshop.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Profile;

import java.util.Arrays;

@Configuration
@Profile("test")
public class TestConfig implements CommandLineRunner {
    @Autowired
    private UserRepository userRepository;

    @Override
    public void run(String... args) throws Exception {
        User u1 = new User(null,"Rony","rony@gmail.com","123","000");
        User u2 = new User(null,"Ray","ray@gmail.com","222","111");

        userRepository.saveAll(Arrays.asList(u1,u2));
    }
}
