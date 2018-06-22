abstract class Movie
{
        String title;
        String studio;
        String leadActor;
        double budget;
        int year;

        Movie()
        {
        title="";
        studio="";
        leadActor="";
        budget=0.0;
        year=0;
        }
public String getTitle()
        {
        return title;
        }
public String getStudio()
        {
        return studio;
        }
public String getLeadActor()
        {
        return leadActor;
        }
public int getYear()
        {
        return year;
        }
public void setTitle(String t)
        {
        title=t;
        }
public void setStudio(String s)
        {
        studio=s;
        }
public void setLeadActor(String l)
        {
        leadActor=l;
        }
public void setYear(int y)
        {
        year=y;
        }
@Override
public String toString()
        {
        return " Title:" + getTitle() + "\n Studio:" + getStudio() + "\n LeadActor:" + getLeadActor() + " \nBudget:" + budget + "\n Year:" + year;
        }
abstract public void setBudget(double budget);
abstract public String getGenre();

        }

