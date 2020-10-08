package pe.isil.service;

import pe.isil.model.User;

import java.util.List;

public interface IServiceUser {

    void save(User user);
    void update(User user);
    void delete(User user);

    List<User> getAll();
    User getById(Integer dni);

}
