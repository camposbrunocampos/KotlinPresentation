package skills.me.show.crazykotlin.models;

/**
 * Created by Reizinho on 29/03/17.
 */
public class AlphaBakery {
    private boolean hotBread;
    private boolean hotChocolate;
    private boolean hotMumu;
    private String name;
    private String code;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public boolean isHotMumu() {
        return hotMumu;
    }

    public void setHotMumu(boolean hotMumu) {
        this.hotMumu = hotMumu;
    }

    public boolean isHotChocolate() {
        return hotChocolate;
    }

    public void setHotChocolate(boolean hotChocolate) {
        this.hotChocolate = hotChocolate;
    }

    public boolean isHotBread() {
        return hotBread;
    }

    public void setHotBread(boolean hotBread) {
        this.hotBread = hotBread;
    }
}
