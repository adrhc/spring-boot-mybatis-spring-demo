package ro.go.adrhc.springbootmybatisspringdemo;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.TestInstance;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.mock.mockito.MockBean;
import org.springframework.shell.Shell;
import ro.go.adrhc.springbootmybatisspringdemo.util.ExcludeShellAutoConfiguration;

@SpringBootTest
@ExcludeShellAutoConfiguration
@MockBean(classes = {Shell.class})
@TestInstance(TestInstance.Lifecycle.PER_CLASS)
class SpringBootMybatisSpringDemoApplicationTests {
	@Test
	void contextLoads() {
	}
}
