import java.util.Scanner;
public class CO1
{
    public static void main(String[] args) 
    {
     Scanner sc = new Scanner(System.in);

     System.out.println("MUSIC PLAYLIST AND LISTEN STATS MANAGER");
        String songname;
        String artistname;
        double duration;
        int c;
        double time;

        System.out.print("ENTER THE SONG NAME=");
        songname=sc.nextLine();

        System.out.print("ENTER THE NAME OF THE ARTIST=");
        artistname=sc.nextLine();

        System.out.print("DURATION=");
        duration=sc.nextDouble();

        System.out.print("ENTER THE NUMBER OF TIMES THE SONG WAS REPLAYED= ");
         c=sc.nextInt();
         time=duration*c;
        System.out.println("*******Song Details*******");
        System.out.println("SONG= " + songname);
        System.out.println("ARTIST= " + artistname);
        System.out.println("DURATION= " + duration + " minutes");
        System.out.println("NO.OF TIMES REPLAYED= " +c);
        System.out.println("Total Listening Time= " + time + " mins");
    }
}


