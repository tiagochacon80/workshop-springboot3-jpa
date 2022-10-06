package com.tiagochacon.projet.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.tiagochacon.projet.entities.User;

public interface UserRepository extends JpaRepository<User, Long>{

}
