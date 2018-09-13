//package react.app.kotlinreactapp.configs
//
//import com.mongodb.MongoClient
//import org.springframework.beans.factory.annotation.Value
//import org.springframework.context.annotation.Bean
//import org.springframework.context.annotation.Configuration
//import org.springframework.data.mongodb.core.MongoTemplate
//
//@Configuration
// class EuclidMongoConfig {
//
//	@Value("\${spring.data.mongodb.host}")
//	private lateinit var host: String
//	@Value("\${spring.data.mongodb.database}")
//	private lateinit var databaseName: String
//
//	/**
//	 * Implementation of the MongoTemplate factory method
//	 * Mongo template bean for mongodb/euclid
//	 */
//	@Bean(name = ["mongoTemplate"])
//	@Throws(Exception::class)
//	fun euclidTemplate(): MongoTemplate =
//		 MongoTemplate(MongoClient(host), databaseName)
//}