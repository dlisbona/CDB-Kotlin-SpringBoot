package com.application.CDB.interfacesAdaptaters

import com.application.CDB.frameworks.dataProvider.RepositoryComputer
import com.application.CDB.useCases.EditComputerInterface
import java.time.LocalDateTime

class LocalEditComputer (private val repositoryComputer: RepositoryComputer): EditComputerInterface {

    override fun updateComputerName(idSelected: Long, computerName: String) {
    }

    override fun updateComputerIntroduced(idSelected: Long, computerIntroduced: LocalDateTime) {
    }

    override fun updateComputerDiscontinued(idSelected: Long, computerDiscontinued: LocalDateTime) {
    }

    override fun updateComputerCompanyId(idSelected: Long, computerCompanyId: Long) {
    }
}