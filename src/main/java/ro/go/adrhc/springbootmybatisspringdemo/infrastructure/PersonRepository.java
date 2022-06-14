package ro.go.adrhc.springbootmybatisspringdemo.infrastructure;

import org.springframework.data.repository.CrudRepository;
import ro.go.adrhc.springbootmybatisspringdemo.domain.Person;

public interface PersonRepository extends CrudRepository<Person, Integer> {
}
