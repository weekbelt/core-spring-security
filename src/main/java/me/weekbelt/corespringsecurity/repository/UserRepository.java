package me.weekbelt.corespringsecurity.repository;

import me.weekbelt.corespringsecurity.domain.Account;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface UserRepository extends JpaRepository<Account, Long> {

    Optional<Account> findByUsername(String username);
}
