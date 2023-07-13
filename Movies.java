public class Movies {
    public static void main(String[] args) {
        String[] moviesIndi = { "Indiana Jones and the Kingdom of the Crystal Skull",
                "Indiana Jones and the Last Crusade", "Indiana Jones and the Temple of Doom" };
        String[][] actorsMovies = {
                { "Harrison Ford", "Cate Blanchett", "Luke Skywalker" },
                { "Harrison Ford", "Sean Connery", "Ondine Skywalker" },
                { "Harrison Ford", "Kate Capshaw", "Sacha Skywalker" },
        };
        for (int i = 0; i < moviesIndi.length; i++) {
            System.out.println("Dans le film est : " + moviesIndi[i] + " les acteurs sont : ");
            for (int j = 0; j < actorsMovies[i].length; j++) {
                System.out.println(" - " + actorsMovies[i][j]);
            }
            System.out.println();
        }
    }
}
