package react.app.kotlinreactapp.models

import org.springframework.data.annotation.Id
import org.springframework.data.mongodb.core.index.Indexed
import org.springframework.data.mongodb.core.mapping.Document
import org.springframework.data.mongodb.core.mapping.Field

@Document(collection = "rentals")
data class Flat(
	@Id
	@Indexed
	val flatID: String,
	@Indexed
	val floor: Int,
	@Indexed
	val building: String,
	val occupied: Boolean,
	val rentPerWeek: String,
	val tenants: Int = 0
) {
	override fun toString() = "Flat: ${flatID}, on floor: ${floor} in building: ${building} has tenants: ${occupied}.  "
}


