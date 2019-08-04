package com.soja.Persistor.mapper;

import com.soja.Persistor.GeneratedTweet;
import com.soja.Persistor.dto.GeneratedTweetDto;

public class GeneratedTweetMapper {

    public GeneratedTweet mapToGeneratedTweet(GeneratedTweetDto generatedTweetDto) {
        return new GeneratedTweet(
                generatedTweetDto.getId(),
                generatedTweetDto.getTweetText(),
                generatedTweetDto.getWasPublished(),
                generatedTweetDto.getWasAutogenerated()
        );
    }

    public GeneratedTweetDto mapToGeneratedTweet(GeneratedTweet generatedTweet) {
        return new GeneratedTweetDto(
                generatedTweet.getId(),
                generatedTweet.getTweetText(),
                generatedTweet.getWasPublished(),
                generatedTweet.getWasAutogenerated()
        );
    }
}