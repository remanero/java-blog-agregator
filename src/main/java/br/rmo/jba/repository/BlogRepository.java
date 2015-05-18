package br.rmo.jba.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import br.rmo.jba.entity.Blog;
import br.rmo.jba.entity.User;

public interface BlogRepository extends JpaRepository<Blog, Integer> {

	List<Blog> findByUser(User user);
	
}
