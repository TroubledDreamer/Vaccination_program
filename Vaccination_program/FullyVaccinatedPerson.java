
public class FullyVaccinatedPerson extends BasePerson{
    private String vaxname;
    public FullyVaccinatedPerson(int age, String name,boolean publish,int id, String vaxname)
    {
        super( name, age, publish);
        super.setId(id);
        this.vaxname= vaxname;
    }

    public String getVaxName()
    {
        return vaxname;
    }
    
    public String getName()
    {
        return name;
    }

    public String publish()
    {
        String returnval ="";

        if (getPublish())
        {
            returnval = "<p>"+getName() + " took the " +vaxname + " vaccine!!!</p>";        }
        return returnval;

    }


    
   public static String getFVHeader()
    {
     String returnval = "ID\tName\t\tVaccine";
     returnval+="\n---------------------------------";
     return returnval;
     
    }

    public String toString() {
        return getId()+(getPublish()?"*":"")+"\t"+getName()+"\t\t"+getVaxName();

    }





 

}
