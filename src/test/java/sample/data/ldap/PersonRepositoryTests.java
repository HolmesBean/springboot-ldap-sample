package sample.data.ldap;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.ldap.query.LdapQueryBuilder;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@SpringBootTest
public class PersonRepositoryTests {

	@Autowired
	private PersonRepository repository;

	@Test
	public void test() {
		System.out.println(repository.findOne(LdapQueryBuilder.query().where("").is("")));
	}

}
