package com.application.CDB.domain

import java.time.LocalDateTime
import javax.persistence.*

class Computer(
        val name: String,
        val companyId: Long?,
        val discontinued: LocalDateTime?,
        val introduced: LocalDateTime?,
        val id: Long) // pas d'id nullable

class Company(
        val name: String, // shift+F6 pour changer nom dans toutes les classes
        val id: Long)