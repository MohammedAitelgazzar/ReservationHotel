package com.app;

import com.app.dao.ChambreRepository;
import com.app.dao.ClientRepository;
import com.app.dao.ReservationRepository;
import com.app.entities.*;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

import java.util.Arrays;
import java.util.Date;

@SpringBootApplication
public class ReservationhotelApplication {

    public static void main(String[] args) {
        SpringApplication.run(ReservationhotelApplication.class, args);
    }


}
