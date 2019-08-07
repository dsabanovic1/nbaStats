package models;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import database.Database;
import helpers.Helper;
import org.apache.http.HttpEntity;
import org.apache.http.HttpResponse;
import org.apache.http.client.HttpClient;
import org.apache.http.client.methods.HttpGet;
import org.apache.http.impl.client.HttpClientBuilder;
import org.jboss.resteasy.client.jaxrs.ResteasyClient;
import org.jboss.resteasy.client.jaxrs.ResteasyClientBuilder;
import org.jboss.resteasy.client.jaxrs.ResteasyWebTarget;
import org.json.JSONArray;
import org.json.JSONObject;

import javax.ws.rs.core.Response;
import java.io.BufferedReader;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;


@JsonIgnoreProperties(ignoreUnknown = true)
public class PlayerCareerStats {

    @JsonProperty("PLAYER_ID")
    Integer playerId;
    @JsonProperty("SEASON_ID")
    String seasonId;
    @JsonProperty("LEAGUE_ID")
    Integer leagueId;
    @JsonProperty("TEAM_ID")
    Integer teamId;
    @JsonProperty("ORGANIZATION_ID")
    Integer organizationId;
    @JsonProperty("TEAM_ABBREVIATION")
    String teamAbbreviation;
    @JsonProperty("PLAYER_AGE")
    String playerAge;
    @JsonProperty("GP")
    String gamesPlayed;
    @JsonProperty("GS")
    String gamesStarted;
    @JsonProperty("MIN")
    Float min;
    @JsonProperty("FGM")
    Integer fgm;
    @JsonProperty("FGA")
    Integer fga;
    @JsonProperty("FG_PCT")
    Float fgPct;
    @JsonProperty("FG3M")
    Integer fg3M;
    @JsonProperty("FG3A")
    Integer fg3A;
    @JsonProperty("FG3_PCT")
    Float fg3Pct;
    @JsonProperty("FTM")
    Integer ftm;
    @JsonProperty("FTA")
    Integer fta;
    @JsonProperty("FT_PCT")
    Float ftPct;
    @JsonProperty("OREB")
    Integer oreb;
    @JsonProperty("DREB")
    Integer dreb;
    @JsonProperty("REB")
    Integer reb;
    @JsonProperty("AST")
    Integer ast;
    @JsonProperty("STL")
    Integer stl;
    @JsonProperty("BLK")
    Integer blk;
    @JsonProperty("TOV")
    Integer tov;
    @JsonProperty("PF")
    Integer pf;
    @JsonProperty("PTS")
    Integer pts;
    @JsonProperty("SCHOOL_NAME")
    String schoolName;
    @JsonProperty("RANK_MIN")
    Integer rankMin;
    @JsonProperty("RANK_FGM")
    Integer rankFgm;
    @JsonProperty("RANK_FGA")
    Integer rankFga;
    @JsonProperty("RANK_FG_PCT")
    Integer rankFgPct;
    @JsonProperty("RANK_FG3M")
    Integer rankFg3m;
    @JsonProperty("RANK_FG3A")
    Integer rankFg3a;
    @JsonProperty("RANK_FG3_PCT")
    Integer rankFg3Pct;
    @JsonProperty("RANK_FTM")
    Integer rankFtm;
    @JsonProperty("RANK_FTA")
    Integer rankFta;
    @JsonProperty("RANK_FT_PCT")
    Integer rankFtPct;
    @JsonProperty("RANK_OREB")
    Integer rankOreb;
    @JsonProperty("RANK_DREB")
    Integer rankDreb;
    @JsonProperty("RANK_REB")
    Integer rankReb;
    @JsonProperty("RANK_AST")
    Integer rankAst;
    @JsonProperty("RANK_STL")
    Integer rankStl;
    @JsonProperty("RANK_BLK")
    Integer rankBlk;
    @JsonProperty("RANK_TOV")
    Integer rankTov;
    @JsonProperty("RANK_PTS")
    Integer rankPts;
    @JsonProperty("RANK_EFF")
    Integer rankEff;
    @JsonProperty
    String typeOfData;
    @JsonProperty
    String playerCareerStatsID;
    @JsonProperty
    Long created;
    @JsonProperty
    Long modified;

