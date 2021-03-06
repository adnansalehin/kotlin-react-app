package react.app.kotlinreactapp.controllers

import org.bson.Document
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.RestController
import react.app.kotlinreactapp.services.RentalService

@RestController
class RentalController(@Autowired private val rentalService: RentalService) {

	@GetMapping(path = ["hello"])
	fun greet() = "The time is: "

	@GetMapping(path = ["flats"])
	fun getFlats(): MutableList<Document> {
//		rentalService.initiateDB()
		return rentalService.getRentals()
	}
}