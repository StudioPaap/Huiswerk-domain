package com.huiswerk.opdrachthuiswerk.controllers;


import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
public class TelevisionController {

    @GetMapping("/televisions")
    public ResponseEntity<Object> getAllTelevisions() {

        // Return een String met een 200 status
        return ResponseEntity.ok("televisions");

    }

    @GetMapping("/televisions/{id}")
    public ResponseEntity<Object> getTelevision(@PathVariable("id") int id) {

        // return een String met een 200 status
        return ResponseEntity.ok("television with id: " + id);

    }

    @PostMapping("/televisions")
    public ResponseEntity<Object> addTelevision(@RequestBody String television) {

        // Return een String met een 201 status
        //De null van created zal over een paar weken vervangen worden door een gegenereerde url.
        return ResponseEntity.created(null).body("television");

    }

    @DeleteMapping("/televisions/{id}")
    public ResponseEntity<Object> deleteTelevision(@PathVariable int id) {

        //Return een 204 status
        return ResponseEntity.noContent().build();

    }

    @PutMapping("/televisions/{id}")
    public ResponseEntity<Object> updateTelevision(@PathVariable int id, @RequestBody String television) {

        // Return een 204 status
        return ResponseEntity.noContent().build();

    }


}
