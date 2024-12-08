package com.app.controller;

import com.app.dao.ChambreRepository;
import com.app.entities.Chambre;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/chambres")
@CrossOrigin("*")
public class ChambreController {

    private final ChambreRepository chambreRepository;

    @Autowired
    public ChambreController(ChambreRepository chambreRepository) {
        this.chambreRepository = chambreRepository;
    }

    @GetMapping
    public List<Chambre> getAllChambres() {
        return chambreRepository.findAll();
    }

    @GetMapping("/{id}")
    public ResponseEntity<Chambre> getChambreById(@PathVariable Long id) {
        return chambreRepository.findById(id)
                .map(ResponseEntity::ok)
                .orElse(ResponseEntity.notFound().build());
    }

    @PostMapping
    public ResponseEntity<Chambre> createChambre(@RequestBody Chambre chambre) {
        try {
            Chambre savedChambre = chambreRepository.save(chambre);
            return ResponseEntity.ok(savedChambre);
        } catch (Exception e) {
            return ResponseEntity.badRequest().build();
        }
    }

    @PutMapping("/{id}")
    public ResponseEntity<Chambre> updateChambre(@PathVariable Long id, @RequestBody Chambre chambreDetails) {
        return chambreRepository.findById(id)
                .map(existingChambre -> {
                    existingChambre.setPrix(chambreDetails.getPrix());
                    existingChambre.setDisponible(chambreDetails.getDisponible());
                    existingChambre.setType(chambreDetails.getType());
                    
                    Chambre updatedChambre = chambreRepository.save(existingChambre);
                    return ResponseEntity.ok(updatedChambre);
                })
                .orElse(ResponseEntity.notFound().build());
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Void> deleteChambre(@PathVariable Long id) {
        if (chambreRepository.existsById(id)) {
            chambreRepository.deleteById(id);
            return ResponseEntity.ok().build();
        }
        return ResponseEntity.notFound().build();
    }
}