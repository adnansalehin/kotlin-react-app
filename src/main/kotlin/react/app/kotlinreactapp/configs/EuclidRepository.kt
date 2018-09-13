package react.app.kotlinreactapp.configs

import org.springframework.data.mongodb.repository.MongoRepository
import org.springframework.data.mongodb.repository.Query
import org.springframework.stereotype.Repository
import react.app.kotlinreactapp.models.Flat

@Repository
interface EuclidRepository: MongoRepository<Flat, String> {

	@Query(value = "{'_id': ?0}", fields = "{'numberl':1}")
	fun findFlat(number: String): Flat?
}