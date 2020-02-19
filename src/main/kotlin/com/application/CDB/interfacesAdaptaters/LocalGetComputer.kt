package com.application.CDB.interfacesAdaptaters

import com.application.CDB.dataProvider.RepositoryComputer
import com.application.CDB.domain.Computer
import com.application.CDB.useCases.GetComputerGateway
import rx.Observable

class LocalGetComputer (private val repositoryComputer: RepositoryComputer): GetComputerGateway {
    override fun getComputerById(id: Long): Observable<Computer> = repositoryComputer.getComputerById(id)
}