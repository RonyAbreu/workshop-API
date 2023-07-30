package dcx.ufpb.br.workshop.controller;

import dcx.ufpb.br.workshop.entities.Order;
import dcx.ufpb.br.workshop.services.OrderService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping(value = "/orders")
public class OrderController {
    @Autowired
    private OrderService OrderService;

    @GetMapping
    public ResponseEntity<List<Order>> findAll(){
        List<Order> orderList = OrderService.findAll();
        return ResponseEntity.ok().body(orderList);
    }

    @GetMapping(value = "/{id}")
    public ResponseEntity<Order> findByID(@PathVariable Long id){
        Order order = OrderService.findById(id);
        return ResponseEntity.ok().body(order);
    }
}
