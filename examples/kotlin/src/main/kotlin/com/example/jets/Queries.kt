// Code generated by sqlc. DO NOT EDIT.
// versions:
//   sqlc v1.19.1

package com.example.jets

import java.sql.Connection
import java.sql.SQLException
import java.sql.Statement

interface Queries {
  @Throws(SQLException::class)
  fun countPilots(): Long?
  
  @Throws(SQLException::class)
  fun deletePilot(id: Int)
  
  @Throws(SQLException::class)
  fun listPilots(): List<Pilot>
  
}

