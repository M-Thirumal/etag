/**
 * 
 */
package in.thirumal.config;

import javax.servlet.Filter;

import org.springframework.boot.web.servlet.FilterRegistrationBean;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.filter.ShallowEtagHeaderFilter;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

/**
 * @author Thirumal
 *
 */
@Configuration
public class EtagConfig implements WebMvcConfigurer {

	public FilterRegistrationBean<Filter> eTag() {
		final FilterRegistrationBean<Filter> filterRegistrationBean = new FilterRegistrationBean<>();
		filterRegistrationBean.setFilter(etagFilter());
		filterRegistrationBean.addUrlPatterns("/*");
		filterRegistrationBean.setName("ETagFilter");
		filterRegistrationBean.setOrder(1);
		return filterRegistrationBean;
	}

	@Bean("etagFilter")
	public Filter etagFilter() {
		return new ShallowEtagHeaderFilter();
	}
}
