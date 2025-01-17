#set( $symbol_pound = '#' )
#set( $symbol_dollar = '$' )
#set( $symbol_escape = '\' )
/*
 * Copyright 2012-2019 the original author or authors.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *      https://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package org.ylzl.eden.demo

import org.springframework.beans.factory.annotation.Autowired
import org.springframework.boot.test.context.SpringBootTest
import org.ylzl.eden.demo.adapter.user.web.UserController
import org.ylzl.eden.demo.client.user.dto.UserDTO
import org.ylzl.eden.cola.dto.SingleResponse
import spock.lang.Specification
import spock.lang.Unroll

/**
 * 应用启动集成测试
 */
@SpringBootTest(webEnvironment = SpringBootTest.WebEnvironment.RANDOM_PORT)
class ApplicationITCase extends Specification {

	@Autowired
	private UserController userController;

	@Unroll
	def "get User By Id where id=${symbol_pound}id then expect: ${symbol_pound}expectedResult"() {
		expect:
		userController.getUserById(id) == expectedResult

		where:
		id || expectedResult
		1l || SingleResponse.of(new UserDTO(1l, "admin", "1813986321@qq.com"))
	}
}
