package com.application.CDB.useCases

import com.application.CDB.domain.Computer
import com.application.CDB.domain.ComputerInterface
import java.time.LocalDateTime

class EditComputer (private val editComputerInterface: EditComputerInterface): ComputerInterface {
    fun editComputer (
                      idComputer: Long,
                      computerName: String ,
                      computerIntroduced: LocalDateTime,
                      computerDiscontinued: LocalDateTime,
                      computerCompanyId: Long
    ) {
        editComputerInterface.updateComputerName(idComputer, computerName)
        editComputerInterface.updateComputerIntroduced(idComputer, computerIntroduced)
        editComputerInterface.updateComputerDiscontinued(idComputer, computerDiscontinued)
        editComputerInterface.updateComputerCompanyId(idComputer, computerCompanyId)
    }

    interface ComputerRepository {
        fun computerIdExist(id: Long): Boolean?
        fun editComputer(computer: Computer)
    }
}



