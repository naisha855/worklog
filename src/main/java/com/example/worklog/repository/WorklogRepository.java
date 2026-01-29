package com.example.worklog.repository; // 본인의 패키지 경로에 맞게 수정

import com.example.worklog.domain.Worklog; // Worklog 엔티티 임포트
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface WorklogRepository extends JpaRepository<Worklog, Long> {
    // 여기에 추가 코드가 없어도 save(), findAll(), deleteById() 등을 사용할 수 있습니다.
}