package com.app.controller;

import com.app.dao.ChambreRepository;
import com.app.entities.Chambre;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/chambres")
public class ChambreController {

    @Autowired
    private ChambreRepository chambreRepository;

    // Get all rooms
    @GetMapping
    public List<Chambre> getAllChambres() {
        return chambreRepository.findAll();
    }

    // Get room by ID
    @GetMapping("/{id}")
    public ResponseEntity<Chambre> getChambreById(@PathVariable Integer id) {
        return chambreRepository.findById(id)
                .map(ResponseEntity::ok)
                .orElse(ResponseEntity.notFound().build());
    }

    // Create new room
    @PostMapping
    public ResponseEntity<Chambre> createChambre(@RequestBody Chambre chambre) {
        try {
            Chambre savedChambre = chambreRepository.save(chambre);
            return ResponseEntity.ok(savedChambre);
        } catch (Exception e) {
            return ResponseEntity.badRequest().build();
        }
    }

    // Update room
    @PutMapping("/{id}")
    public ResponseEntity<Chambre> updateChambre(@PathVariable Integer id, 
                                               @RequestBody Chambre chambreDetails) {
        return chambreRepository.findById(id)
                .map(existingChambre -> {
                    existingChambre.setPrix(chambreDetails.getPrix());
                    existingChambre.setDisponible(chambreDetails.isDisponible());
                    existingChambre.setType(chambreDetails.getType());
                    Chambre updatedChambre = chambreRepository.save(existingChambre);
                    return ResponseEntity.ok(updatedChambre);
                })
                .orElse(ResponseEntity.notFound().build());
    }

    // Delete room
    @DeleteMapping("/{id}")
    public ResponseEntity<?> deleteChambre(@PathVariable Integer id) {
        return chambreRepository.findById(id)
                .map(chambre -> {
                    chambreRepository.delete(chambre);
                    return ResponseEntity.ok().build();
                })
                .orElse(ResponseEntity.notFound().build());
    }
} 