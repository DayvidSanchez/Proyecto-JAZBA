package pe.isil.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import pe.isil.model.User;
import pe.isil.repository.RepositoryUser;

@Controller
public class UserController {

    @Autowired
    RepositoryUser repositoryUser;

    @GetMapping
    public String UserView(Model model, User user){
        model.addAttribute("user", new User());
        model.addAttribute("users", repositoryUser.findAll());

        return "perfil";
    }
}
