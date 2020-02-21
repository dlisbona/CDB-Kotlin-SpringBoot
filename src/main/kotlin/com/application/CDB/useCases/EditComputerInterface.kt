package com.application.CDB.useCases

import java.time.LocalDateTime

interface EditComputerInterface {
    fun updateComputerName (idSelected: Long, computerName: String)
    fun updateComputerIntroduced(idSelected: Long, computerIntroduced: LocalDateTime)
    fun updateComputerDiscontinued (idSelected: Long, computerDiscontinued: LocalDateTime)
    fun updateComputerCompanyId (idSelected: Long, computerCompanyId: Long)
}