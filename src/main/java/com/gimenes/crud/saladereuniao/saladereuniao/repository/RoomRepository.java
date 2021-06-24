package com.gimenes.crud.saladereuniao.saladereuniao.repository;

import com.gimenes.crud.saladereuniao.saladereuniao.model.Room;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;
import java.util.OptionalLong;

@Repository
public interface RoomRepository extends JpaRepository<Room, Long> {

}