    public String getPlayerCareerStatsID() {
        return playerCareerStatsID;
    }

    public void setPlayerCareerStatsID(String playerCareerStatsID) {
        this.playerCareerStatsID = playerCareerStatsID;
    }

    public Integer getRankStl() {
        return rankStl;
    }

    public void setRankStl(Integer rankStl) {
        this.rankStl = rankStl;
    }

    public Integer getPlayerId() {
        return playerId;
    }

    public void setPlayerId(Integer playerId) {
        this.playerId = playerId;
    }

    public String  getSeasonId() {
        return seasonId;
    }

    public void setSeasonId(String seasonId) {
        this.seasonId = seasonId;
    }

    public Integer getLeagueId() {
        return leagueId;
    }

    public void setLeagueId(Integer leagueId) {
        this.leagueId = leagueId;
    }

    public Integer getTeamId() {
        return teamId;
    }

    public void setTeamId(Integer teamId) {
        this.teamId = teamId;
    }


    public String getTeamAbbreviation() {
        return teamAbbreviation;
    }

    public void setTeamAbbreviation(String teamAbbreviation) {
        this.teamAbbreviation = teamAbbreviation;
    }

    public String getPlayerAge() {
        return playerAge;
    }

    public void setPlayerAge(String playerAge) {
        this.playerAge = playerAge;
    }

    public String getGamesPlayed() {
        return gamesPlayed;
    }

    public void setGamesPlayed(String gamesPlayed) {
        this.gamesPlayed = gamesPlayed;
    }

    public String getGamesStarted() {
        return gamesStarted;
    }

    public void setGamesStarted(String gamesStarted) {
        this.gamesStarted = gamesStarted;
    }

    public Float getMin() {
        return min;
    }

    public void setMin(Float min) {
        this.min = min;
    }

    public Integer getFgm() {
        return fgm;
    }

    public void setFgm(Integer fgm) {
        this.fgm = fgm;
    }

    public Integer getFga() {
        return fga;
    }

    public void setFga(Integer fga) {
        this.fga = fga;
    }

    public Float getFgPct() {
        return fgPct;
    }

    public void setFgPct(Float fgPct) {
        this.fgPct = fgPct;
    }

    public Integer getFg3M() {
        return fg3M;
    }

    public void setFg3M(Integer fg3M) {
        this.fg3M = fg3M;
    }

    public Integer getFg3A() {
        return fg3A;
    }

    public void setFg3A(Integer fg3A) {
        this.fg3A = fg3A;
    }

    public Float getFg3Pct() {
        return fg3Pct;
    }

    public void setFg3Pct(Float fg3Pct) {
        this.fg3Pct = fg3Pct;
    }

    public Integer getFtm() {
        return ftm;
    }

    public void setFtm(Integer ftm) {
        this.ftm = ftm;
    }

    public Integer getFta() {
        return fta;
    }

    public void setFta(Integer fta) {
        this.fta = fta;
    }

    public Float getFtPct() {
        return ftPct;
    }

    public void setFtPct(Float ftPct) {
        this.ftPct = ftPct;
    }

    public Integer getOreb() {
        return oreb;
    }

    public void setOreb(Integer oreb) {
        this.oreb = oreb;
    }

    public Integer getDreb() {
        return dreb;
    }

    public void setDreb(Integer dreb) {
        this.dreb = dreb;
    }

    public Integer getReb() {
        return reb;
    }

    public void setReb(Integer reb) {
        this.reb = reb;
    }

    public Integer getAst() {
        return ast;
    }

