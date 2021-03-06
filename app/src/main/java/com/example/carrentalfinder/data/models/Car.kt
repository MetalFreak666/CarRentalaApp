package com.example.carrentalfinder.data.models

import java.io.Serializable

/**
 * Data class for car entity
 */
data class Car (
    val brand: String,
    val model: String,
    val year: String,
    val origin: String,
    val horsepower: Int,
    val weight: Int,
    val cylinders: Int,
    val milesPerGallons: Int
): Serializable