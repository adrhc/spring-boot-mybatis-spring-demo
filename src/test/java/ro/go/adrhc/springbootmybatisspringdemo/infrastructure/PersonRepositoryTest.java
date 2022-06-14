package ro.go.adrhc.springbootmybatisspringdemo.infrastructure;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.TestInstance;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.jdbc.AutoConfigureJdbc;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.mock.mockito.MockBean;
import org.springframework.shell.Shell;
import ro.go.adrhc.springbootmybatisspringdemo.domain.Person;
import ro.go.adrhc.springbootmybatisspringdemo.util.ExcludeShellAutoConfiguration;

import static org.assertj.core.api.Assertions.assertThat;

@SpringBootTest
@ExcludeShellAutoConfiguration
@MockBean(classes = {Shell.class})
@TestInstance(TestInstance.Lifecycle.PER_CLASS)
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