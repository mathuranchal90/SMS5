package com.sms.guestservice.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.sms.guestservice.model.Guest;


@Repository
public interface GuestRepository extends JpaRepository<Guest, Long>{
    Guest findByEmailAddress(String emailAddress);
}

