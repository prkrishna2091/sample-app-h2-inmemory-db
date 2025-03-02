package com.ramki.sampleapph2inmemorydb;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

@SpringBootApplication
public class SampleAppH2InmemoryDbApplication {

    public static void main(String[] args) {
       LocalDate localDate = LocalDate.now();
       //LocalDate localDate = LocalDate.parse(DateTimeFormatter.ofPattern("dd-MMM-yy").format(LocalDate.now()), DateTimeFormatter.ofPattern("dd-MMM-yy"));
       System.out.println("localDate = " + localDate.format(java.time.format.DateTimeFormatter.ofPattern("dd-MMM-yy")));
        SpringApplication.run(SampleAppH2InmemoryDbApplication.class, args);
    }

}
