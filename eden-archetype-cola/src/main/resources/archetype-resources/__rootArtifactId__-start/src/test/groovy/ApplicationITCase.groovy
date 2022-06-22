#set( $symbol_pound = '#' )
#set( $symbol_dollar = '$' )
#set( $symbol_escape = '\' )
package ${package}


import org.springframework.beans.factory.annotation.Autowired
import org.springframework.boot.test.context.SpringBootTest
import ${package}.adapter.user.web.UserController
import ${package}.client.user.dto.UserDTO
import org.ylzl.eden.spring.framework.cola.dto.SingleResponse
import org.ylzl.eden.spring.test.redis.EmbeddedRedis
import spock.lang.Shared
import spock.lang.Specification
import spock.lang.Unroll
/**
 * 应用启动集成测试
 */
@SpringBootTest(webEnvironment = SpringBootTest.WebEnvironment.RANDOM_PORT)
class ApplicationITCase extends Specification {

	@Autowired
	private UserController userController;

	@Shared
	private EmbeddedRedis embeddedRedis;

	def setupSpec() {
		embeddedRedis = new EmbeddedRedis()
		embeddedRedis.before()
	}

	def cleanupSpec() {
		embeddedRedis.after()
	}

	@Unroll
	def "get User By Id where id=${symbol_pound}id then expect: ${symbol_pound}expectedResult"() {
		expect:
		userController.getUserById(id) == expectedResult

		where:
		id || expectedResult
		1l || SingleResponse.of(new UserDTO(1l, "admin", "1813986321@qq.com"))
	}
}
