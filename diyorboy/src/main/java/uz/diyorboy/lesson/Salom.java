package uz.diyorboy.lesson;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api")
public class Salom {
    @GetMapping("/students")
    public ResponseEntity getAll(){
        return ResponseEntity.ok("Salomlar");
    }

    @PostMapping("/students")
    public ResponseEntity creat(@RequestBody Malumot malumot){

        malumot.setName("ali");
        malumot.setLastName("aliyev");
        return ResponseEntity.ok(malumot);
    }
}
