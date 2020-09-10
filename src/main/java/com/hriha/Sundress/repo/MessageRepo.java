package com.hriha.Sundress.repo;

import com.hriha.Sundress.domain.Message;
import org.springframework.data.jpa.repository.JpaRepository;

public interface MessageRepo extends JpaRepository<Message, Long> {
}
