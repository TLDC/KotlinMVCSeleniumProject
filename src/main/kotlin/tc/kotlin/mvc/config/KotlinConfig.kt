package tc.kotlin.mvc.config

import org.springframework.context.annotation.Bean
import org.springframework.context.annotation.ComponentScan
import org.springframework.context.annotation.Configuration
import org.springframework.context.annotation.PropertySource
import org.springframework.context.support.PropertySourcesPlaceholderConfigurer
import org.springframework.web.multipart.MultipartResolver
import org.springframework.web.multipart.support.StandardServletMultipartResolver
import org.springframework.web.servlet.ViewResolver
import org.springframework.web.servlet.config.annotation.DefaultServletHandlerConfigurer
import org.springframework.web.servlet.config.annotation.EnableWebMvc
import org.springframework.web.servlet.config.annotation.WebMvcConfigurerAdapter
import org.springframework.web.servlet.view.InternalResourceViewResolver
import org.springframework.web.servlet.view.JstlView
import org.springframework.web.servlet.config.annotation.ResourceHandlerRegistry;

/**
 * Created by thomas.croft on 17/03/2017.
 */

@Configuration
@EnableWebMvc
@ComponentScan(basePackages = arrayOf("net.targetgroup.kotlin", "net.targetgroup.selenium"))
@PropertySource("classpath:file-upload.properties")
open class KotlinConfig : WebMvcConfigurerAdapter() {

    companion object {
        @Bean
        open fun placeholderConfigurer(): PropertySourcesPlaceholderConfigurer {
            val configurer = PropertySourcesPlaceholderConfigurer()
            configurer.setIgnoreUnresolvablePlaceholders(true)
            return configurer
        }
    }

    @Bean
    open fun viewResolver(): ViewResolver {
        val viewResolver = InternalResourceViewResolver()
        viewResolver.setViewClass(JstlView::class.java)
        viewResolver.setPrefix("/WEB-INF/views/")
        viewResolver.setSuffix(".jsp")
        return viewResolver
    }

    @Bean
    open fun multipartResolver(): MultipartResolver {
        return StandardServletMultipartResolver()
    }

    override fun configureDefaultServletHandling(configurer: DefaultServletHandlerConfigurer?) {
        configurer?.enable()
    }

    override fun addResourceHandlers(registry: ResourceHandlerRegistry) {
        registry.addResourceHandler("/resources/**").addResourceLocations("/resources/")
    }

}
