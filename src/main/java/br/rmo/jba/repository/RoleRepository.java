package br.rmo.jba.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import br.rmo.jba.entity.Role;

public interface RoleRepository extends JpaRepository<Role, Integer> {

	Role findByName(String name);

}
