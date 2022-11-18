package pl.sda.arppl3.files;

import org.springframework.data.repository.CrudRepository;

import java.util.List;
import java.util.UUID;

public interface FileRepository extends CrudRepository<FileEntity, UUID> {
    //crudeRep ma savy i findy i wiekszośc akcji na danych
    List<FileEntity>findByExtension(String extension);
}
