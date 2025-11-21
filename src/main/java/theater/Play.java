package theater;

/**
 * Represents a play with a name and type.
 * Neither name nor type should be null.
 */
public class Play {

    private final String name;
    private final String type;

    /**
     * Constructs a play.
     *
     * @param name the name of the play; not null.
     * @param type the type of the play; not null.
     */

    public Play(String name, String type) {
        this.name = name;
        this.type = type;
    }

    /**
     * It is getting the name of the play.
     * @return the name of the play, never null.
     */
    public String getName() {
        return name;
    }

    /**
     * It is getting the type of the play.
     * @return the type of the play; never null.
     */
    public String getType() {
        return type;
    }
}
