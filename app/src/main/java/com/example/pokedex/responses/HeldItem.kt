package com.example.pokedex.responses

data class HeldItem(
    var item: Item?,
    var version_details: List<VersionDetail>?
)