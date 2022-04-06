package com.openbootcamp.demospringrest;

import com.openbootcamp.demospringrest.models.Bootcamper;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class BootcamperService {
    private List<Bootcamper> bootcampers= new ArrayList();

    public List<Bootcamper> getAll(){
        return bootcampers;
    }

    public Bootcamper get(String nombre){
        for (Bootcamper bootcamper: bootcampers) {
            if (bootcamper.getNombre().equalsIgnoreCase(nombre)){
                return bootcamper;
            }
        }
        return null;
    }
    public void add(Bootcamper bootcamper){
        bootcampers.add(bootcamper);
    }
}
