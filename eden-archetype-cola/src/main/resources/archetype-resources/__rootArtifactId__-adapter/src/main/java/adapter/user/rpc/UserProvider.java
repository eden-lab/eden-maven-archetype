#set( $symbol_pound = '#' )
#set( $symbol_dollar = '$' )
#set( $symbol_escape = '\' )
package ${package}.adapter.user.rpc;

import ${package}.adapter.constant.ApiConstant;
import ${package}.app.user.executor.command.UserAddCmdExe;
import ${package}.app.user.executor.command.UserModifyCmdExe;
import ${package}.app.user.executor.command.UserRemoveCmdExe;
import ${package}.app.user.executor.query.UserByIdQryExe;
import ${package}.app.user.executor.query.UserListByPageQryExe;
import ${package}.app.user.service.UserServiceImpl;
import ${package}.client.user.api.UserService;
import lombok.extern.slf4j.Slf4j;
import org.apache.dubbo.config.annotation.DubboService;

/**
 * 用户领域 RPC服务端
 *
 * @author gyl
 * @since 2.4.x
 */
@DubboService(timeout = ApiConstant.DEFAULT_TIMEOUT)
@Slf4j
public class UserProvider extends UserServiceImpl implements UserService {

	public UserProvider(UserAddCmdExe userAddCmdExe, UserModifyCmdExe userModifyCmdExe, UserRemoveCmdExe userRemoveCmdExe, UserByIdQryExe userByIdQryExe, UserListByPageQryExe userListByPageQryExe) {
		super(userAddCmdExe, userModifyCmdExe, userRemoveCmdExe, userByIdQryExe, userListByPageQryExe);
	}
}