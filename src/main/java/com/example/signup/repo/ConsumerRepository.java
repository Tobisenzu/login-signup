package com.example.signup.repo;

import com.example.signup.Model.Consumer;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

@Repository
public interface ConsumerRepository extends JpaRepository<Consumer, Integer> {

    @Query(value = "SELECT * FROM consumer WHERE username =:username",nativeQuery = true)
    Consumer findByUsername(String username);
}
