package com.proyecto.demo.Repository;


import com.proyecto.demo.Models.Machine;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository("MachineRepo")
public interface MachineRepo extends JpaRepository<Machine, Integer> {

    public abstract Machine findByName(String name);

    public abstract List<Machine> findByAvailability(Integer availability);
}
