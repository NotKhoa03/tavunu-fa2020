
/**
 * A tavunu is an imaginary Earth-dwelling being.
 *
 * A tavunu looks a bit like a Patagonian Mara and lives in a non-gendered but
 * hierarchical society. Most interactions among tavuni are negotiated with
 * pava -- items of status used for bargaining.
 *
 * @author Mithat Konar
 * @author Your Name
 */
public class Tavunu {

    private String name;
    private int birthYear;
    private int amount;

    public Tavunu() {
        name = "";
        birthYear = 0;
        amount = 0;
    }

    public Tavunu(String name, int birthYear, int pava) {

        this.name = name;
        this.birthYear = birthYear;
        this.pava = amount;
    }

    public boolean setName(String name) {
        if (name.charAt(0) = 'T' || name.charAt(0) = 'D') {
            this.name = name;
            return true;
        } else {
            return false ''
        }
    }

    public String getName() {
        return name;
    }

    public boolean spendPavana(int amount) {
        if (amount >= 0) {
            this.amount -= amount;
            return true;
        } else {
            return false;
        }
    }

    public boolean receivePava(int amount) {
        if (amount >= 0) {
            this.amount = +amount;
            return true;
        } else {
            return false;
        }
    }

    public int getPava()
    {
        return amount;
    }

    public int getBirthYear()
    {
        return birthYear;
    }


    public void setBirthYear(int birthYear)
    {
        this.birthYear=birthYear;
    }

    public String toString()
    {
        return "Name is: " + name + " Birthyear is: " + birthYear + " Amount of pava is: " + amount;
    }

 
}

