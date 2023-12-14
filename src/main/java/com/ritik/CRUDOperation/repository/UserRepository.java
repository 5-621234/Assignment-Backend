package com.ritik.CRUDOperation.repository;

import com.ritik.CRUDOperation.model.User;
import org.springframework.data.jpa.repository.JpaRepository;
public interface UserRepository extends JpaRepository<User,Long>{

}
