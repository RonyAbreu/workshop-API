package dcx.ufpb.br.workshop.repository;

import dcx.ufpb.br.workshop.entities.Product;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ProductRepository extends JpaRepository<Product,Long> {
}
