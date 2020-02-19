package com.application.CDB.dataProvider

import com.application.CDB.domain.Computer
import com.application.CDB.useCases.EditComputerGateway
import com.application.CDB.useCases.GetComputerGateway
import rx.Observable
import java.time.LocalDateTime

open class RepositoryComputer () : GetComputerGateway, EditComputerGateway {
    override fun updateComputerName(idSelected: Long, computerName: String) {
    }

    override fun updateComputerIntroduced(idSelected: Long, computerIntroduced: LocalDateTime) {
    }

    override fun updateComputerDiscontinued(idSelected: Long, computerDiscontinued: LocalDateTime) {
    }

    override fun updateComputerCompanyId(idSelected: Long, computerCompanyId: Long) {
    }

    fun getComputerName(idSelected: Long, computerName: String) {
    }

    fun getComputerIntroduced(idSelected: Long, computerIntroduced: LocalDateTime) {
    }

    fun getComputerDiscontinued(idSelected: Long, computerDiscontinued: LocalDateTime) {
    }

    fun getComputerCompanyId(idSelected: Long, computerCompanyId: Long) {
    }

    override fun getComputerById(id: Long): Observable<Computer> {
        val computer: Computer = Computer("test", 1,null, null, 3)
        return Observable.just(computer);
    }
}


open class RepositoryCompany{}