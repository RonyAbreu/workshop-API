package dcx.ufpb.br.workshop.repository;

import dcx.ufpb.br.workshop.entities.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User,Long> {

}
