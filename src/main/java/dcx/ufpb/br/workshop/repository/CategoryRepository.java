package dcx.ufpb.br.workshop.repository;

import dcx.ufpb.br.workshop.entities.Category;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CategoryRepository extends JpaRepository<Category,Long> {
}
