package com.leaderboard.dao;

import java.util.List;

import javax.transaction.Transactional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.leaderboard.model.Leaderboard;

@Repository
public interface LeaderboardRepository extends JpaRepository<Leaderboard, String> {
	
	@Modifying
	@Query(value = "insert into leaderboard select student.student_name ,sum(marks) as total from marks inner join student on student.student_id=marks.student_id group by marks.student_id", nativeQuery = true)
	@Transactional
	void addRecord();
	
	@Query(value="select * from leaderboard order by total desc limit 10", nativeQuery= true)
	List<Leaderboard> getRecords();
	
	@Modifying
	@Query(value= "delete from leaderboard",nativeQuery = true)
	@Transactional
	void deleteRecords();
}
