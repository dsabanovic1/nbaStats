package helpers;

public class Helper {

    public static String  parseSeasonId(String seasonId){
        return seasonId.replace("-","");
    }
    public  static Integer typeOfDatagenerator(String typeOfData){
        switch(typeOfData){
            case "SeasonTotalsRegularSeason" : return 1;
            case "CareerTotalsRegularSeason" : return 2;
            case "SeasonTotalsPostSeason" : return 3;
            case "CareerTotalsPostSeason":return 4;
            case "SeasonTotalsAllStarSeason": return 5;
            case "CareerTotalsAllStarSeason":return 6;
            case "SeasonTotalsCollegeSeason" : return 7;
            case "CareerTotalsCollegeSeason":return 8;
            case "SeasonRankingsRegularSeason":return 9;
            case "SeasonRankingsPostSeason" :return 10;
        }
        return 0;
    }
}
