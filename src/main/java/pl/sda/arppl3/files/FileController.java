package pl.sda.arppl3.files;

import lombok.AllArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import java.util.UUID;

import static pl.sda.arppl3.files.FileController.BASE_PATH;

@RestController
@RequestMapping(BASE_PATH)
@AllArgsConstructor
public class FileController {

    static final String BASE_PATH = "/api/files-data";

    private final FileService fileService;

    @GetMapping
    FileCollection getAll() {
        return fileService.findAll();
    }

    @GetMapping("/{id}")
    FileEntity getById(@PathVariable UUID id) {
       // return fileService.findById(id);
        return null;
    }

    @PostMapping
    @ResponseStatus(HttpStatus.CREATED)
    UUID create(@RequestBody FileEntity file) {
        return fileService.addFile(file);
    }

    @PutMapping("/{id}")
    @ResponseStatus(HttpStatus.NO_CONTENT)
    void update(@PathVariable UUID id, @RequestBody FileEntity file) {
        fileService.update(id, file);
    }

    @DeleteMapping("/{id}")
    @ResponseStatus(HttpStatus.NO_CONTENT)
    void delete(@PathVariable UUID id) {
        fileService.delete(id);
    }

    @GetMapping ("/sda")
    FileCollection findByExtension(@RequestParam String extension) {
        return fileService.findByExtension(extension);
    }
}

