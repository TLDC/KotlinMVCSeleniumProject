package tc.kotlin.mvc.controller

import tc.kotlin.mvc.model.Manos
import tc.kotlin.mvc.service.UploadService
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.stereotype.Controller
import org.springframework.ui.Model
import org.springframework.web.bind.annotation.*
import org.springframework.web.multipart.MultipartFile
import java.util.HashMap

/**
 * Created by thomas.croft on 17/03/2017.
 */

@Controller
@RequestMapping("/")
open class KotlinController {

	@Autowired
	private lateinit var uploadService : UploadService

	@RequestMapping(path = arrayOf("/"), method = arrayOf(RequestMethod.GET))
	fun index() : String {
		return "index"
	}

    @RequestMapping(path = arrayOf("/manosMaker"), method = arrayOf(RequestMethod.GET))
    fun manosMaker(model: Model) : String {
		model.addAttribute("manos", Manos())
        return "form"
    }

	@RequestMapping(path = arrayOf("/fileUploader"), method = arrayOf(RequestMethod.GET))
	fun fileUploader() : String {
		return "upload"
	}

	@RequestMapping(path = arrayOf("/addManos"), method = arrayOf(RequestMethod.POST))
	fun addManos(model: Model, manos: Manos) : String {
		return "summary"
	}

	@RequestMapping(path = arrayOf("/upload"), method = arrayOf(RequestMethod.POST),
			consumes = arrayOf("multipart/form-data"))
	fun upload(@RequestPart("file") file : MultipartFile, model: Model) : String {
		val response = uploadService.uploadImage(file)
		model.addAttribute("response", response)
		return "uploadResponse"
	}

}