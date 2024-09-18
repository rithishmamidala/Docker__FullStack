package com.example.backend.REpo;

import com.example.backend.Model.dat;
import org.springframework.data.jpa.repository.JpaRepository;

public interface rep extends JpaRepository<dat,Long> {
}
