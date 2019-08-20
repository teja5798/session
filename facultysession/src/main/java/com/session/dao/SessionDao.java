package com.session.dao;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import com.session.bean.Session1;
@Repository
public interface SessionDao extends JpaRepository<Session1, Integer> {
	@Query("from Session1 where idr=:c")
	List<Session1> getSessionById(@Param("c")String id);
	
}
