package com.application.CDB.entities

import java.time.LocalDateTime
import javax.persistence.*

@Entity
class Article(
        val name: String,
        @ManyToOne val company: Company?,
        val discontinued: LocalDateTime?,
        val introduced: LocalDateTime,
        @Id @GeneratedValue val id: Long) // pas d'id nullable

@Entity
class Company(
        val name: String, // shift+F6 pour changer nom dans toutes les classes
        @Id @GeneratedValue val id: Long)