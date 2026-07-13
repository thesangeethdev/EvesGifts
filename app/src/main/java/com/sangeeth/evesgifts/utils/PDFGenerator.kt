package com.sangeeth.evesgifts.utils

import android.content.Context
import android.os.Environment
import android.widget.Toast
import androidx.compose.ui.text.intl.Locale
import androidx.core.content.FileProvider
import com.sangeeth.evesgifts.data.SelectedCake
import com.sangeeth.evesgifts.data.SelectedFrame
import com.sangeeth.evesgifts.data.SelectedGifts
import java.io.File
import java.text.SimpleDateFormat
import java.util.*
import java.util.Locale.getDefault

fun PDFGenerator(
    context: Context,
    quotationId: String,
    customerName: String,
    frames: List<SelectedFrame>,
    cakes: List<SelectedCake>,
    gifts: List<SelectedGifts>,
    totalPrice: Double
){

    try {

        val timeStamp = SimpleDateFormat("yyyyMMdd_HHmss", getDefault()).format((Date()))

        val fileName = "Quotation_$timeStamp.pdf"

        val file = File(context.getExternalFilesDir(Environment.DIRECTORY_DOCUMENTS), fileName)

        val fileUri  = FileProvider.getUriForFile(context, "${context.packageName}.fileprovider", file)

//        val writer = Pdd
    }catch (e: Exception){
        e.printStackTrace()
        Toast.makeText(context, "error ${e.message}", Toast.LENGTH_SHORT).show()
    }

}