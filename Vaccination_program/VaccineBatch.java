 

import java.util.ArrayList;
import java.util.Scanner;
import java.io.File;
import java.io.IOException;

public class VaccineBatch {
    private int size;
    private int balance=0;
    private String name;
    private int preference;
    private ArrayList<String> contras;
    
    public VaccineBatch( String name,int size,  int preference, String contraIndicators)
    {
        this.size = size;
        this.balance = size;
        this.preference = preference;
        this.name = name;
        Scanner stringScan = new Scanner(contraIndicators);
        contras = new ArrayList<String>();
        stringScan.useDelimiter(",");
        while (stringScan.hasNext())
           contras.add(stringScan.next());
        
    }
    
    public int getSize()
    {
        return size;
    }
    public int getBalance()
    {
        return balance;
    }
    
    public int getPreference()
    {
        return preference;
    }
    public String getName()
    {
        return name;
    }
    
    public String getContras()
    {
       String returnval="";
       for (int i=0; i<contras.size();i++)
       {
          returnval+=contras.get(i);
          if (i<contras.size()-1)
             returnval+=",";
          
        }
       return returnval;  
    }

    public static String getVBHeader()
    {
     String returnval = "Name\tSize\tBalance\tPreference\tContraIndicators";
     returnval+="\n---------------------------------";
     return returnval;
     
    }

        

        
    
    public boolean contraImpact(ArrayList<String> comorbs)
    {
        boolean found = false;
        int i =0;
        while((!found)&&(i<contras.size()))
        {
            int j=0;
            while ((!found)&&(j<comorbs.size()))
            {
                if (contras.get(i).equals(comorbs.get(j)))
                    found=true;
                else
                    j++;
            }
            i++;
        }
        return found;
    }
    
    //public int compareTo(VaccineBatch other)
    //{
    //    return other.preference-this.preference ;  
    //}
    
    public void reduceBalance()
    {
        
       balance--;   
    }

    public String toString() {
        return getName() + "\t"+getSize()+"\t"+getBalance()+"\t"+getPreference()+"\t"+getContras();
    }


    

}
