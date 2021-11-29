package Car_Leaderchep;

public class Client {
	
	private String Name;
	private String Adresse;
	private double Cashand;
	
	// geteur et seteur
	public String getName() {
		return Name;
	}
	public void setName(String name) {
		this.Name = name;
	}
	public String getAdresse() {
		return Adresse;
	}
	public void setAdresse(String adresse) {
		this.Adresse = adresse;
	}
	public double getCashand() {
		return Cashand;
	}
	public void setCashand(double cashand) {
		this.Cashand = cashand;
	}
	
	public Client(String name,String adresse,double cashand) {
		// TODO Auto-generated constructor stub
		this.Name=name;
		this.Adresse=adresse;
		this.Cashand=cashand;
	}

	
		
	
	
	public void purchasecar(Vehicle vehicle,Employee empl,boolean finance) {
		empl.handleCustemer(this, finance, vehicle);
		
	}
	@Override
	public String toString() {
		return "Client [Name=" + Name + ", Adresse=" + Adresse + ", Cashand=" + Cashand + "]";
	}
	

}
