package br.rmo.jba.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import br.rmo.jba.entity.User;

public interface UserRepository extends JpaRepository<User, Integer> {

	User findByName(String name);


}