    public void setAst(Integer ast) {
        this.ast = ast;
    }

    public Integer getStl() {
        return stl;
    }

    public void setStl(Integer stl) {
        this.stl = stl;
    }

    public Integer getBlk() {
        return blk;
    }

    public void setBlk(Integer blk) {
        this.blk = blk;
    }

    public Integer getTov() {
        return tov;
    }

    public void setTov(Integer tov) {
        this.tov = tov;
    }

    public Integer getPf() {
        return pf;
    }

    public void setPf(Integer pf) {
        this.pf = pf;
    }

    public Integer getPts() {
        return pts;
    }

    public void setPts(Integer pts) {
        this.pts = pts;
    }

    public Long getCreated() {
        return created;
    }

    public void setCreated(Long created) {
        this.created = created;
    }

    public Long getModified() {
        return modified;
    }

    public void setModified(Long modified) {
        this.modified = modified;
    }

    public String getTypeOfData() {
        return typeOfData;
    }

    public void setTypeOfData(String typeOfData) {
        this.typeOfData = typeOfData;
    }

    public Integer getOrganizationId() {
        return organizationId;
    }

    public void setOrganizationId(Integer organizationId) {
        this.organizationId = organizationId;
    }

    public String getSchoolName() {
        return schoolName;
    }

    public void setSchoolName(String schoolName) {
        this.schoolName = schoolName;
    }

    public Integer getRankMin() {
        return rankMin;
    }

    public void setRankMin(Integer rankMin) {
        this.rankMin = rankMin;
    }

    public Integer getRankFgm() {
        return rankFgm;
    }

    public void setRankFgm(Integer rankFgm) {
        this.rankFgm = rankFgm;
    }

    public Integer getRankFga() {
        return rankFga;
    }

    public void setRankFga(Integer rankFga) {
        this.rankFga = rankFga;
    }

    public Integer getRankFgPct() {
        return rankFgPct;
    }

    public void setRankFgPct(Integer rankFgPct) {
        this.rankFgPct = rankFgPct;
    }

    public Integer getRankFg3m() {
        return rankFg3m;
    }

    public void setRankFg3m(Integer rankFg3m) {
        this.rankFg3m = rankFg3m;
    }

    public Integer getRankFg3a() {
        return rankFg3a;
    }

    public void setRankFg3a(Integer rankFg3a) {
        this.rankFg3a = rankFg3a;
    }

    public Integer getRankFg3Pct() {
        return rankFg3Pct;
    }

    public void setRankFg3Pct(Integer rankFg3Pct) {
        this.rankFg3Pct = rankFg3Pct;
    }

    public Integer getRankFtm() {
        return rankFtm;
    }

    public void setRankFtm(Integer rankFtm) {
        this.rankFtm = rankFtm;
    }

    public Integer getRankFta() {
        return rankFta;
    }

    public void setRankFta(Integer rankFta) {
        this.rankFta = rankFta;
    }

    public Integer getRankFtPct() {
        return rankFtPct;
    }

    public void setRankFtPct(Integer ranFtaPct) {
        this.rankFtPct = ranFtaPct;
    }

    public Integer getRankOreb() {
        return rankOreb;
    }

    public void setRankOreb(Integer rankOreb) {
        this.rankOreb = rankOreb;
    }

    public Integer getRankDreb() {
        return rankDreb;
    }

    public void setRankDreb(Integer rankDreb) {
        this.rankDreb = rankDreb;
    }

    public Integer getRankReb() {
        return rankReb;
    }

    public void setRankReb(Integer rankReb) {
        this.rankReb = rankReb;
    }

    public Integer getRankAst() {
        return rankAst;
    }

    public void setRankAst(Integer rankAst) {
        this.rankAst = rankAst;
    }

    public Integer getRankBlk() {
        return rankBlk;
    }

    public void setRankBlk(Integer rankBlk) {
        this.rankBlk = rankBlk;
    }

