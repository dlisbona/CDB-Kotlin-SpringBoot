package com.application.CDB.domain

import java.time.LocalDateTime

class Computer(private val name: String,
               private val companyId: Long?,
               private val discontinued: LocalDateTime?,
               private val introduced: LocalDateTime?,
               private val id: Long) {

}