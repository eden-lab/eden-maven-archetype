#set( $symbol_pound = '#' )
#set( $symbol_dollar = '$' )
#set( $symbol_escape = '\' )
package ${package}.api.dto;

import org.ylzl.eden.adapter.dto.PageQuery;
import lombok.*;
import lombok.experimental.SuperBuilder;

/**
 * 用户分页查询（数据传输对象）
 *
 * @author gyl
 * @since 2.4.x
 */
@NoArgsConstructor // 扩展的时候需要重新定义无参构造
@AllArgsConstructor
@SuperBuilder
@EqualsAndHashCode(callSuper = true)
@ToString(callSuper = true)
@Data
public class UserPageQuery extends PageQuery {

	private String userName;
}
