package react.app.kotlinreactapp.models

import org.springframework.data.annotation.Id
import org.springframework.data.mongodb.core.index.Indexed
import org.springframework.data.mongodb.core.mapping.Document

@Document(collection = "rentals")
data class Flat(
	@Id
	val number: String,
	@Indexed
	val floor: Int,
	@Indexed
	val building: String,
	val occupied: Boolean,
	val rentPerWeek: String,
	val tenants: Int
) {
	override fun toString() = "Flat: ${this.number}, on floor: ${floor} in building: ${building} has tenants: ${occupied}.  "
}


