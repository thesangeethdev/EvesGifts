package com.sangeeth.evesgifts.utils

import com.google.firebase.Firebase
import com.google.firebase.FirebaseApp
import com.google.firebase.firestore.FieldValue
import com.google.firebase.firestore.firestore
import com.google.firebase.storage.FirebaseStorage
import com.google.firebase.storage.storage

fun saveQuotation(quotationId: String, customerName: String, totalPrice: Double, onComplete: () -> Unit) {

    val db = Firebase.firestore

    val quotation = hashMapOf(
        "quotationId" to quotationId,
        "customerName" to customerName,
        "totalPrice" to totalPrice,
//        "pdfUrl" to pdfUrl,
        "createdAt" to FieldValue.serverTimestamp(),

    )

    db.collection("quotations")
        .document(quotationId)
        .set(quotation)
        .addOnSuccessListener {
            onComplete()
        }
        .addOnFailureListener { error->
            error.printStackTrace()
            onComplete()
        }

}