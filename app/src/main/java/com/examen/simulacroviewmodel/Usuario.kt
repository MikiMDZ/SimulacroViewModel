package com.examen.simulacroviewmodel

import android.os.Parcelable
import kotlinx.parcelize.Parcelize

@Parcelize
data class ListaUsuarios (
    val count: Long,
    val next: String,
    val results: List<Result>,
) : Parcelable

@Parcelize
data class Result (
    val gender: String,
    val name: Name,
    val location: Location,
) : Parcelable

@Parcelize
data class Name (
    val title: String,
    val first: String,
    val last: String
): Parcelable


@Parcelize
data class Location (
    val city: String,
): Parcelable