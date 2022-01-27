#set( $symbol_pound = '#' )
#set( $symbol_dollar = '$' )
#set( $symbol_escape = '\' )
package ${package};

import org.ylzl.eden.spring.framework.util.SpringProfileUtils;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.boot.web.servlet.support.SpringBootServletInitializer;

/**
 * J2EE 加载器
 *
 * @author gyl
 * @since 2.4.x
 */
public class ApplicationWebXml extends SpringBootServletInitializer {

	@Override
	protected SpringApplicationBuilder configure(SpringApplicationBuilder builder) {
		SpringProfileUtils.addDefaultProfile(builder.application());
		return builder.sources(Application.class);
	}
}