package com.application.CDB.useCases
import com.application.CDB.domain.Computer
import com.application.CDB.domain.ComputerInterface
import rx.Observable

class GetComputer (private val getComputerInterface: GetComputerInterface): ComputerInterface {
    fun getComputer(id: Long) : Observable<Computer> {
        return getComputerInterface.getComputerById(id)
    }

    interface ComputerRepository {
        fun getComputerById(id: Long): Computer?
    }
}
