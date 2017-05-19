package tc.kotlin.mvc.controller

import tc.kotlin.mvc.model.UploadResponse
import org.springframework.ui.Model
import org.springframework.web.bind.annotation.ControllerAdvice
import org.springframework.web.bind.annotation.ExceptionHandler
import org.springframework.web.bind.annotation.ModelAttribute
import org.springframework.web.multipart.MultipartException
import java.util.*

/**
 * Created by thomas.croft on 20/04/2017.
 */
@ControllerAdvice
open class KotlinControllerAdvice {

    @ExceptionHandler(MultipartException::class)
    fun handleError(e : MultipartException, model : Model) : String {
        val response = UploadResponse(false, null, e.message)
        model.addAttribute("response", response)
        return "uploadResponse"
    }

    @ModelAttribute("ageOptions")
    fun getAgeOptions() : MutableMap<Int,String> {
        var map: MutableMap<Int, String> = HashMap()
        map.set(10, "Under 18")
        map.set(25, "Between 18 and 30")
        map.set(70, "Over 30")
        return map
    }

}