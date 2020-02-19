package com.application.CDB.interfacesAdaptaters

import com.application.CDB.dataProvider.RepositoryComputer
import com.application.CDB.useCases.EditComputerGateway
import java.time.LocalDateTime

class LocalEditComputer (private val repositoryComputer: RepositoryComputer): EditComputerGateway {

    override fun updateComputerName(idSelected: Long, computerName: String) {
    }

    override fun updateComputerIntroduced(idSelected: Long, computerIntroduced: LocalDateTime) {
    }

    override fun updateComputerDiscontinued(idSelected: Long, computerDiscontinued: LocalDateTime) {
    }

    override fun updateComputerCompanyId(idSelected: Long, computerCompanyId: Long) {
    }
}