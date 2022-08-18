#set( $symbol_pound = '#' )
#set( $symbol_dollar = '$' )
#set( $symbol_escape = '\' )
package ${package}.api;

import org.ylzl.eden.spring.framework.cola.dto.PageResponse;
import org.ylzl.eden.spring.framework.cola.dto.Response;
import org.ylzl.eden.spring.framework.cola.dto.SingleResponse;
import ${package}.api.dto.UserRequestDTO;
import ${package}.api.dto.UserPageQuery;
import ${package}.api.dto.UserResponseDTO;

/**
 * 用户业务逻辑接口
 *
 * @author <a href="mailto:shiyindaxiaojie@gmail.com">gyl</a>
 * @since 2.4.13
 */
public interface UserService {

	/**
	 * 创建用户
	 *
	 * @param dto
	 */
	Response createUser(UserRequestDTO dto);

	/**
	 * 修改用户
	 *
	 * @param id
	 * @param dto
	 */
	Response modifyUser(Long id, UserRequestDTO dto);

	/**
	 * 删除用户
	 *
	 * @param id
	 */
	Response removeUser(Long id);

	/**
	 * 获取用户信息
	 *
	 * @param id
	 * @return
	 */
	SingleResponse<UserResponseDTO> getUserById(Long id);

	/**
	 * 获取用户分页
	 *
	 * @param query
	 * @return
	 */
	PageResponse<UserResponseDTO> listUserByPage(UserPageQuery query);
}
