package br.com.cursokmp.firstexample.data.datasource.remote

import br.com.cursokmp.firstexample.data.dto.CepResponseDto
import io.ktor.client.HttpClient
import io.ktor.client.call.body
import io.ktor.client.plugins.contentnegotiation.ContentNegotiation
import io.ktor.client.request.get
import io.ktor.client.statement.HttpResponse
import io.ktor.serialization.kotlinx.json.json
import kotlinx.serialization.json.Json

private const val BASE_URL = "https://viacep.com.br/ws"

class ApiService {

    val client = HttpClient {
        install(ContentNegotiation) {
            json(Json {
                ignoreUnknownKeys = true
            })
        }
    }

    suspend fun getCep(): CepResponseDto {
        val response: HttpResponse = client.get("${BASE_URL}/12209110/json/")
        val cepResponse = response.body<CepResponseDto>()
        println("getCep => $cepResponse")

        return cepResponse
    }
}