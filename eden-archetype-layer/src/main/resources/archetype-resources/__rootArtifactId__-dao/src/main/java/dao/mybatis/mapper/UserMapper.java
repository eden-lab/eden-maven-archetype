#set( $symbol_pound = '#' )
#set( $symbol_dollar = '$' )
#set( $symbol_escape = '\' )
package ${package}.dao.mybatis.mapper;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import ${package}.api.dto.UserPageQuery;
import ${package}.dao.dataobject.UserDO;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

/**
 * 用户信息表数据库映射
 *
 * @author gyl
 * @since 0.0.1
 */
@Mapper
public interface UserMapper extends BaseMapper<UserDO> {

    /**
     * 查询用户列表
     *
	 * @param query 查询条件
     * @return 数据列表
     */
    List<UserDO> selectPage(UserPageQuery query);
}