package com.hriha.Sundress.repo;

import com.hriha.Sundress.domain.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserDetailsRepo extends JpaRepository<User, String> {
}
