package com.session.service;

import java.util.List;

import com.session.bean.Session1;
import com.session.exception.SessionException;

public interface SessionService {

	public List<Session1> addSession(Session1 b) throws SessionException;
	public List<Session1> updateSession(int id, Session1 b) throws SessionException;
	public List<Session1> getAllSessions() throws SessionException;
	public void deleteSession (int id) throws SessionException;	
}
