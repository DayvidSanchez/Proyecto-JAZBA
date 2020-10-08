package pe.isil.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import pe.isil.model.User;

@Repository
public interface RepositoryUser extends JpaRepository<User, Integer> {
}
