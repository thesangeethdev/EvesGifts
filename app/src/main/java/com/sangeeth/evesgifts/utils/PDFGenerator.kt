package com.sangeeth.evesgifts.utils

import android.content.Context
import android.graphics.pdf.PdfDocument
import android.os.Environment
import android.widget.Toast
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.Paint
import androidx.compose.ui.res.colorResource
import androidx.compose.ui.text.intl.Locale
import androidx.core.content.FileProvider
import com.sangeeth.evesgifts.R
import com.sangeeth.evesgifts.data.SelectedCake
import com.sangeeth.evesgifts.data.SelectedFrame
import com.sangeeth.evesgifts.data.SelectedGifts
import android.graphics.*
import android.provider.CalendarContract

fun PDFGenerator(
    context: Context,
    quotationId: String,
    customerName: String,
    frames: List<SelectedFrame>,
    cakes: List<SelectedCake>,
    gifts: List<SelectedGifts>,
    totalPrice: Double
){

    val pdfDocument = PdfDocument()

    val pageInfo = PdfDocument.PageInfo.Builder(595, 842, 1).create()
    val page = pdfDocument.startPage(pageInfo)
    val canvas = page.canvas

    val titlePaint = android.graphics.Paint().apply {
        textSize = 22f
        color = android.graphics.Color.BLACK
        typeface = Typeface.DEFAULT_BOLD
    }

    val headerPaint = android.graphics.Paint().apply {
        textSize = 12f
        color = android.graphics.Color.BLACK
        typeface = Typeface.DEFAULT_BOLD
    }

    val textPaint = android.graphics.Paint().apply {
        textSize = 22f
        color = android.graphics.Color.BLACK
    }

    val linePaint = android.graphics.Paint().apply {
        strokeWidth = 1f
        color = android.graphics.Color.LTGRAY
    }


}