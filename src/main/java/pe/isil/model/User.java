package pe.isil.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import javax.validation.constraints.Email;
import javax.validation.constraints.NotBlank;
import java.util.Set;

@AllArgsConstructor
@NoArgsConstructor
@Data
@Table(name = "tbl_user")
@Entity
public class User {

    @Id
    private Integer dni;

    @Column
    @NotBlank
    private String username;

    @Column
    @NotBlank
    private String lastNameFather;

    @Column
    @NotBlank
    private String lastNameMother;

    @Column(unique = true)
    @Email
    @NotBlank
    private String email;

    private Integer phone;

    @Column
    @NotBlank
    private String password;

    @Transient
    private String passwordConfirm;

    @ManyToMany
    private Set<Role> roles;

}
