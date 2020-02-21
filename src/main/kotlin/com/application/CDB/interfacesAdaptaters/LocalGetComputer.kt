package com.application.CDB.interfacesAdaptaters

import com.application.CDB.frameworks.dataProvider.RepositoryComputer
import com.application.CDB.domain.Computer
import com.application.CDB.useCases.GetComputerInterface
import rx.Observable

class LocalGetComputer (private val repositoryComputer: RepositoryComputer): GetComputerInterface {
    override fun getComputerById(id: Long): Observable<Computer> = repositoryComputer.getComputerById(id)
}