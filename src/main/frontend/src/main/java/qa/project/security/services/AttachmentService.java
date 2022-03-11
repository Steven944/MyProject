package qa.project.security.services;

import java.util.List;

import qa.project.models.Attachment;

public interface AttachmentService {

	public Attachment saveAttachment(Attachment attachment);
	public List<Attachment> getAllAttachments();
	
	
	
}
