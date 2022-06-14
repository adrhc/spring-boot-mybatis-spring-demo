package ro.go.adrhc.springbootmybatisspringdemo.domain;

import lombok.AllArgsConstructor;
import lombok.Data;
import org.springframework.data.annotation.Id;

@AllArgsConstructor
@Data
public class Person {
	@Id
	private Integer id;
	private String name;
}
