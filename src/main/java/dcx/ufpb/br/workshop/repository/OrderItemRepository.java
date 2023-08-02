package dcx.ufpb.br.workshop.repository;

import dcx.ufpb.br.workshop.entities.Category;
import dcx.ufpb.br.workshop.entities.OrderItem;
import org.springframework.data.jpa.repository.JpaRepository;

public interface OrderItemRepository extends JpaRepository<OrderItem,Long> {
}
