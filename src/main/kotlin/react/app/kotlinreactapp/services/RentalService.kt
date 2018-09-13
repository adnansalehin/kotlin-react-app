package react.app.kotlinreactapp.services

import org.bson.Document
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.data.mongodb.core.MongoTemplate
import org.springframework.data.mongodb.core.query.Criteria
import org.springframework.data.mongodb.core.query.Query
import org.springframework.stereotype.Service
import react.app.kotlinreactapp.models.Flat

@Service
class RentalService(@Autowired private val euclidTemplate: MongoTemplate) {

	fun initiateDB() {
		val flat = Flat("Fl-101A", 1, "Drebber", true, "£250.00",2)
		euclidTemplate.createCollection("flats")
		euclidTemplate.save(flat, "rentals")
	}

	fun getRentals(): MutableList<Document> =
		euclidTemplate.find(Query(Criteria.where("_id").exists(true)), Document::class.java, "rentals")
}