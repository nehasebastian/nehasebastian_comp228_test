
     public class ComedyMovie extends Movie
    {
        String genre;
        ComedyMovie()
        {
            genre="Comedy Movie";
        }
        @Override
        public void setBudget(double budget) {

            this.budget=budget ;
        }

        @Override
        public String getGenre() {

            return genre;

        }
    }


