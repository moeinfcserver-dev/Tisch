public class Tisch
{
    private String material;
    private int hoehe;
    private boolean ausziehbar;
    
    
    

    public Tisch(String material,int hoehe, boolean ausziehbar)
    {
        setMaterial(material);
        setHoehe(hoehe);
        setAusziehbar(ausziehbar);
        
    }
    
    public Tisch(int hoehe, boolean ausziehbar)
    {
        setMaterial("UNKN");
        setHoehe(hoehe);
        setAusziehbar(ausziehbar);
        
    }
    public Tisch( boolean ausziehbar)
    {
        setMaterial("UNKN");
        setHoehe(0);
        setAusziehbar(ausziehbar);
        
    }
    public Tisch()
    {
        setMaterial("UNKN");
        setHoehe(0);
        setAusziehbar(false);
        
    }

    public void setMaterial(String neuMaterial)
    {
        this.material = material;
    }
    public void setHoehe(int neuHoehe)
    {
        this.hoehe = hoehe;

    }
    public void setAusziehbar(boolean neuAusziehbar)
    {
        ausziehbar = neuAusziehbar;
    }

    public String getMaterial()
    {
        return material;
    }
    public int getHoehe()
    {
        return hoehe;
    }
    public boolean getAusziehbar()
    {
        return ausziehbar;
    }
        
   

}