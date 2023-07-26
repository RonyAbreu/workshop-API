package dcx.ufpb.br.workshop.controller;

import dcx.ufpb.br.workshop.entities.User;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value = "/users")
public class UserController {

    @GetMapping
    public ResponseEntity<User> findAll(){
        User user = new User(1l,"Rony","rony@gmail.com","123","spring");
        return ResponseEntity.ok().body(user);
    }
}
