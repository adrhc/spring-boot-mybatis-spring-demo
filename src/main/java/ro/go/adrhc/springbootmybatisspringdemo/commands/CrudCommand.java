package ro.go.adrhc.springbootmybatisspringdemo.commands;

import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.shell.standard.ShellComponent;
import org.springframework.shell.standard.ShellMethod;

@ShellComponent
@RequiredArgsConstructor
@Slf4j
public class CrudCommand {
	@ShellMethod("Just do it!")
	public void doIt() {
		log.debug("\nJust do it!");
	}
}
