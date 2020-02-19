package com.application.CDB.useCases

import com.application.CDB.domain.Computer
import java.time.LocalDateTime

class EditComputer (private val editComputerGateway: EditComputerGateway){
    fun editComputer (
                      idComputer: Long,
                      computerName: String ,
                      computerIntroduced: LocalDateTime,
                      computerDiscontinued: LocalDateTime,
                      computerCompanyId: Long
    ) {
        editComputerGateway.updateComputerName(idComputer, computerName)
        editComputerGateway.updateComputerIntroduced(idComputer, computerIntroduced)
        editComputerGateway.updateComputerDiscontinued(idComputer, computerDiscontinued)
        editComputerGateway.updateComputerCompanyId(idComputer, computerCompanyId)
    }

    interface ProductRepository {
        fun computerIdExist(id: Long): Boolean?
        fun editComputer(computer: Computer)
    }
}



