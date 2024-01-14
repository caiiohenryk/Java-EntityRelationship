package com.firstcrud.userdept;
import org.springframework.data.jpa.repository.JpaRepository;
import com.firstcrud.userdept.entities.User;

public interface UserRepository extends JpaRepository<User, Long> {
    
}
