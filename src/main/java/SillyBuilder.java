public class SillyBuilder {
    private String name;
    private int number;
    private String new_silly;

    public SillyBuilder setName(String name) {
        this.name = name;
        return this;
    }

    public SillyBuilder setNumber(int number) {
        this.number = number;
        return this;
    }

    public SillyBuilder setNew_silly(String new_silly) {
        this.new_silly = new_silly;
        return this;
    }

    public Silly createSilly() {
        return new Silly(name);
    }
}