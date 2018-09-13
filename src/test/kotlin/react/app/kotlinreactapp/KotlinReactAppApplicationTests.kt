package react.app.kotlinreactapp

import org.junit.Test
import org.junit.runner.RunWith
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.boot.test.context.SpringBootTest
import org.springframework.test.context.junit4.SpringRunner
import react.app.kotlinreactapp.services.RentalService

@RunWith(SpringRunner::class)
@SpringBootTest
class KotlinReactAppApplicationTests {
	@Autowired
	private lateinit var euclidService: RentalService

	@Test
	fun contextLoads() {
	}

	@Test
	fun `retrieve data from euclid database`() {
		println("oooooooooooooooo======")
		euclidService.initiateDB()
		println(euclidService.getRentals())
	}

}
