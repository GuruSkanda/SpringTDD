package com.loopytechguru.model;

public record Photo(Integer id,
                    Integer albumId,
                    String title,
                    String url,
                    String thumbnailUrl) {

}
