package com.nexim.nexim.model;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.data.jpa.repository.Query;

import javax.persistence.*;
import javax.validation.constraints.*;
import java.time.LocalDate;
import java.util.HashSet;
import java.util.Set;
@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(name = "users")

public class Users {
    @Id
    @GeneratedValue(strategy=GenerationType.IDENTITY)
    private Long userId;
    private String fullname;
    @NotNull(message = "username cannot be null")
    @NotBlank(message = "username cannot be empty")
    @Column(unique = true)
    private String username;
    @NotNull(message = "password cannot be null")
    @NotBlank(message = "password cannot be empty")
    @Column(unique = true)
    private String password;
    @ManyToMany(fetch = FetchType.LAZY)
    @JoinTable(name = "user_roles",
        joinColumns = @JoinColumn(name = "user_id"),
        inverseJoinColumns = @JoinColumn(name = "role_id"))
    private Set<Role> roles = new HashSet<>();
      private LocalDate createdDate;



    public Users(String fullname, String username, String password) {
        this.fullname = fullname;
        this.username = username;
        this.password = password;

    }
}
