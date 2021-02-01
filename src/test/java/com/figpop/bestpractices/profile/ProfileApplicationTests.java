package com.figpop.bestpractices.profile;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.ActiveProfiles;

@SpringBootTest
@ActiveProfiles({"foo", "bar"})
class ProfileApplicationTests {

	@Test
	void contextLoads() {
	}

}
