package com.application.CDB.frameworks.dataProvider

import javax.persistence.*

@Entity( name="Companies")
class EntityCompanyDB(
        val name: String, // shift+F6 pour changer nom dans toutes les classes
        @Id @GeneratedValue(strategy = GenerationType.IDENTITY) val id: Long)