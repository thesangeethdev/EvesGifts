package com.sangeeth.evesgifts.ui.profile

sealed class ProfileUIState {
    object Loading : ProfileUIState()
    data class Success(val diaplayName: String, val email: String): ProfileUIState()
    data class Error(val message: String) : ProfileUIState()
}