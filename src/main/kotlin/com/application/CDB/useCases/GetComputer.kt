package com.application.CDB.useCases
import com.application.CDB.domain.Computer
import rx.Observable

class GetComputer (private val getComputerGateway: GetComputerGateway){
    fun getComputer(id: Long) : Observable<Computer> {
        return getComputerGateway.getComputerById(id)
    }

    interface ProductRepository {
        fun getComputerById(id: Long): Computer?
    }
}
