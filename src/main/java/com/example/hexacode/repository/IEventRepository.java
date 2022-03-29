package  com.example.hexacode.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import  com.example.hexacode.Entity.Event;
@Repository
public interface IEventRepository extends JpaRepository<Event, Long> {

}
