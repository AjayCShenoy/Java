import java.text.SimpleDateFormat;
import java.util.Date;

public class Mobile {
	private String referenceId,modelName;
	private Double displaySize,price;
	private Date launchedDate;
	
	
	public String getReferenceId() {
		return referenceId;
	}
	public void setReferenceId(String referenceId) {
		this.referenceId = referenceId;
	}
	public String getModelName() {
		return modelName;
	}
	public void setModelName(String modelName) {
		this.modelName = modelName;
	}
	public Double getDisplaySize() {
		return displaySize;
	}
	public void setDisplaySize(Double displaySize) {
		this.displaySize = displaySize;
	}
	public Double getPrice() {
		return price;
	}
	public void setPrice(Double price) {
		price = price;
	}
	public Date getLaunchedDate() {
		return launchedDate;
	}
	public void setLaunchedDate(Date launchedDate) {
		this.launchedDate = launchedDate;
	}
	
	public Mobile() {
		
	}
	public Mobile(String referenceId, String modelName, Double displaySize, Double price, Date launchedDate) {
		super();
		this.referenceId = referenceId;
		this.modelName = modelName;
		this.displaySize = displaySize;
		price = price;
		this.launchedDate = launchedDate;
	}
	@Override
	public String toString() {
		SimpleDateFormat sdf=new SimpleDateFormat("dd/MM/yyyy");
	
		return String.format("Reference Id: %s \n"
				+ "Model Name: %s\n"
				+ "Display Size: %.2f\n"
				+ "Price: %f\n"
				+ "Launched Date: %s\n",referenceId,modelName,displaySize,price,sdf.format(launchedDate));
	}
	public boolean equals(Mobile args) {
		return this.getReferenceId().equalsIgnoreCase(args.getReferenceId()) && this.getLaunchedDate().equals(args.getLaunchedDate());
	
 }
	
}



