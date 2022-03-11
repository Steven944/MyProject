package qa.project.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import qa.project.models.Attachment;

@Repository
public interface AttachmentRepository extends JpaRepository<Attachment, Long>{

}
