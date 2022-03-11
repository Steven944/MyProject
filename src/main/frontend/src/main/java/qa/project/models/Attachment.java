package qa.project.models;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;



	@Entity
	@Table(name="attachment")
	public class Attachment {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
		private long id;
	
	    private String Attachment1;
	    private String Attachment2;
	    private String Attachment3;
	    private String Attachment4;
	 
	    public Attachment() {
	    	
	    	//default constructor
	    }

	    public long getId() {
		return id;
	}
	    public void setId(long id) {
		this.id = id;
	}

		public String getAttachment1() {
			return Attachment1;
		}

		public void setAttachment1(String attachment1) {
			Attachment1 = attachment1;
		}

		public String getAttachment2() {
			return Attachment2;
		}

		public void setAttachment2(String attachment2) {
			Attachment2 = attachment2;
		}

		public String getAttachment3() {
			return Attachment3;
		}

		public void setAttachment3(String attachment3) {
			Attachment3 = attachment3;
		}

		public String getAttachment4() {
			return Attachment4;
		}

		public void setAttachment4(String attachment4) {
			Attachment4 = attachment4;
		}

		public Attachment(String attachment1, String attachment2, String attachment3, String attachment4) {
			super();
			Attachment1 = attachment1;
			Attachment2 = attachment2;
			Attachment3 = attachment3;
			Attachment4 = attachment4;
		}

		


		
	
	
	
}
