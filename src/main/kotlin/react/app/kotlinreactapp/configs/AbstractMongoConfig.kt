//package react.app.kotlinreactapp.configs
//
//import com.mongodb.MongoClient
//import com.mongodb.MongoClientURI
//import org.slf4j.LoggerFactory
//import org.springframework.data.mongodb.MongoDbFactory
//import org.springframework.data.mongodb.core.MongoTemplate
//import org.springframework.data.mongodb.core.SimpleMongoDbFactory
//
//abstract class AbstractMongoConfig(
//	open val host: String,
//	open val database: String,
//	open val password: String,
//	open val username: String,
//	open val authenticationDatabase: String,
//	open val port: Int
//) {
//
//	abstract fun mongoTemplate(): MongoTemplate
//
//	/**
//	 * Method that creates MongoDbFactory Common to both of the MongoDb connections
//	 */
//	fun mongoDbFactory(): MongoDbFactory {
//
//		return if (authenticationDatabase.isNotEmpty()) {
//			// auth connection
//			LOG.info("initialising auth connection")
//			if (host.contains(":")) {
//				LOG.info("cluster mode")
//				val mongo = MongoClient(
//					MongoClientURI(
//						"mongodb://" + username + ":" + password + "@"
//								+ host + "/" + authenticationDatabase
//					)
//				)
//				SimpleMongoDbFactory(mongo, database)
//			} else {
//				LOG.info("single server mode")
//				val mongo = MongoClient(
//					MongoClientURI(
//						"mongodb://" + username + ":" + password + "@"
//								+ host + ":" + port + "/" + authenticationDatabase
//					)
//				)
//				SimpleMongoDbFactory(mongo, database)
//			}
//		} else {
//			LOG.info("initialising anonymous connection to {}", database)
//			SimpleMongoDbFactory(MongoClient(host, port), database)
//		}
//	}
//
//	companion object {
//		private val LOG = LoggerFactory.getLogger(AbstractMongoConfig::class.java)
//	}
//}