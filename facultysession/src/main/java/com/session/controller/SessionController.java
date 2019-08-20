package com.session.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.session.bean.Session1;
import com.session.exception.SessionException;
import com.session.service.SessionService;

@RestController
public class SessionController {
	@Autowired
	SessionService sessionService;
	
	@RequestMapping("/sessions")
	public List <Session1> getAllSessions() throws SessionException
	{
		return sessionService.getAllSessions();
	}
	
	@RequestMapping(value="/session", method=RequestMethod.POST)
	public List<Session1> addSession(@RequestBody Session1 b) throws SessionException{
		return sessionService.addSession(b);
			}
	
	
	@DeleteMapping("/sessions/{id}")	
	public ResponseEntity<String> deleteSession(@PathVariable int id) throws SessionException {
	sessionService.deleteSession(id);
	return new ResponseEntity<String> ("session with id "+id+" deleted",HttpStatus.OK);
	}
	
	
	
	@PutMapping("/books/{id}")
	public List <Session1> updateSession(@PathVariable int id, @RequestBody Session1 b) throws SessionException{
		return sessionService.updateSession(id, b);
	}
	
}
