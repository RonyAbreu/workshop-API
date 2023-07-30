package dcx.ufpb.br.workshop.repository;

import dcx.ufpb.br.workshop.entities.Order;
import org.springframework.data.jpa.repository.JpaRepository;

public interface OrderRepository extends JpaRepository<Order,Long> {

}
