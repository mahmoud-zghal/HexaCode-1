package com.example.hexacode.service;

import java.util.List;

import org.springframework.web.bind.annotation.PathVariable;

import  com.example.hexacode.Entity.Rating;

public interface IRatingService {
	public Rating findRatingByUserAndCollaborator( Long userId,Long collabId);

	public Rating addRating(Rating rating,Long userId,Long collabId);

    public int calculMoyRating ( Long collabId);
		
    public List<Rating> findRatingBycollaborator(Long collabId);

    public String meilleurCollab();
}
