package com.example.hexacode.service;

import java.util.List;

import  com.example.hexacode.Entity.Bookmarks;
import  com.example.hexacode.Entity.Event;

public interface IbookmarkService {
	
	 void addBookmark(Bookmarks b,Long idEvent,Long idUser );
	 
	 void deleteBookmark(Long id);
	 
	 List<Event> GetAllBookmarks(Long id);

}
