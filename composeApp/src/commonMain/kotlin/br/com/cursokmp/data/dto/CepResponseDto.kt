package br.com.cursokmp.data.dto

import kotlinx.serialization.Serializable

@Serializable
data class CepResponseDto(
    val cep: String,
    val logradouro: String,
    val complemento: String,
    val bairro: String,
    val localidade: String,
    val uf: String,
    val estado: String,
    val regiao: String,
)