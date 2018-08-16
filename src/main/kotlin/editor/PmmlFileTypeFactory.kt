package editor

import com.intellij.openapi.fileTypes.FileTypeConsumer
import com.intellij.openapi.fileTypes.FileTypeFactory

class PmmlFileTypeFactory : FileTypeFactory() {
    override fun createFileTypes(consumer: FileTypeConsumer) {
        val fileType = consumer.getStandardFileTypeByName("XML")!!
        consumer.consume(fileType, "pmml")
    }
}