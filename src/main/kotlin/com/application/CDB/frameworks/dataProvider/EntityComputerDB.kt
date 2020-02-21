package com.application.CDB.frameworks.dataProvider

import java.time.LocalDateTime
import javax.persistence.*

@Entity(name="computers")
class EntityComputerDB(
        val name: String,
        @ManyToOne val companyId: EntityCompanyDB?,
        val discontinued: LocalDateTime?,
        val introduced: LocalDateTime,
        @Id @GeneratedValue(strategy = GenerationType.IDENTITY) val computerId: Long) // pas d'id nullable