    public Integer getRankTov() {
        return rankTov;
    }

    public void setRankTov(Integer rankTov) {
        this.rankTov = rankTov;
    }

    public Integer getRankPts() {
        return rankPts;
    }

    public void setRankPts(Integer rankPts) {
        this.rankPts = rankPts;
    }

    public Integer getRankEff() {
        return rankEff;
    }

    public void setRankEff(Integer rankEff) {
        this.rankEff = rankEff;
    }

    public static void addSeasonTotalStats(ArrayList<PlayerCareerStats> playerCareerStatsArrayList)throws ClassNotFoundException, SQLException, JsonProcessingException
    {   String seasonId = "";
        Connection c= Database.getConnection();
        c.setAutoCommit(false);
        PreparedStatement ps =
                Database.prepareStatement("INSERT INTO nba.playerCareerStats (playerId, seasonId, leagueId," +
                                                                  "teamId, teamAbbreviation,playerAge,gamesPlayed,gamesStarted,minimum," +
                                                                  "fgm,fga,fgPct,fg3m,fg3a,fg3Pct, ftm, fta, ftPct, oreb, dreb, reb," +
                                                                  " ast, stl, blk, tov, pf, pts,typeOfData,rankMin,rankFgm,rankFga," +
                                                                  "rankFgPct,rankFg3m,rankFg3a,rankFg3Pct,rankFtm,rankFta,rankFtPct," +
                                                                  "rankOreb,rankDreb,rankReb,rankAst,rankStl,rankBlk,rankTov,rankPts," +
                                                                    "rankEff,organizationId,schoolName, created, modified,playerCareerStatsId) " +
                                                                  "VALUES(?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?," +
                                                                  "?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?)");
        for (PlayerCareerStats playerCareerStats:playerCareerStatsArrayList) {
            if(playerCareerStats.getSeasonId()==null) {seasonId="0";}
            else {seasonId = Helper.parseSeasonId(playerCareerStats.getSeasonId());}
            String id = Database.generatorId(playerCareerStats.getPlayerId(),seasonId,playerCareerStats.getTypeOfData());
            //String id = RandomStringUtils.randomNumeric(10);
            if(playerCareerStats.getPlayerId()==null)
            {
                ps.setInt(1, 0);
            }
            else{ps.setInt(1,playerCareerStats.getPlayerId());}
            if(playerCareerStats.getSeasonId()==null){
                ps.setString(2, "0");
            }
            else{ps.setString(2,playerCareerStats.getSeasonId());}
            if(playerCareerStats.getLeagueId()==null){
                ps.setInt(3, 0);
            }
            else{ps.setInt(3,playerCareerStats.getLeagueId());}
            if(playerCareerStats.getTeamId()==null){
                ps.setInt(4, 0);
            }
            else{ps.setInt(4,playerCareerStats.getTeamId());}
            if(playerCareerStats.getTeamAbbreviation()==null){
              ps.setString(5, null);

            }
            else{ps.setString(5,playerCareerStats.getTeamAbbreviation());}
            if(playerCareerStats.getPlayerAge()==null){
                ps.setString(6, "0");
            }
            else{ps.setString(6,playerCareerStats.getPlayerAge());}
            if(playerCareerStats.getGamesPlayed()==null){
                ps.setString(7, "0");
            }
            else{ps.setString(7,playerCareerStats.getGamesPlayed());}
            if(playerCareerStats.getGamesStarted()==null){
                ps.setString(8,"0");
            }
            else{ps.setString(8, playerCareerStats.getGamesStarted());}
            if(playerCareerStats.getMin()==null){
                ps.setFloat(9,0);
            }
            else{ps.setFloat(9, playerCareerStats.getMin());}
            if(playerCareerStats.getFgm()==null){
                ps.setInt(10, 0);
            }
            else{ps.setInt(10, playerCareerStats.getFgm());}
            if(playerCareerStats.getFga()==null){
                ps.setInt(11, 0);
            }
            else{ps.setInt(11, playerCareerStats.getFga());}
            if(playerCareerStats.getFgPct()==null){
                ps.setFloat(12, 0);
            }
            else{ps.setFloat(12, playerCareerStats.getFgPct());}
            if(playerCareerStats.getFg3M()==null){
                ps.setInt(13, 0);
            }
            else{ps.setInt(13, playerCareerStats.getFg3M());}
            if(playerCareerStats.getFg3A()==null){
                ps.setInt(14, 0);
            }
            else{ps.setInt(14, playerCareerStats.getFg3A());}
            if(playerCareerStats.getFg3Pct()==null){
                ps.setFloat(15, 0);
            }
            else{ps.setFloat(15, playerCareerStats.getFg3Pct());}
            if(playerCareerStats.getFtm()==null){
                ps.setInt(16, 0);
            }
            else{ps.setInt(16, playerCareerStats.getFtm());}
            if(playerCareerStats.getFta()==null){
                ps.setInt(17, 0);
            }
            else{ps.setInt(17, playerCareerStats.getFta());}
            if(playerCareerStats.getFtPct()==null){
                ps.setFloat(18, 0);
            }
            else{ps.setFloat(18, playerCareerStats.getFtPct());}
            if(playerCareerStats.getOreb()==null){
                ps.setInt(19, 0);
            }
            else{ps.setInt(19, playerCareerStats.getOreb());}
            if(playerCareerStats.getDreb()==null){
                ps.setInt(20, 0);
            }
            else{ps.setInt(20, playerCareerStats.getDreb());}
            if(playerCareerStats.getReb()==null){
                ps.setInt(21, 0);
            }
            else {ps.setInt(21, playerCareerStats.getReb());}
            if(playerCareerStats.getAst()==null){
                ps.setInt(22, 0);
            }
            else{ps.setInt(22, playerCareerStats.getAst());}
            if(playerCareerStats.getStl()==null){
                ps.setInt(23, 0);
            }
            else{ps.setInt(23, playerCareerStats.getStl());}
            if(playerCareerStats.getBlk()==null){
                ps.setInt(24, 0);
            }
            else{ps.setInt(24, playerCareerStats.getBlk());}
            if(playerCareerStats.getTov()==null){
                ps.setInt(25, 0);
            }
            else{ps.setInt(25, playerCareerStats.getTov());}
            if(playerCareerStats.getPf()==null){
                ps.setInt(26, 0);
            }else{
                ps.setInt(26, playerCareerStats.getPf());}
            if(playerCareerStats.getPts()==null){
                ps.setInt(27, 0);
            }else{
                ps.setInt(27, playerCareerStats.getPts());}
            if(playerCareerStats.getTypeOfData()==null){
                ps.setString(28, "0");
            }else{ps.setString(28, playerCareerStats.getTypeOfData());}

            if(playerCareerStats.getRankMin()==null){
                ps.setInt(29, 0);
            }else{ps.setInt(29, playerCareerStats.getRankMin());}

            if(playerCareerStats.getRankFgm()==null){
                ps.setInt(30,0);
            }else{ps.setInt(30,playerCareerStats.getRankFgm());}

            if(playerCareerStats.getRankFga()==null){
                ps.setInt(31,0);
            }else{ps.setInt(31,playerCareerStats.getRankFga());}

            if(playerCareerStats.getRankFgPct()==null){
                ps.setInt(32,0);
            }else{ps.setInt(32,playerCareerStats.getRankFgPct());}

            if(playerCareerStats.getRankFg3m()==null){
                ps.setInt(33,0);
            }else{ps.setInt(33,playerCareerStats.getRankFg3m());}

            if(playerCareerStats.getRankFg3a()==null){
                ps.setInt(34,0);
            }else{ps.setInt(34,playerCareerStats.getRankFg3a());}

            if(playerCareerStats.getRankFg3Pct()==null){
                ps.setInt(35,0);
            }else{ps.setInt(35,playerCareerStats.getRankFg3Pct());}

            if(playerCareerStats.getRankFtm()==null){
                ps.setInt(36,0);
            }else{
                ps.setInt(36,playerCareerStats.getRankFtm());
            }

            if(playerCareerStats.getRankFta()==null){
                ps.setInt(37,0);
            }else{ps.setInt(37,playerCareerStats.getRankFta());}

            if(playerCareerStats.getRankFtPct()==null){
                ps.setInt(38,0);
            }else{ps.setInt(38,playerCareerStats.getRankFtPct());}

            if(playerCareerStats.getRankOreb()==null){
                ps.setInt(39,0);
            }else{ps.setInt(39,playerCareerStats.getRankOreb());}

            if(playerCareerStats.getRankDreb()==null){
                ps.setInt(40,0);
            }else{ps.setInt(40,playerCareerStats.getRankDreb());}

            if(playerCareerStats.getRankReb()==null){
                ps.setInt(41,0);
            }else{ps.setInt(41,playerCareerStats.getRankReb());}

            if(playerCareerStats.getRankAst()==null){
                ps.setInt(42,0);
            }else{ps.setInt(42,playerCareerStats.getRankAst());}

            if(playerCareerStats.getRankStl()==null){
                ps.setInt(43,0);
            }else{ps.setInt(43,playerCareerStats.getRankStl());}

            if(playerCareerStats.getRankBlk()==null){
                ps.setInt(44,0);
            }else{ps.setInt(44,playerCareerStats.getRankBlk());}

            if(playerCareerStats.getRankTov()==null){
                ps.setInt(45,0);
            }else{ps.setInt(45,playerCareerStats.getRankTov());}

            if(playerCareerStats.getRankPts()==null){
                ps.setInt(46,0);
            }else{ps.setInt(46,playerCareerStats.getRankPts());}

            if(playerCareerStats.getRankEff()==null){
                ps.setInt(47,0);
            }else{ps.setInt(47,playerCareerStats.getRankEff());}

            if(playerCareerStats.getOrganizationId()==null){
                ps.setInt(48,0);
            }else{ps.setInt(48,playerCareerStats.getOrganizationId());}
            String string = null;
            if(playerCareerStats.getSchoolName() == null){
                ps.setString(49,"0");
            }else{ps.setString(49,playerCareerStats.getSchoolName());}

            ps.setLong(50,System.currentTimeMillis());
            ps.setLong(51,System.currentTimeMillis());
            ps.setString(52,id);
            ps.addBatch();
        }

        int[] results = ps.executeBatch();
        c.commit();
        //ps.executeUpdate();
        ps.close();
        c.close();
    }
    public static void FetchDataFromApi (String perMode, Integer playerId){
        try {

            ResteasyClient client = new ResteasyClientBuilder().build();
            StringBuilder uri = new StringBuilder("https://stats.nba.com/stats/playercareerstats?");
            uri.append("PerMode=");
            uri.append(perMode);
            uri.append("&PlayerID=");
            uri.append(playerId);
            //ResteasyWebTarget target = client.target(uri.toString());
            ResteasyWebTarget target = client.target("https://stats.nba.com/stats/playercareerstats?PerMode=Totals&PlayerID=1627826");

            Response response = target.request().get();
            System.out.println(response.getMediaType().getSubtype());
            if(!response.getMediaType().getSubtype().equals("json"))
            {
                throw new Exception("The fetched file is not valid(json).");
            }
            JSONObject obj = new JSONObject(response.readEntity(String.class));
            JSONArray resultSets = obj.getJSONArray("resultSets");

            ArrayList<PlayerCareerStats> playerCareerStatsList = new ArrayList<>();
            for (int i = 0; i < resultSets.length(); i++) //loop through result sets
            {
                JSONObject obj1 = resultSets.getJSONObject(i);
                JSONArray rowSet = obj1.getJSONArray("rowSet");
                JSONArray headers = obj1.getJSONArray("headers");
                String dataType = obj1.getString("name");
                //loop thgrough rowset and make list which we are insert into database.
                for (int j = 0; j < rowSet.length(); j++) {
                    JSONArray data = rowSet.getJSONArray(j);
                    JSONObject obj2 = data.toJSONObject(headers);
                    ObjectMapper m = new ObjectMapper();
                    PlayerCareerStats playerCareerStats = m.readValue(obj2.toString(), PlayerCareerStats.class);
                    playerCareerStats.setTypeOfData(dataType);
                    playerCareerStatsList.add(playerCareerStats);
                }


            }
            response.close();
            PlayerCareerStats.addSeasonTotalStats(playerCareerStatsList);
        }catch (Exception e){
            e.printStackTrace();
        }
    }
    public static void fetchData(String perMode,Integer playerId){
        ScheduledExecutorService ses = Executors.newSingleThreadScheduledExecutor();
        ses.scheduleAtFixedRate(new Runnable() {
            @Override
            public void run() {
                FetchDataFromApi(perMode,playerId);
            }
        }, 2, 10, TimeUnit.SECONDS);

    }
    public static List<PlayerCareerStats> getPlayerCareerStats(Integer playerId)throws ClassNotFoundException,SQLException{
        PreparedStatement ps =Database.prepareStatement("SELECT * FROM nba.playerCareerStats WHERE playerId = ?");
        ps.setInt(1,playerId);
        ResultSet rs = ps.executeQuery();
        List<PlayerCareerStats> pcsList =new ArrayList<>();
        while(rs.next()){
            PlayerCareerStats playerCareerStats = new PlayerCareerStats();
            playerCareerStats.setPlayerId(rs.getInt("playerId"));
            playerCareerStats.setAst(rs.getInt("ast"));
            pcsList.add(playerCareerStats);
            //unfinished method, i have to add code for fetching all attributes
        }
            return pcsList;
    }
   /* public static List<Integer> getPlayersIdFromApi(){
        ResteasyClient client = new ResteasyClientBuilder().build();
        ResteasyWebTarget target = client.target("https://raw.githubusercontent.com/bttmly/nba/master/data/players.json");
        Response response = target.request().get();
        ArrayList<Integer> playerIdList = new ArrayList<>();
        //JSONObject object = new JSONObject(response.readEntity(String.class));
        JSONArray array = new JSONArray(response.readEntity(String.class));
        for(int i =0;i<array.length();i++){
            JSONObject obj = array.getJSONObject(i);
            Integer playerId = obj.getInt("playerId");
            playerIdList.add(playerId);
        }
        return playerIdList;
    }
*/
    public static List<Integer> getPlayersIdFromApi(){
        ArrayList<Integer> playerIdList = new ArrayList<>();
        try {
            HttpClient client = HttpClientBuilder.create().build();
           HttpGet request = new HttpGet("https://raw.githubusercontent.com/bttmly/nba/master/data/players.json");
            HttpResponse response = client.execute(request);
            HttpEntity entity = response.getEntity();

            if (entity == null) throw new Exception("Entity is null") ;

                try (InputStream stream = entity.getContent()) {
                    BufferedReader reader =
                            new BufferedReader(new InputStreamReader(stream));
                    String line;
                    StringBuffer buffer = new StringBuffer();
                    while ((line = reader.readLine()) != null) {
                        buffer.append(line);
                    }
                    JSONArray array = new JSONArray(buffer.toString());
                    for(int i = 0; i<array.length();i++){
                        playerIdList.add(array.getJSONObject(i).getInt("playerId"));
                    }

                }

        } catch (Exception e) {
            e.printStackTrace();
        }
        return playerIdList;
    }



}
