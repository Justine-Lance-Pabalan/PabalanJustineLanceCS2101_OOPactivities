public class ArtistDemo {
    public static void main(String[] args) {
        Artist artist = new Artist("Charlie Puth", "American", 32, "Music");
        artist.displayInfo();

        System.out.println();

        Singer singer = new Singer("Nayeon Im", "Korean", 29, "Music", Genre.POP);
        singer.displayInfo();

        Dancer dancer = new Dancer("Misty Copeland", "American", 42, "Dance", DanceStyle.BALLET);
        dancer.displayInfo();

        Painter painter = new Painter("Gerhard Richter", "German", 92, "Painting", Medium.OIL);
        painter.displayInfo();

        Writer writer = new Writer("Miguel Syjuco", "Filipino", 46, "Writing", WritingStyle.FICTION);
        writer.displayInfo();
    }
}
