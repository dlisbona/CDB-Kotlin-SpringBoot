package com.application.CDB.entities

import java.time.LocalDateTime
import javax.persistence.*

@Entity
data class Article(
        val name: String,
        @ManyToOne val company: Company?,
        val discontinued: LocalDateTime?,
        val introduced: LocalDateTime,
        @Id @GeneratedValue val id: Long) // pas d'id nullable

@Entity
data class Company(
        val name: String, // shift+F6 pour changer nom dans toutes les classes
        @Id @GeneratedValue val id: Long)