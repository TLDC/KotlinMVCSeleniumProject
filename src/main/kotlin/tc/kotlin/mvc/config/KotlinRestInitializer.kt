package tc.kotlin.mvc.config

import org.springframework.web.servlet.support.AbstractAnnotationConfigDispatcherServletInitializer
import java.util.*
import javax.servlet.MultipartConfigElement
import javax.servlet.ServletRegistration

/**
 * Created by thomas.croft on 16/03/2017.
 */


class KotlinRestInitializer() : AbstractAnnotationConfigDispatcherServletInitializer() {

    private val location : String
    private val maxFileSize : Long
    private val maxRequestSize : Long
    private val fileSizeThreshold : Int

    init {
        //Loading servlet properties
        val properties = Properties()
        val input = Thread.currentThread().contextClassLoader.getResourceAsStream("file-upload.properties")
        properties.load(input)
        location = properties.getProperty("temp.folder")
        maxFileSize = properties.getProperty("max.file.size").toLong()
        maxRequestSize = properties.getProperty("max.request.size").toLong()
        fileSizeThreshold = properties.getProperty("file.size.threshold").toInt()
    }

    override fun getRootConfigClasses(): Array<Class<*>> {
        return arrayOf()
    }

    override fun getServletConfigClasses(): Array<Class<*>> {
        return arrayOf(KotlinConfig::class.java)
    }

    override fun getServletMappings(): Array<String> {
        return arrayOf("/")
    }

    override fun customizeRegistration(registration: ServletRegistration.Dynamic?) {
        registration?.setMultipartConfig(getMultipartConfigElement())
    }

    private fun getMultipartConfigElement() : MultipartConfigElement {
        val multipartConfigElement = MultipartConfigElement(location, maxFileSize, maxRequestSize, fileSizeThreshold)
        return multipartConfigElement
    }

}