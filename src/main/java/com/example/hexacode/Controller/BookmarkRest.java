package com.example.hexacode.Controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.hexacode.Entity.Bookmarks;
import com.example.hexacode.Entity.Event;
import com.example.hexacode.Entity.EventComment;
import  com.example.hexacode.service.IbookmarkService;

@RestController

@RequestMapping(value = "Bookmarks")
public class BookmarkRest {
	
	@Autowired
	IbookmarkService bookmarkserv;
	
	@PostMapping (value ="/add_bookmark/{idEvent}/{idUser}")
	public void addBookmark(@RequestBody Bookmarks b,@PathVariable("idEvent")Long idEvent,@PathVariable("idUser")Long idUser ){
		
		bookmarkserv.addBookmark(b,idEvent,idUser);
	}
	
	@DeleteMapping (value="/delete_bookmark")
	public void deleteBokkmark(@RequestBody long id){
		
		bookmarkserv.deleteBookmark(id);
		}
	
	@GetMapping("/get_bookmarks_user/{iduser}")
    @ResponseBody
    public List<Event> retrieveAllbookmarks(@PathVariable("iduser") Long idUser) {
        List<Event> bookmarks = bookmarkserv.GetAllBookmarks(idUser);
        return bookmarks;
    }
	

}
