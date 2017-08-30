public class calanderprinter {
  public static void main (String[] args)
{
    
    int x=1;
    
    while(x<31)
    {
        System.out.println("September "+x);
        x++;
        
        if(x==2)
        {
            System.out.println("September 2 - WEEKEND");
            x++;
        }
    
        if(x==3)
        {
            System.out.println("September 3 - WEEKEND");
            x++;
        }
        
        if(x==4)
        {
            System.out.println("September 4 - NO SCHOOL (LABOR DAY)");
            x++;
        }
    
        if(x==9)
        {
            System.out.println("September 9 - WEEKEND");
            x++;
        }
    
        if(x==10)
        {
            System.out.println("September 10 - WEEKEND");
            x++;
        }
        
        if(x==16)
        {
            System.out.println("September 16 - WEEKEND");
            x++;
        }
    
        if(x==17)
        {
            System.out.println("September 17 - WEEKEND");
            x++;
        }
        
        if(x==22)
        {
            System.out.println("September 22 - END OF MARKING PERIOD");
            x++;
        }
    
        if(x==23)
        {
            System.out.println("September 23 - WEEKEND");
            x++;
        }
    
        if(x==24)
        {
            System.out.println("September 24 - WEEKEND");
            x++;
        }
        
        if(x==30)  
        {
            System.out.println("September 30 - WEEKEND");
            x++;
        }
        
        }
    }
}