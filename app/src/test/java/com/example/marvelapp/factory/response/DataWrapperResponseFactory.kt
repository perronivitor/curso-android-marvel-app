package com.example.marvelapp.factory.response

import com.example.marvelapp.framework.network.response.CharacterResponse
import com.example.marvelapp.framework.network.response.DataContainerResponse
import com.example.marvelapp.framework.network.response.DataWrapperResponse
import com.example.marvelapp.framework.network.response.ThumbnailResponse

class DataWrapperResponseFactory {

    fun create() = DataWrapperResponse(
        copyright = "",
        data = DataContainerResponse(
            offset = 0,
            total = 2,
            results = listOf(
                CharacterResponse(
                    id = "1011334",
                    name = "3-D Man",
                    thumbnail = ThumbnailResponse(
                        path = "http://i.annihil.us/u/prod/marvel/i/mg/c/e0/535fecbbb9784/standard_incredible",
                        extension = "jpg"
                    )
                ),
                CharacterResponse(
                    id = "1011334",
                    name = "A-Bomb (HAS)",
                    thumbnail = ThumbnailResponse(
                        path = "http://i.annihil.us/u/prod/marvel/i/mg/c/e0/535fecbbb9784/standard_incredible",
                        extension = "jpg"
                    )
                )
            )
        )
    )
}
