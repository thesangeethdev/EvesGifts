package com.sangeeth.evesgifts.utils

import com.google.firebase.storage.FirebaseStorage


fun uploadQuotationPdf(pdfByte: ByteArray, quotationId: String, onComplete: (String) -> Unit, onError: (Exception) -> Unit ){

    val storage = FirebaseStorage.getInstance()

    val pdfRef =  storage.reference.child("quotations/$quotationId.pdf")

    pdfRef.putBytes(pdfByte).continueWithTask { task ->
        if (!task.isSuccessful){
            throw task.exception!!
        }

        pdfRef.downloadUrl
    }
        .addOnSuccessListener { url ->
            onComplete(url.toString())
        }
        .addOnFailureListener {
            onError(it)
        }

}