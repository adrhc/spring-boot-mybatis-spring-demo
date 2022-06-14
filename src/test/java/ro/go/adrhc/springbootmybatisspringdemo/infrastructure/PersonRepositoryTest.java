package ro.go.adrhc.springbootmybatisspringdemo.infrastructure;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.jdbc.AutoConfigureJdbc;
import org.springframework.boot.test.context.SpringBootTest;
import ro.go.adrhc.springbootmybatisspringdemo.config.ApplicationConfig;
import ro.go.adrhc.springbootmybatisspringdemo.domain.Person;
import ro.go.adrhc.springbootmybatisspringdemo.util.ExcludeShellAutoConfiguration;

import static org.assertj.core.api.Assertions.assertThat;

@SpringBootTest(classes = ApplicationConfig.class)
@ExcludeShellAutoConfiguration
@AutoConfigureJdbc
class PersonRepositoryTest {
	@Autowired
	PersonRepository repository;

	@Test
	void save() {
		Person person = repository.save(new Person(null, "person1"));
		assertThat(person.getId()).isNotNull();
	}
}