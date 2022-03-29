package  com.example.hexacode.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;


import  com.example.hexacode.Entity.Follows;
import  com.example.hexacode.Entity.Interest;

@Repository
public interface IFollowsRepository extends JpaRepository<Follows, Long> {
	@Query("select f.intrestFollowed from Follows f where f.userFollowing.id=:id ")
	List<Interest> getIntrestsByUser(@Param("id") Long id);

}
