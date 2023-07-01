package com.example.capi.persons;

import com.example.capi.persons.models.Hobbies;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

import java.util.List;

@FeignClient(name = "person-feign-client", url = "localhost:8082")
public interface PersonsFeignClient {

    @GetMapping("hobbies/{personIds}")
    public ResponseEntity<List<Hobbies>> fetchAllHobbiesByPersonIds(@PathVariable List<Long> personIds);
}
