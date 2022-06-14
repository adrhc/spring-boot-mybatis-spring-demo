package ro.go.adrhc.springbootmybatisspringdemo.util;

import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.shell.boot.JLineShellAutoConfiguration;
import org.springframework.shell.boot.SpringShellAutoConfiguration;
import org.springframework.shell.boot.StandardAPIAutoConfiguration;
import org.springframework.shell.boot.StandardCommandsAutoConfiguration;

@EnableAutoConfiguration(exclude = {
		SpringShellAutoConfiguration.class,
		JLineShellAutoConfiguration.class,
		StandardAPIAutoConfiguration.class,
		StandardCommandsAutoConfiguration.class})
public @interface ExcludeShellAutoConfiguration {
}
