package pl.sda.arppl3.files;

import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;
import java.util.UUID;

@AllArgsConstructor
@Service
public class FileService {

    private final FileRepository fileRepository;

    FileCollection findAll() {
        Iterable<FileEntity> files = fileRepository.findAll();
        FileCollection fileCollection = new FileCollection();

        List<FileEntity> list = new ArrayList<>();
        files.forEach(file -> list.add(file));
        return fileCollection;

    }

    FileEntity findByID(UUID id) {
        //optional ma 1 lub nic
        Optional<FileEntity> fileEntity = fileRepository.findById(id);
        return fileEntity.orElse(null); // zwróć encje lub nulla
    }

    UUID addFile(FileEntity file) {
        file.setId(null); // upewniemy się ze id na wstępie bedzie null
        file = fileRepository.save(file);
        return file.getId();
    }

    void update(UUID id, FileEntity file) {
        // trzeba znaleźć encję to aktualizacji
        Optional<FileEntity> existingFile = fileRepository.findById(id);
        if (existingFile.isPresent()) {
            FileEntity fileFromDB = existingFile.get();
            fileFromDB.setContent(file.getExtension());
            file.setSizeInKb((file.getSizeInKb()));
            fileFromDB.setName(file.getName());

            fileRepository.save(fileFromDB);
        }
    }

    void delete(UUID id) {
        fileRepository.deleteById(id);

    }

    FileCollection findByExtension(String extension) {
        List<FileEntity> files = fileRepository.findByExtension(extension);
        FileCollection fileCollection = new FileCollection();
        fileCollection.setFiles(files);
        return fileCollection;
    }
}
