import javax.swing.*;

public class TestMovie {


    public static void main(String[] args) {


        Movie movie;
        String title,studio,leadActor,Sbudget,Syear;
        int year;
        double budget;
        JFrame frame= new JFrame("Input");
         /*String name=JOptionPane.showInputDialog(frame,"What is your name?");
        JOptionPane.showMessageDialog(frame, name);*/
        String c;
        while(true){
            c=JOptionPane.showInputDialog(frame,"Press 1 for Action Movie\nPress 2 for Comedy Movie");

            int i;
            i=Integer.parseInt(c);

            switch(i)
            {
                case 1:
                    movie= new ActionMovie();
                    JOptionPane.showMessageDialog(frame, "Enter the Details of the Movie");
                    title=JOptionPane.showInputDialog(frame,"Title of the Movie:");
                    movie.setTitle(title);
                    studio=JOptionPane.showInputDialog(frame,"Studio of the Movie:");
                    movie.setStudio(studio);
                    leadActor=JOptionPane.showInputDialog(frame,"Lead Actor of the Movie:");
                    movie.setLeadActor(leadActor);
                    Sbudget=JOptionPane.showInputDialog(frame,"Budget of the Movie:");
                    budget=Double.parseDouble(Sbudget);
                    movie.setBudget(budget);
                    Syear=JOptionPane.showInputDialog(frame,"Year of the Movie:");
                    year=Integer.parseInt(Syear);
                    movie.setYear(year);

                    JOptionPane.showMessageDialog(frame, movie.toString());
                    break;
                case 2:

                    movie= new ComedyMovie();
                    JOptionPane.showMessageDialog(frame, "Enter the Details of the Movie");
                    title=JOptionPane.showInputDialog(frame,"Title of the Movie:");
                    movie.setTitle(title);
                    studio=JOptionPane.showInputDialog(frame,"Studio of the Movie:");
                    movie.setStudio(studio);
                    leadActor=JOptionPane.showInputDialog(frame,"Lead Actor of the Movie:");
                    movie.setLeadActor(leadActor);
                    Sbudget=JOptionPane.showInputDialog(frame,"Budget of the Movie:");
                    budget=Double.parseDouble(Sbudget);
                    movie.setBudget(budget);
                    Syear=JOptionPane.showInputDialog(frame,"Year of the Movie:");
                    year=Integer.parseInt(Syear);
                    movie.setYear(year);

                    JOptionPane.showMessageDialog(frame, movie.toString()+"\n"+movie.getGenre());
                    break;


                default:
                    JOptionPane.showMessageDialog(frame, "Wrong value entered");
                    break;


            }
        }
    }

}

