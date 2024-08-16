public class Program5{
    public static void main(String[] args){
        System.out.println("Mushroom Cup Prix Racer Average Miles/Per Gallon:\n");
        int royaleMiles = 286;
        int royaleGallons = 9;
        double average = (double) royaleMiles / royaleGallons;
        average = average * 10;
        average = Math.round(average);
        average = average / 10;
        System.out.println("Royale averaged " + average + " m/g\n");
        
        int koopaKingMiles = 412;
        int koopaKingGallons = 40;
        average = (double) koopaKingMiles / koopaKingGallons;
        average = average * 10;
        average = Math.round(average);
        average = average / 10;
        System.out.println("Koopa King averaged " + average + " m/g\n");
        
        int pipeFrameMiles = 361;
        int pipeFrameGallons = 18;
        average = (double) pipeFrameMiles / pipeFrameGallons;
        average = average * 10;
        average = Math.round(average);
        average = average / 10;
        System.out.println("Pipe Frame averaged " + average + " m/g\n");
        
        int badwagonMiles = 161;
        int badwagonGallons = 11;
        average = (double) badwagonMiles / badwagonGallons;
        average = average * 10;
        average = Math.round(average);
        average = average / 10;
        System.out.println("Badwagon averaged " + average + " m/g");
        
    }
}

//Paste console output below:
/*
Mushroom Cup Prix Racer Average Miles/Per Gallon:

Royale averaged 31.8 m/g

Koopa King averaged 10.3 m/g

Pipe Frame averaged 20.1 m/g

Badwagon averaged 14.6 m/g


*/
