package hello.repository;

import hello.model.Developer;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface DeveloperRepository extends CrudRepository<Developer, Integer> {
    Developer findByNumber(Long number);
}
