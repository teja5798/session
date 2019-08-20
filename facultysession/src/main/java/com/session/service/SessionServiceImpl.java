package com.session.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.session.bean.Session1;
import com.session.dao.SessionDao;
import com.session.exception.SessionException;
@Service
public class SessionServiceImpl implements SessionService {
	@Autowired
     SessionDao sessionDao;
	

	@Override
	public List<Session1> addSession(Session1 b) throws SessionException {

		try {
			sessionDao.save(b);
	        return sessionDao.findAll();
	        }catch(Exception e) {
	            throw new SessionException(e.getMessage());
	        }
		
	}

	@Override
	public List<Session1> updateSession(int id, Session1 b) throws SessionException {
		try
		{
			Optional<Session1> optional=sessionDao.findById(id);
			if(optional.isPresent())
			{
				Session1 s=optional.get();
				s.setId(b.getId());
				s.setName(b.getName());
				s.setDuration(b.getDuration());
				s.setFaculty(b.getFaculty());
				s.setSession_mode(b.getSession_mode());
				
				sessionDao.save(s);
				return getAllSessions();
			}
			else
			{
				throw new SessionException("session with Id"+id+" does not exist");	
			}
		}
			catch(Exception e)
		   {
	            throw new SessionException(e.getMessage());	
	       }
	}

	@Override
	public List<Session1> getAllSessions() throws SessionException {
		try
		{
			return sessionDao.findAll();
		}
		catch(Exception e)
		{
			throw new SessionException(e.getMessage());
		}
		
	}

	@Override
	public void deleteSession(int id) throws SessionException {
		// TODO Auto-generated method stub
		try
		{
			sessionDao.deleteById(id);
		}
		catch(Exception e)
		{
			throw new SessionException(e.getMessage());
		}
		
	}
	

}



