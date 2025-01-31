package com.anajumartins.webservice.repositories;

import com.anajumartins.webservice.entities.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User, Long> {

}
