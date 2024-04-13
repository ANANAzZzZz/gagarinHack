package org.example.toworkspring.models;

import lombok.Getter;
import lombok.Setter;
import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.userdetails.UserDetails;

import javax.persistence.*;
import javax.validation.constraints.Size;
import java.time.Instant;
import java.util.Collection;

@Getter
@Setter
@Entity
@Table(name = "app_user", schema = "public", indexes = {
        @Index(name = "uk_1j9d9a06i600gd43uu3km82jw", columnList = "email", unique = true),
        @Index(name = "uk_qy0pr4hytr0gl26f74ck0m72b", columnList = "number_phone", unique = true)
})
public class AppUser implements UserDetails {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id", nullable = false)
    private Long id;

    @Column(name = "active")
    private Boolean active;

    @Column(name = "date_of_created")
    private Instant dateOfCreated;

    @Size(max = 255)
    @Column(name = "email")
    private String email;

    @Size(max = 255)
    @Column(name = "name")
    private String name;

    @Size(max = 255)
    @Column(name = "number_phone")
    private String numberPhone;

    @Size(max = 1000)
    @Column(name = "password", length = 1000)
    private String password;

    @Override
    public Collection<? extends GrantedAuthority> getAuthorities() {
        return null;
    }

    @Override
    public String getUsername() {
        return null;
    }

    @Override
    public boolean isAccountNonExpired() {
        return false;
    }

    @Override
    public boolean isAccountNonLocked() {
        return false;
    }

    @Override
    public boolean isCredentialsNonExpired() {
        return false;
    }

    @Override
    public boolean isEnabled() {
        return false;
    }
}