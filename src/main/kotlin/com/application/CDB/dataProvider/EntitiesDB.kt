package com.application.CDB.dataProvider

import java.time.LocalDateTime
import javax.persistence.*

@Entity
class ComputerDB(
        val name: String,
        @ManyToOne val companyId: CompanyDB?,
        val discontinued: LocalDateTime?,
        val introduced: LocalDateTime,
        @Id @GeneratedValue val computerId: Long) // pas d'id nullable

@Entity
class CompanyDB(
        val name: String, // shift+F6 pour changer nom dans toutes les classes
        @Id @GeneratedValue val id: Long)