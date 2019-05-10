package com.sms.roomservice.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.sms.roomservice.model.Room;

@Repository
public interface RoomRepository extends JpaRepository<Room, Long>{
    Room findByRoomNumber(String roomNumber);
}
