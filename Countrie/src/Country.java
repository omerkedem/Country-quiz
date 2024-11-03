public class Country {
    private String name;
    private int pop;
    private  boolean IsIsland;
    private String continent;


    public Country(String name,int pop,boolean IsIsland,String continent)
    {
        this.name = name;
        this.pop = pop;
        this.IsIsland = IsIsland;
        this.continent = continent;
    }
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getPop() {
        return pop;
    }

    public void setPop(int pop) {
        this.pop = pop;
    }

    public boolean isIsland() {
        return IsIsland;
    }

    public void setIsland(boolean island) {
        IsIsland = island;
    }

    public String getContinent() {
        return continent;
    }

    public void setContinent(String continent) {
        this.continent = continent;
    }
}
