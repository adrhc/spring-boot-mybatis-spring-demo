package ro.go.adrhc.springbootmybatisspringdemo.commands;

import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import ro.go.adrhc.springbootmybatisspringdemo.domain.Person;
import ro.go.adrhc.springbootmybatisspringdemo.infrastructure.PersonRepository;

//@ShellComponent
@RequiredArgsConstructor
@Slf4j
public class CrudCommand {
	private final PersonRepository personRepository;

	//	@ShellMethod("Just do it!")
	public void doIt() {
		log.debug("\nJust do it!");
	}

	//	@ShellMethod("Create Person!")
	public void createPerson(String name) {
		personRepository.save(new Person(null, name));
		log.debug("\nJust do it!");
	}
}
