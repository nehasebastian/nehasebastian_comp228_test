 public class ActionMovie extends Movie {


        String genre;
        ActionMovie() {genre= "Action Movie";}




        @Override
        public void setBudget(double budget) {

        this.budget=budget + (0.1*budget);
    }

        @Override
        public String getGenre() {
        return genre;
    }

    }




