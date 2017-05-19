package tc.kotlin.mvc.service

import tc.kotlin.mvc.model.UploadResponse
import org.springframework.beans.factory.annotation.Value
import org.springframework.stereotype.Service
import org.springframework.util.FileCopyUtils
import org.springframework.web.multipart.MultipartFile
import java.io.File
import java.util.*

/**
 * Created by thomas.croft on 13/04/2017.
 */
@Service
// Because Kotlin requires class properties
open class UploadService(@Value("\${upload.folder}") private val uploadLocation: String) {

    fun uploadImage(file : MultipartFile) : UploadResponse {
        val contentType = file.contentType
        if (!contentType.startsWith("image/")) {
            return UploadResponse(false, null, "Uploaded file was not an image")
        }
        val extension = "." + file.contentType.split("/")[1]
        val fileName = "/" + UUID.randomUUID() + extension
        val directory = "src/main/webapp/" + uploadLocation
        File(directory).mkdirs()
        FileCopyUtils.copy(file.bytes, File(directory + fileName))
        return UploadResponse(true, uploadLocation + fileName, null)
    }

}