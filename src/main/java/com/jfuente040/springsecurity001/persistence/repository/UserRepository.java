package com.jfuente040.springsecurity001.persistence.repository;

import java.util.Optional;

import org.springframework.data.repository.CrudRepository;

import com.jfuente040.springsecurity001.persistence.entity.UserEntity;

public interface UserRepository extends CrudRepository<UserEntity, Long> {

    Optional<UserEntity> findByUsername(String username);

}
