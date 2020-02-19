package com.application.CDB.useCases

import com.application.CDB.domain.Computer
import rx.Observable
import rx.Single

interface GetComputerGateway {
    fun getComputerById(id: Long): Observable<Computer>
}